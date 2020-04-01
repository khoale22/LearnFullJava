package pl.michalmarciniec.jpatraps.requiresnew;

import javax.persistence.*;

@Entity
public class Person {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column
    private String name;

    @OneToOne  (fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    private Wallet wallet;

    protected Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public Person(String name, Wallet wallet) {
        this.name = name;
        this.wallet = wallet;
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
