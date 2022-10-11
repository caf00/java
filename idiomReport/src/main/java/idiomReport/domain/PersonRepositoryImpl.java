package idiomReport.domain;

import java.util.List;

public class PersonRepositoryImpl implements PersonRepository {

    private List<Person> people;

    public PersonRepositoryImpl() {
        people = List.of(
            Person.newInstance("español", "Alejandro"),
            Person.newInstance("inglés", "Mike"),
            Person.newInstance("portugués", "Roberto"),
            Person.newInstance("español", "María"),
            Person.newInstance("español", "Luciano"),
            Person.newInstance("español", "Horacio"),
            Person.newInstance("inglés", "Daniela"),
            Person.newInstance("inglés", "Cesar"),
            Person.newInstance("inglés", "Nicolás"),
            Person.newInstance("español", "Lucía"),
            Person.newInstance("francés", "Valentina"),
            Person.newInstance("francés", "Marcela"),
            Person.newInstance("español", "Julio"),
            Person.newInstance("inglés", "Mariana"),
            Person.newInstance("francés", "Liliana"),
            Person.newInstance("portugués", "Rosa"),
            Person.newInstance("portugués", "Laura")
        );

    }

    public static PersonRepositoryImpl newInstance() {
        return new PersonRepositoryImpl();
    }

    @Override
    public List<Person> getAllData() {
        return people;
    }
    
}
