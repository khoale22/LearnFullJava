package stackjava.com.hibernateentitymanager.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import stackjava.com.hibernateentitymanager.entities.Customer;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer> {

     Customer findByName(String name);

}
