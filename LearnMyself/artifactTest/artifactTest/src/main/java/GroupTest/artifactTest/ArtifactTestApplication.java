package GroupTest.artifactTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.PersistenceContext;

@SpringBootApplication
public class ArtifactTestApplication implements CommandLineRunner {

	@Autowired
	PersonService personService;

	@Autowired
	TestService testService;

	public static void main(String[] args) {
		SpringApplication.run(ArtifactTestApplication.class, args);
	}

	@Override
	public void run(String... args) {

		personService.testGetuier("trung2");
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
		//personService.autoFlush5();




		//testService.deleteTheSameEntity2();
		//testService.saveHangLoat6();
		//testService.deleteHangLoat();
	}
}
