package ru.osipov.library.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.osipov.library.models.Person;

import java.util.Optional;

public interface PeopleRepository extends JpaRepository<Person, Integer> {
    Optional<Person> findByFullName(String fullName);
}