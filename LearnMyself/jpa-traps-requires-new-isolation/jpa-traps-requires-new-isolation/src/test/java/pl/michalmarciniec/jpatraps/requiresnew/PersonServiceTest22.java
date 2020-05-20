//package pl.michalmarciniec.jpatraps.requiresnew;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.Spy;
//import org.mockito.runners.MockitoJUnitRunner;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.Optional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//
//@RunWith(MockitoJUnitRunner.class)
//public class PersonServiceTest22 {
//
//
//    @InjectMocks
//    private PersonService personService;
//    @Spy
//    private PersonRepository personRepository;
//
//    @Test
//    public void shouldCreatePersonWithEmptyWallet() {
//        // when
//        personService.createPerson55("Jeremy");
//
//        // then
////        Optional<Person> jeremy = personRepository.findById(jeremyId);
////        assertThat(jeremy).isPresent();
////        Wallet jeremyWallet = jeremy.get().getWallet();
////        assertThat(jeremyWallet.getId()).isNotNull();
////        assertThat(jeremyWallet.getAmount()).isZero();
//    }
//
//}