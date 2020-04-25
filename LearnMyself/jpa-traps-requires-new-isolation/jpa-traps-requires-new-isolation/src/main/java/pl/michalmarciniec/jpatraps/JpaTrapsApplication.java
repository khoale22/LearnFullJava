package pl.michalmarciniec.jpatraps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import pl.michalmarciniec.jpatraps.requiresnew.PersonService;
import pl.michalmarciniec.jpatraps.requiresnew.TestService;

import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;
import javax.persistence.PersistenceContext;
import java.math.BigDecimal;



@SpringBootApplication
//@EnableJpaRepositories
public class JpaTrapsApplication implements CommandLineRunner {

	@Autowired
	PersonService personService;

	@Autowired
	TestService testService;

	@Autowired
	@PersistenceContext
	private transient EntityManager entityManager;

	public static void main(String[] args) {
		SpringApplication.run(JpaTrapsApplication.class, args);
	}

	@Override
	public void run(String... args) {

		//personService.saveNewWallet("trung2");
		//personService.saveNewWalletDetach("trung2");

		//personService.saveNewWalletDetachAndClear("trung2");


		//personService.saveNewWalletFlush2("KHoa5r45");

		//personService.saveNewWalletFlush3("KHoa5r45");

        //personService.createPerson3("hfdkjsf", new BigDecimal("0.14"));
		//personService.createPerson("trung2");

		//personService.createPerson7("trung2", new BigDecimal("-0.14"));

		//personService.testSaveHangloat1("trung2");
		//personService.testSaveHangloat2("trung2");
		//personService.testSaveHangloat3("trung");
		//personService.testSaveHangloat4("trung");

		//personService.testSavefdjsk("trung");

		//personService.testsaveMergeUpdate();
		//personService.detachBeforeUpdate();
		//personService.detachBeforeUpdate2();
		//personService.testDetach();

		//personService.readOnlyTEst();

       // personService.testSaveAndFlush();
		//personService.autoFlush();
		//personService.autoFlush2();

		//personService.autoFlush3();
		//personService.autoFlush4();




		testService.deleteTheSameEntity2();
	}
}
