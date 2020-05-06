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


    @Autowired
    public TestService(PersonRepository personRepository, WalletService walletService, WalletRepository walletRepository) {
        this.personRepository = personRepository;

        this.walletService = walletService;
        this.walletRepository = walletRepository;
    }

}
