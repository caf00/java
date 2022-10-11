package idiomReport.usecase;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import idiomReport.domain.Person;
import idiomReport.domain.PersonRepository;

public class SortPeopleByIdiomUseCaseImpl implements SortPeopleByIdiomUseCase {

    private PersonRepository personRepository;


    public SortPeopleByIdiomUseCaseImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public static SortPeopleByIdiomUseCaseImpl newInstance(PersonRepository personRepository) {
        return new SortPeopleByIdiomUseCaseImpl(personRepository);
    }

    @Override
    public Map<String, List<Person>> execute() {
        return personRepository
            .getAllData()
            .stream()
            .collect(Collectors.groupingBy(Person::getIdiom));
    }
}
