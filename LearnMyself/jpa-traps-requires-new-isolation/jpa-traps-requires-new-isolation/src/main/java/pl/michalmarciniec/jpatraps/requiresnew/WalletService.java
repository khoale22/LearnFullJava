package pl.michalmarciniec.jpatraps.requiresnew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

@Service
public class WalletService {

    private final WalletRepository walletRepository;
    private final PersonRepository personRepository;

    @Autowired
    public WalletService(WalletRepository walletRepository, PersonRepository personRepository) {
        this.walletRepository = walletRepository;
        this.personRepository = personRepository;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Wallet createWalletAndAttachToPerson(Person person) {
        Wallet emptyWallet = new Wallet();
        walletRepository.save(emptyWallet);
        person.setWallet(emptyWallet);

        return emptyWallet;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Wallet createWalletAndAttachToPerson2(Long personId) {
        Wallet emptyWallet = new Wallet();
        walletRepository.save(emptyWallet);

        /// neu có @Transactional(propagation = Propagation.REQUIRES_NEW) se khong tìm tháy person vì nó ở new transactional rồi
        // nếu ko có thì tìm dc vì nó đả save trong transactional (personRepository.save(person);) nhưng chưa commit đến db thôi.
        // commit se save db , sau do database is Closed
        Person person = personRepository.findById(personId).orElseThrow(() -> new IllegalStateException("Khong tim thay person nay"));
        person.setWallet(emptyWallet);

        return emptyWallet;
    }


    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Wallet createWallet3(){
        Wallet emptyWallet = new Wallet();
        return walletRepository.save(emptyWallet);
    }


    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public Wallet createWallet4(BigDecimal money) {
        Wallet emptyWallet = new Wallet();
        emptyWallet.setAmount(money);
        return walletRepository.save(emptyWallet);
    }




}
