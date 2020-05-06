package GroupTest.artifactTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ArtifactTestApplicationTests {

	@Autowired
	PersonRepository personRepository;

	@Test
	public void contextLoads() {
		Person person = personRepository.findById(37L).get();
		Assert.assertEquals(person.getName(), "Sara Dorsey3333");
	}

}
