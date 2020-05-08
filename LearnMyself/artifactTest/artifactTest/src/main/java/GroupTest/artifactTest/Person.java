package GroupTest.artifactTest;

import javax.persistence.*;
import java.util.List;

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
    //cascade = CascadeType.ALL) // lam funtion createPerson bi Lỗi, Detached entity passed to persist vì save lần 2 đối tượng
    // wallet , lần đầu tiên là đối tượng mới nên mới dc persit vào persistent context lần 2 ở transacnal(1) wallet này ko phải new
    // nên save bị lỗi
    //https://stackoverflow.com/questions/13370221/persistentobjectexception-detached-entity-passed-to-persist-thrown-by-jpa-and-h
    //@ManyToOne  (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    //@ManyToOne  (fetch = FetchType.LAZY)
    //@JoinColumn(name = "wallet_id",referencedColumnName = "id", insertable = true, updatable = true )

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "wallet_id",referencedColumnName = "id", insertable = false, updatable = false )
    private Wallet wallet;

    protected Person() {
    }

    public Person(String name, Long wallet_id, Wallet wallet) {
        this.name = name;
        this.wallet_id = wallet_id;
        this.wallet = wallet;
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", wallet_id=" + wallet_id +
                ", wallet=" + wallet +
                '}';
    }


}
