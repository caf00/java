package idiomReport.usecase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import idiomReport.domain.Person;
import idiomReport.domain.PersonRepository;

public class SortPeopleByIdiomUseCaseImpl implements SortPeopleByIdiomUseCase {

    private PersonRepository personRepository;


    public SortPeopleByIdiomUseCaseImpl(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public static SortPeopleByIdiomUseCaseImpl newSortPeopleByIdiomUseCaseImpl(PersonRepository personRepository) {
        return new SortPeopleByIdiomUseCaseImpl(personRepository);
    }

    @Override
    public Map<String, List<Person>> execute() {
        List<Person> people = personRepository.getAllData();
        String languaje = "";
        Map<String, List<Person>> map = new HashMap<>();
        for (Person person : people) {
            if (!Objects.equals(languaje, person.getIdiom())) {
                languaje = person.getIdiom();
                map.put(languaje, generatePeopleSet(languaje, people));
            }
        }
        return map;
    }

    private List<Person> generatePeopleSet(String languaje, List<Person> people) {
        return people
                .stream()
                .filter(p -> Objects.equals(p.getIdiom(), languaje))
                .collect(Collectors.toList());
    }

}
