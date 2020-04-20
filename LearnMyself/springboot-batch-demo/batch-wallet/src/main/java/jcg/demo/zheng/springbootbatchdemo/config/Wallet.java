package jcg.demo.zheng.springbootbatchdemo.config;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Wallet {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "amount")
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
