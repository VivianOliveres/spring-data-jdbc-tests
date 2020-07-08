USE person;

CREATE TABLE IF NOT EXISTS person (
    person_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    firstname TEXT NOT NULL,
    lastname TEXT NOT NULL
);
