package idiomReport.domain;

import java.util.List;

public class PersonRepositoryImpl implements PersonRepository {

    private List<Person> people;

    public PersonRepositoryImpl() {
        people = List.of(
            Person.newPerson("español", "Alejandro"),
            Person.newPerson("inglés", "Mike"),
            Person.newPerson("portugués", "Roberto"),
            Person.newPerson("español", "María"),
            Person.newPerson("español", "Luciano"),
            Person.newPerson("español", "Horacio"),
            Person.newPerson("inglés", "Daniela"),
            Person.newPerson("inglés", "Cesar"),
            Person.newPerson("inglés", "Nicolás"),
            Person.newPerson("español", "Lucía"),
            Person.newPerson("francés", "Valentina"),
            Person.newPerson("francés", "Marcela"),
            Person.newPerson("español", "Julio"),
            Person.newPerson("inglés", "Mariana"),
            Person.newPerson("francés", "Liliana"),
            Person.newPerson("portugués", "Rosa"),
            Person.newPerson("portugués", "Laura")
        );

    }

    public static PersonRepositoryImpl newDataRepository() {
        return new PersonRepositoryImpl();
    }

    @Override
    public List<Person> getAllData() {
        return people;
    }
    
}
