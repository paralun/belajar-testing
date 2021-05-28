package belajar.junit5;

import belajar.junit5.model.Person;
import belajar.junit5.repository.PersonRepository;
import belajar.junit5.service.PersonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@Extensions(
        @ExtendWith(MockitoExtension.class)
)
public class PersonServiceTest {

    @Mock
    private PersonRepository repository;

    private PersonService service;

    @BeforeEach
    void setup() {
        service = new PersonService(repository);
    }

    @Test
    void testGetPersonNotFound() {
        Assertions.assertThrows(IllegalArgumentException.class, () ->{
            service.get("not found");
        });
    }

    @Test
    void testGetPersonSuccess() {
        Mockito.when(repository.selectById("P001")).thenReturn(new Person("P001", "Bambang"));

        Person person = service.get("P001");

        Assertions.assertNotNull(person);
        Assertions.assertEquals("P001", person.getId());
        Assertions.assertEquals("Bambang", person.getName());
    }

    @Test
    void testPersonregister() {
        Person person = service.register("Dunia");
        Assertions.assertEquals("Dunia", person.getName());
        Assertions.assertNotNull(person.getId());

        // akan gagal apabila method repository.Insert() tidak di panggil di service;
        Mockito.verify(repository, Mockito.times(1)).Insert(new Person(person.getId(), person.getName()));
    }
}
