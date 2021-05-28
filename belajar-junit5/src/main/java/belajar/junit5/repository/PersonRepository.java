package belajar.junit5.repository;

import belajar.junit5.model.Person;

public interface PersonRepository {
    Person selectById(String id);

    void Insert(Person person);
}
