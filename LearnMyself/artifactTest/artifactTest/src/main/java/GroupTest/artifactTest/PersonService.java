package GroupTest.artifactTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Service
@PropertySource("classpath:student.properties")
@ConfigurationProperties("student")
public class PersonService {

    @Value("${test.name}")
    private String nameTest ;

    private String nameA ;

    private final PersonRepository personRepository;
    private final WalletService walletService;
    private  final WalletRepository walletRepository;

    @Autowired
    @PersistenceContext
    private transient EntityManager entityManager;


    @Autowired
    public PersonService(PersonRepository personRepository, WalletService walletService, WalletRepository walletRepository) {
        this.personRepository = personRepository;
        this.walletService = walletService;
        this.walletRepository = walletRepository;
    }

    public void setNameTest(){
        int a = 10/0;
        System.out.println(a);
    }

    @Transactional
    public void testGetuier(String name){
        List<Wallet> walletList = new LinkedList<>();

        Wallet wallet = new Wallet();
        wallet.setId(415L);
        walletList.add(wallet);


        Person person = new Person();
        person.setName("khoa");
        person.setWallet_id(wallet.getId());

        person.setWallet(wallet);
        System.out.println("---SET WALLET");

       Person person34343 = personRepository.save(person);
        //entityManager.merge(person.getWallet());
        System.out.println("---SAVE PESON");
        String a = "rw";
        String b = "fdsf";

       // walletRepository.save(person.getWallet());
        walletRepository.saveAll(walletList);
        entityManager.flush();
        System.out.println("---END");

    }

}
