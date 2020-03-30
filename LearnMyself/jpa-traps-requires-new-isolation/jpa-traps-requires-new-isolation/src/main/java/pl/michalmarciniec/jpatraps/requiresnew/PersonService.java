package pl.michalmarciniec.jpatraps.requiresnew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.math.BigDecimal;

@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final WalletService walletService;

    @Autowired
    @PersistenceContext
    private transient EntityManager entityManager;

    @Autowired
    public PersonService(PersonRepository personRepository, WalletService walletService) {
        this.personRepository = personRepository;
        this.walletService = walletService;
    }

    // neu ko co  @Transactional(propagation = Propagation.REQUIRES_NEW)
    // thì wallet và person đều dc quản lý bởi @Transactional (bên dưới)
    // nên khi kêt thúc method createPerson mới save cả 2
    // turuongf hợp có  @Transactional(propagation = Propagation.REQUIRES_NEW)
    // save wallet tai ket thuc method createWalletAndAttachToPerson
    // save person trong db tai ket thuc method createPerson
    @Transactional
    public long createPerson(String name) {
        Person person = new Person(name);
        personRepository.save(person);

        walletService.createWalletAndAttachToPerson(person);

        return person.getId();
    }

    @Transactional
    public long createPerson2(String name) {
        Person person = new Person(name);
        personRepository.save(person);

        walletService.createWalletAndAttachToPerson2(person.getId());

        return person.getId();
    }
    @Transactional
    public long createPerson3(String name, BigDecimal money) {
        Person person = new Person(name);
        personRepository.save(person);

        Wallet wallet = walletService.createWallet3();

        /// wallet se khong dc set money boi vi nó đả dc quản lý bởi 1 transactional khác (REQUIRES_NEW)
        /// cho nên sẽ ko thể thấy dc sự thay đổi data này
        wallet.setAmount(money);
        person.setWallet(wallet);

        return person.getId();
    }

    /// ROLLBACK
    // neu khong có   @Transactional(propagation = Propagation.REQUIRES_NEW)
    // sẽ rollback dử liệu dc vì nằm trong 1 transaction

    @Transactional
    public long createPerson4(String name, BigDecimal money) {
        Person person = new Person(name);
        personRepository.save(person);

        Wallet wallet = walletService.createWallet4(money);
        if (wallet.getAmount().compareTo(BigDecimal.ZERO) < 0) {
            throw new RuntimeException("Initial amount of money cannot be less than zero");
        }

        person.setWallet(wallet);
        return person.getId();
    }

//    @Transactional
//    public void changeName4(String name) {
//        Person user = personRepository.(id);
//        user.setName(name);
//
//        if (StringUtils.isNotEmpty(name)) {
//            userRepository.save(user);
//        }
//    }
// entityManager.getTransaction().begin(); // Remove the transaction code. Spring already managed your transaction and entity manager
  // day là 1 transactional khác , khi bạn sử dụng spring thì có transaction của spring rồi (quản lý bởi spring)


    @Transactional
    public long createPerson5(String name, BigDecimal money) {
      //  EntityManager em = entityManager.createEntityManager();
       entityManager.getTransaction().begin(); // Remove the transaction code. Spring already managed your transaction and entity manager

      Person person =  personRepository.findByName("khoa2");
      person.getWallet().setAmount(new BigDecimal(4.55));
      //  entityManager.persist(person);
     // person.setName("khoa2");
       entityManager.getTransaction().commit();
        return 4;
    }

     @javax.transaction.Transactional
    public long createPerson6(String name, BigDecimal money) {
        //  EntityManager em = entityManager.createEntityManager();
       // entityManager.getTransaction().begin(); // Remove the transaction code. Spring already managed your transaction and entity manager
        Person person =  personRepository.findByName("khoa2");
        person.getWallet().setAmount(new BigDecimal(4.55));
        //  entityManager.persist(person);
        // person.setName("khoa2");
       // entityManager.getTransaction().commit();
        return 4;
    }




}
