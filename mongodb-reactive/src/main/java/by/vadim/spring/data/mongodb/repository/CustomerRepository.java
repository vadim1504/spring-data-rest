package by.vadim.spring.data.mongodb.repository;

import by.vadim.spring.data.mongodb.model.Customer;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RepositoryRestResource(collectionResourceRel = "customer", path = "customer")
public interface CustomerRepository extends ReactiveSortingRepository<Customer, String> {

    Flux<Customer> findByFirstName(Mono<String> firstName);
    Flux<Customer> findByLastName(Mono<String> lastName);
    Flux<Customer> findByAge(Integer age);
    Flux<Customer> findByFirstNameStartingWith(Mono<String> regexp);
    Flux<Customer> findByFirstNameEndingWith(Mono<String> regexp);
    Flux<Customer> findByAgeBetween(Integer ageGT, Integer ageLT);
    Flux<Customer> findByFirstNameLikeOrderByAgeAsc(Mono<String> firstName);
}
