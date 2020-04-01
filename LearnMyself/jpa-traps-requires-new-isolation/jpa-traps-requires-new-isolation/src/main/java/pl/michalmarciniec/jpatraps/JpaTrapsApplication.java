package pl.michalmarciniec.jpatraps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.michalmarciniec.jpatraps.requiresnew.PersonService;

import java.math.BigDecimal;

@SpringBootApplication
public class JpaTrapsApplication implements CommandLineRunner {

	@Autowired
	PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(JpaTrapsApplication.class, args);
	}

	@Override
	public void run(String... args) {

		//personService.saveNewWallet("trung2");
		//personService.saveNewWalletDetach("trung2");

		//personService.saveNewWalletDetachAndClear("trung2");

		personService.saveNewWalletFlush("KHoa5r45");


		//personService.createPerson("trung2");

		//personService.createPerson7("trung2", new BigDecimal("-0.14"));

	}
}
