package miketek.springframework.sfgpetclinic.services;

import miketek.springframework.sfgpetclinic.model.Person;

import java.util.Set;

public interface PersonService {
    Person findByLastName(String lastName);
    Person findById(Long id);
    Person save(Person person);
    Set<Person> findAll();
}
