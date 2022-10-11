package idiomReport.usecase;

import java.util.List;
import java.util.Map;

import idiomReport.domain.Person;

public interface SortPeopleByIdiomUseCase {
    Map<String, List<Person>> execute();
}
