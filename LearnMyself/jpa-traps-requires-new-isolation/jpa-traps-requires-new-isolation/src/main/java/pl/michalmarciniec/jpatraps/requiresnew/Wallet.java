package pl.michalmarciniec.jpatraps.requiresnew;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.service.spi.InjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Configurable
@Entity
public class Wallet {

    @Autowired
    private transient PersonRepository personRepository ;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "amount")
    private BigDecimal amount;

    @OneToMany(mappedBy = "wallet", fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private
    List<Person> personList;

    @PrePersist
    public void prePersist() {
        Person person = personRepository.findById(2L).get();
        String test = "5";
    }


    public Wallet() {
        this.setAmount(BigDecimal.ZERO);
    }

    public Long getId() {
        return id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }
}
