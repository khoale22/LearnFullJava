package pl.michalmarciniec.jpatraps.requiresnew;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMy {

    @Mock
    PersonRepository personRepository;

    @Mock
    TestService testService;

    @InjectMocks  // có thêm những thằng dc khai báo bằng @Mock
    PersonService personService;

    WalletService walletService;

    @Test
    public void testadf(){
        Assert.assertTrue(true);
    }


}
