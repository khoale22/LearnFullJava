package GroupTest.artifactTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.LinkedList;
import java.util.List;

@Service
@PropertySource("classpath:student.properties")
@ConfigurationProperties("student")
@Transactional
public class TestService {

    private final PersonRepository personRepository;
    private final WalletService walletService;
    private  final WalletRepository walletRepository;


    /// KHI nam trong 1 @transactional thì walletRepository.save cũng chưa save vào DB phải kết thúc transactional đó
    //walletRepository.save(emptyWallet); sẽ select id này trước xem có hay ko  , nếu có ko insert , ko throw
    //   entityManager.persist(emptyWallet); se  Duplicate entry '5' for key 'PRIMARY' neu trung key , throw
    // walletRepository va entityManager nhu nhau chỉ khác nhau this AND ?
    // walletRepository va entityManager  đều pass to persistent context
    // 1 Transactional có 1 persistent context riêng và nó chỉ lưu vào persistent context ĐỐI TƯỢNG NEW/GET TỪ DB -- khi persist/save


    @Autowired
    public TestService(PersonRepository personRepository, WalletService walletService, WalletRepository walletRepository) {
        this.personRepository = personRepository;
        this.walletService = walletService;
        this.walletRepository = walletRepository;
    }

    @Transactional
    public void deleteTheSameEntity() {
        deleteTheSameEntity2();  // KHONG HOAT DONG Propagation.NOT_SUPPORTED vì method là cấp ngang nhau , chỉ hoạt dộng khi @Transacnal là trên class
        String a = "5";
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void deleteTheSameEntity2() {

        Wallet wallet = walletRepository.findById(2L).get();
        walletRepository.delete(wallet);
        walletRepository.flush();
        //  entityManager.remove(wallet); // NHU NHAU
        System.out.println("------DELTE ENTITY-----");
        walletRepository.save(wallet);  // lỗi
        // entityManager.persist(wallet); // ko lỗi
        System.out.println("------SAVE ENTITY-----");
    }

   // @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void saveHangLoat6() {

        Wallet wallet = new Wallet();

        List<Person> personList = new LinkedList<>();
        Person person = new Person();
        person.setName("sfdsf");
        person.setWallet(wallet);
        personList.add(person)
;
        wallet.setPersonList(personList);

        List<Car> carList = new LinkedList<>();
        Car car = new Car();
        carList.add(car);

        person.setCarList(carList);

        walletRepository.save(wallet);
    }

    @Transactional
    public void deleteHangLoat() {
        Wallet wallet = walletRepository.findById(1L).get();

       // Person person =  new Person("Sara Dorsey1", wallet);
       // person.setId(1L);

        wallet.getPersonList().get(0).setName("fdsf434");
        System.out.println("------Auto flush at commit transaction ");

        walletRepository.findAll();
        personRepository.findAll();
        System.out.println("------Auto flush at commit transaction ");
        walletRepository.delete(wallet);
        walletRepository.flush();
        System.out.println("------Auto flush at commit transaction ");
    }
}
