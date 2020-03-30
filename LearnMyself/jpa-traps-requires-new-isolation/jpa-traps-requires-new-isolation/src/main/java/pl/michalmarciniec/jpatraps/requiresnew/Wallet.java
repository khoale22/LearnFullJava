package pl.michalmarciniec.jpatraps.requiresnew;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Wallet {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private BigDecimal amount;

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
}
