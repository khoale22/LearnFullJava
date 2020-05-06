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
}
