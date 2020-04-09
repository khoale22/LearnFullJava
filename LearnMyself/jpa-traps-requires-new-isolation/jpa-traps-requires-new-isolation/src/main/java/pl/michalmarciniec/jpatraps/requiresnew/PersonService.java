package pl.michalmarciniec.jpatraps.requiresnew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Service
public class PersonService {

    private final PersonRepository personRepository;
    private final WalletService walletService;
    private  final WalletRepository walletRepository;

    @Autowired
    @PersistenceContext
    private transient EntityManager entityManager;

    /// KHI nam trong 1 @transactional thì walletRepository.save cũng chưa save vào DB phải kết thúc transactional đó
    //walletRepository.save(emptyWallet); sẽ select id này trước xem có hay ko  , nếu có ko insert , ko throw
    //   entityManager.persist(emptyWallet); se  Duplicate entry '5' for key 'PRIMARY' neu trung key , throw
    // walletRepository va entityManager nhu nhau chỉ khác nhau this AND ?
    // walletRepository va entityManager  đều pass to persistent context


    @Autowired
    public PersonService(PersonRepository personRepository, WalletService walletService, WalletRepository walletRepository) {
        this.personRepository = personRepository;
        this.walletService = walletService;
        this.walletRepository = walletRepository;
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
       // personRepository.save(person);  // ko save hoac ko persist se ko save person
           // entityManager.persist(person);
        walletService.createWalletAndAttachToPerson(person);
        personRepository.save(person);
        return 0;
    }

