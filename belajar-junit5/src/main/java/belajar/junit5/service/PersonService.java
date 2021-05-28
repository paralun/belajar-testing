package belajar.junit5.service;

import belajar.junit5.model.Person;
import belajar.junit5.repository.PersonRepository;

import java.util.UUID;

public class PersonService {

    private PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public Person get(String id) {
        Person person = repository.selectById(id);
        if(person != null) {
            return person;
        }else {
            throw new IllegalArgumentException("Person not found");
        }
    }

    public Person register(String name) {
        Person p = new Person(UUID.randomUUID().toString(), name);
        repository.Insert(p);
        return p;
    }
}
