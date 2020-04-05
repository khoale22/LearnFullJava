package pl.michalmarciniec.jpatraps.requiresnew;

import org.hibernate.annotations.JoinColumnOrFormula;

import javax.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "wallet_id")
    private Long wallet_id;

    /// referencedColumnName có thể có hoặc ko như nhau vì hibernate sẽ tự map đến khóa chính của wallet
    @ManyToOne  (fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "wallet_id",referencedColumnName = "id", insertable = false, updatable = false )
    private Wallet wallet;

    protected Person() {
    }

    public Long getWallet_id() {
        return wallet_id;
    }

    public void setWallet_id(Long wallet_id) {
        this.wallet_id = wallet_id;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Wallet wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

}
