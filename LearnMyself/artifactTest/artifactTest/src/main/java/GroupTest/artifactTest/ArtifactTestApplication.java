package GroupTest.artifactTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
	}
}
