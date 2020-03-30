package stackjava.com.hibernateentitymanager.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import stackjava.com.hibernateentitymanager.Respository.CustomerRepository;
import stackjava.com.hibernateentitymanager.entities.Customer;


@Service
public class CustomerDAO {
	@Autowired
	CustomerRepository customerRepository;

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("persistence");
	EntityManager entityManager = entityManagerFactory.createEntityManager();

	public void save(Customer customer) {
		//entityManager.getTransaction().begin();
		entityManager.persist(customer);
		//List<Customer> customer1 = entityManager.createQuery("Select c from Customer c where  c.name = 'Kai'").getResultList();

		Customer employee = entityManager.find(Customer.class, 0);


		String a = "fdsf";
		//entityManager.getTransaction().commit();
		entityManager.close();
	}

	public Customer findById(int id) {
		Customer customer = entityManager.find(Customer.class, id);
		return customer;
	}

	public List<Customer> findAll() {
		//return entityManager.createQuery("SELECT c FROM Customer c", Customer.class).getResultList();
		return null;
	}

	public void delete(Customer customer) {
		entityManager.getTransaction().begin();
		entityManager.remove(customer);
		entityManager.getTransaction().commit();
	}

	public void close() {
		entityManager.close();
		entityManagerFactory.close();
	}
}
