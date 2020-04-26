package pl.michalmarciniec.jpatraps.requiresnew;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
public class Car {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne  (fetch = FetchType.LAZY)
    private Person person;

//    @PrePersist
//    public void prePersist() {
//        String test = "5";
//    }
//

    public Car() {
        this.setName("carName");
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
