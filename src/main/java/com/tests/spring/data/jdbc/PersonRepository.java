package com.tests.spring.data.jdbc;

import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PersonRepository extends CrudRepository<Person, Long> {

    @Modifying
    @Query("INSERT INTO person (firstname, lastname) VALUES (:firstname, :lastname)")
    long insertOne(String firstname, String lastname);

    @Query("SELECT * FROM person WHERE lastname = :lastname")
    List<Person> findByLastname(String lastname);

    @Query("SELECT * FROM person WHERE firstname LIKE :firstname")
    List<Person> findByFirstnameLike(String firstname);
}