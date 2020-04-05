package pl.michalmarciniec.jpatraps.requiresnew;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Wallet {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "amount")
    private BigDecimal amount;

    @OneToMany(mappedBy = "wallet", fetch = FetchType.EAGER,cascade = CascadeType.ALL, orphanRemoval = true)
    private
    List<Person> personList;

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
