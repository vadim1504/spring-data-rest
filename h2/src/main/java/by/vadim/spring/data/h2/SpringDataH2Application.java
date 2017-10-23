package by.vadim.spring.data.h2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "by.vadim.spring.data.h2.repository")
public class SpringDataH2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataH2Application.class, args);
	}
}
