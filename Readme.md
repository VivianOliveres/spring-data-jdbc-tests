# spring-data-jdbc-tests

This project is a very simple example of the use of spring-data.
It uses Mysql, docker-compose, spring-data, spring-boot and lombok.

## Database

Use the Mysql configured in `docker-compose.yml`.

    # To start the container
    docker-compose up
    # To stop it
    docker-compose down
    # To stop it and remove the volumes (will allows at next start to run the init.sql script)
    docker-compose down -v

To connect in a terminal to the Mysql database:

    mysql -h 127.0.0.1 -P 3306 -u me inventory -p123

## Configuration

`ApplicationConfig` class will read the `application.yml` file that contains 
the datasource declaration in order to connect to Mysql.

## Repository

`PersonRepository` is a `CrudRepository` that defines some *select*/*insert* 
operations.

## Application

The `App` define a `CommandLineRunner` that will be executed once and will
call different operations on `PersonRepository` to demonstrate how to use 
it.
