package pl.michalmarciniec.jpatraps.requiresnew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.FlushModeType;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.math.BigDecimal;
import java.util.Arrays;
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
    @PersistenceContext
    private transient EntityManager entityManager;

    /// KHI nam trong 1 @transactional thì walletRepository.save cũng chưa save vào DB phải kết thúc transactional đó
    //walletRepository.save(emptyWallet); sẽ select id này trước xem có hay ko  , nếu có ko insert , ko throw
    //   entityManager.persist(emptyWallet); se  Duplicate entry '5' for key 'PRIMARY' neu trung key , throw
    // walletRepository va entityManager nhu nhau chỉ khác nhau this AND ?
    // walletRepository va entityManager  đều pass to persistent context
    // 1 Transactional có 1 persistent context riêng và nó chỉ lưu vào persistent context ĐỐI TƯỢNG NEW/GET TỪ DB -- khi persist/save


    @Autowired
    public TestService(PersonRepository personRepository, WalletService walletService, WalletRepository walletRepository) {
        this.personRepository = personRepository;
        this.walletService = walletService;
        this.walletRepository = walletRepository;
    }

    @Transactional
    public void deleteTheSameEntity() {
        deleteTheSameEntity2();  // KHONG HOAT DONG Propagation.NOT_SUPPORTED vì method là cấp ngang nhau , chỉ hoạt dộng khi @Transacnal là trên class
        String a = "5";
    }

    @Transactional(propagation = Propagation.NOT_SUPPORTED)
    public void deleteTheSameEntity2() {

        Wallet wallet = walletRepository.findById(2L).get();
        walletRepository.delete(wallet);
        walletRepository.flush();
        //  entityManager.remove(wallet); // NHU NHAU
        System.out.println("------DELTE ENTITY-----");
        walletRepository.save(wallet);  // lỗi
        // entityManager.persist(wallet); // ko lỗi
        System.out.println("------SAVE ENTITY-----");
    }

}