    @Transactional
    public long createPerson2(String name) {
        Person person = new Person(name);
        entityManager.persist(person);

        //personRepository.save(person);

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


    @Transactional
    public long createPerson7(String name, BigDecimal money) {
        Person person =  personRepository.findByName("person");
        entityManager.persist(person);
        Wallet emptyWallet = new Wallet();
      //  entityManager.persist(emptyWallet);
        walletRepository.save(emptyWallet);
        person.setWallet(emptyWallet);
       // personRepository.save(person);
        return 5;
    }

    ///Persist 1 đối tượng giống nhau 2 lần sẽ bị lỗi
    /// khi persist sẽ sinh ra id nếu id đó là @GeneratedValue
    /// persist only be called within a transaction AND  only be called on new objects.
    @Transactional
    public long saveNewWallet(String name) {
        Wallet emptyWallet = new Wallet();
        emptyWallet.setAmount(new BigDecimal(2.00));

          entityManager.persist(emptyWallet);
        entityManager.detach(emptyWallet); // van save emptyWallet WHY
        //  entityManager.persist(emptyWallet);
        return 5;
    }

    //// phải detach truoc khi set value moi co tac dung

    ///( remove = delete ) delete an object from the database  it marks the object to be deleted in the persistence context (transaction).  KHAC detach
    @Transactional
    public long saveNewWalletDetach(String name) {

        Wallet wallet = walletRepository.findById(5L).get();
        System.out.println("after find(): " + entityManager.contains(wallet));
      //  wallet.setAmount(new BigDecimal(2.78));  //// NOT OK
        entityManager.detach(wallet);
        wallet.setAmount(new BigDecimal(2.78)); ///// OK
        System.out.println("after detach(): " + entityManager.contains(wallet));
        entityManager.merge(wallet);
        wallet.setAmount(new BigDecimal(2.78));
        return 5;
    }

    //Clear the persistence context, causing all managed entities to become detached.
    // Changes made to entities that have not been flushed to the database will not be persisted.
    @Transactional
    public long saveNewWalletDetachAndClear(String name) {

        Wallet wallet = walletRepository.findById(5L).get();
        Wallet wallet2 = walletRepository.findById(4L).get();
//        entityManager.detach(wallet);
//        wallet.setAmount(new BigDecimal(8.99));  // khong update
//        wallet2.setAmount(new BigDecimal(8.99)); //  update

        entityManager.clear();
        wallet.setAmount(new BigDecimal(8.99));  // khong update
        wallet2.setAmount(new BigDecimal(8.99)); // khong update

        return 5;
    }


    @Transactional
    public long saveNewWalletFlush(String name) {
       // Person person = personRepository.findById(2L).get();

        Wallet wallet = walletRepository.findById(1L).get();
        wallet.getPersonList().clear();
        //entityManager.flush();
        Person person = new Person("fds",wallet);
//        List<Person> personList = new ArrayList<>();
//        personList.add(person);
        //wallet.setPersonList(personList);  /// sai vì nếu setPersonList thì sẽ mất PersonList củ , throw exception
        wallet.getPersonList().add(person);
        entityManager.persist(wallet);
        return 9;
    }

    @Transactional
    public void saveNewWalletFlush2(String name) {

        entityManager.setFlushMode(FlushModeType.COMMIT);
        List<Person> employeeList = getNewEmployees();
        for (Person employee : employeeList) {
            entityManager.persist(employee);
        }
      //  entityManager.flush();
        showPersistedITEmployees(entityManager);
        int a = 5;
    }
    private static void showPersistedITEmployees(EntityManager em) {
        Query query =
                em.createQuery("from Person");
        System.out.println("-- IT employees persisted list --");
        List<Person> list = (List<Person>) query.getResultList();
        list.forEach(System.out::println);
    }

    public List<Person> getNewEmployees() {
        return Arrays.asList(new Person("Sara Dorsey", walletRepository.findById(1L).get()));

    }

    /// ở chế độ AUTO thì persit sẽ thêm đối tượng vào persistent context
    /// ở chế độ COMMIT  thì ko , phai dùng entityManager.flush() thì mới thêm đối tượng vào persistent context
    @Transactional
    public void saveNewWalletFlush3(String name) {

        entityManager.setFlushMode(FlushModeType.COMMIT);
        Person person = new Person("test3424", walletRepository.findById(1L).get());
        entityManager.persist(person);
        entityManager.flush();
        int a = 5;
    }

    @Transactional
    public void testSaveHangloat1(String name) {
        Wallet walletNewNoHaveInDB = new Wallet();

//        walletRepository.save(walletNewNoHaveInDB);   // ko co/co Transactional ko loi
//        walletRepository.save(walletNewNoHaveInDB);   // ko co/co Transactional ko loi

        entityManager.persist(walletNewNoHaveInDB);   // co Transactional ko loi
        entityManager.persist(walletNewNoHaveInDB);   // co Transactional ko loi

//        entityManager.persist(walletNewNoHaveInDB);   // co Transactional ko loi
//        entityManager.flush();
//        entityManager.persist(walletNewNoHaveInDB);   // co Transactional ko loi
        String a = "fd";
    }

    @Transactional
    public void testSaveHangloat2(String name) {
        Wallet walletNewHaveInDB = walletRepository.findById(1L).get();

//        walletRepository.save(walletNewHaveInDB);   // ko co/co Transactional ko loi
//        walletRepository.save(walletNewHaveInDB);   // ko co/co Transactional ko loi

//              entityManager.persist(walletNewHaveInDB);   // co Transactional ko loi
//              entityManager.persist(walletNewHaveInDB);   // co Transactional ko loi

        entityManager.persist(walletNewHaveInDB);   // co Transactional ko loi
        entityManager.flush();
        entityManager.persist(walletNewHaveInDB);   // co Transactional ko loi
        String a = "fd";

    }
    //// OK du save 1 hay 2 đói tượng
    @Transactional
    public void testSaveHangloat3(String name) {
        Wallet walletNewHaveInDB = walletRepository.findById(1L).get();

        Person person = new Person();
        person.setName(name);
        person.setWallet(walletNewHaveInDB);

        personRepository.save(person);

        Person person2 = new Person();
        person2.setName(name);
        person2.setWallet(walletNewHaveInDB);

        personRepository.save(person2);
      //  personRepository.save(person);
    }

    //// ERROR :tại ///   person2.setWallet(walletNewNoHaveInDB);
    // bởi vì đối tường walletNewNoHaveInDB đả dc save ở personRepository.save(person); then bị detached
    /// save ở đây nghĩa là phải dc insert vào db luôn chớ ko phải chỉ hiện câu insert (flush ko có tác dụng)
    /// nên sau đó khi gọi  person2.setWallet(walletNewNoHaveInDB); thì đội tướng đả detached rồi
    ////personRepository.save(person2); sẽ gọi save walletNewNoHaveInDB(detached) => error

    ///NEU DC QUAN LÝ BOI Transactional sẽ khong bị lỗi vì chưa dc insert trong BD

    /// TOM LAI DOI TUONG GỌI CÂU INSERT VÀ QUAN TRỌNG NHẤT phải dc insert trong db mới bị detached
    /// ALL above is wrong

    /// person 1 + walletNewNoHaveInDB - > persistence context
    /// person 2 + walletNewNoHaveInDB - > persistence context
    /// nhu vay mỗi person luu tru 1 person có chua wallet giong nhau nên dc persist 2 vị trí trong persistence context
    // nên lỗi
 //    @Transactional
    public void testSaveHangloat4(String name) {
        Wallet walletNewNoHaveInDB = new Wallet();

        Person person = new Person();
        person.setName(name);
        person.setWallet(walletNewNoHaveInDB);

        personRepository.save(person);
       // entityManager.flush();

        Person person2 = new Person();
        person2.setName(name);
       // personRepository.
        person2.setWallet(walletNewNoHaveInDB);


        personRepository.save(person2);
        //  personRepository.save(person);
    }

    public void testSavefdjsk(String name) {
        Wallet walletNewNoHaveInDB = new Wallet();
        walletRepository.save(walletNewNoHaveInDB);
        //  personRepository.save(person);
    }






}
