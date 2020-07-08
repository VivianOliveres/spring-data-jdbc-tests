package com.tests.spring.data.jdbc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    @Bean
    public CommandLineRunner demo(PersonRepository repository) {
        return (args) -> {
            System.out.println("Starting executions...");
            repository.deleteAll();

            Person person = new Person();
            person.setFirstname("Jens");
            person.setLastname("Schauder");
            repository.insertOne(person.firstname, person.lastname);

            List<Person> lastNameResults = repository.findByLastname("Schauder");
            System.out.println("Find by lastname (Schauder): " + lastNameResults);

            List<Person> firstNameResults = repository.findByFirstnameLike("Je%");
            System.out.println("Find by firstname like(Je%): " + firstNameResults);
        };
    }

}
