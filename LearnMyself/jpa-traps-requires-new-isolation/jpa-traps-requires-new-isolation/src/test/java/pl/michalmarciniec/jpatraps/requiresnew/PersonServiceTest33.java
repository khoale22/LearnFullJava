package pl.michalmarciniec.jpatraps.requiresnew;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
/**
 * Khi đánh dấu một class là @DataJpaTest.
 * Spring Boot sẽ load lên tất cả các Bean có liên quan tới tầng Repository
 * Thay vì load hết tất cả Bean như là @SpringBootTest
 */
//@SpringBootTest
@DataJpaTest
public class PersonServiceTest33 {


   @Autowired
   PersonRepository personRepository;

    @Test
    public void khoaleTest() {
        Person person = personRepository.save(new Person("dataJpa"));
        Assert.assertEquals(person.getName() , "dataJpa");
    }

}