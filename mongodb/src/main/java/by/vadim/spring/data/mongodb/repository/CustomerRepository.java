package by.vadim.spring.data.mongodb.repository;

import by.vadim.spring.data.mongodb.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepository extends MongoRepository<Customer, String> {

    List<Customer> findByFirstName(String firstName);
    List<Customer> findByLastName(String lastName);
    List<Customer> findByAge(int age);
    List<Customer> findByFirstNameStartingWith(String regexp);
    List<Customer> findByFirstNameEndingWith(String regexp);
    List<Customer> findByAgeBetween(int ageGT, int ageLT);
    List<Customer> findByFirstNameLikeOrderByAgeAsc(String firstName);

}
