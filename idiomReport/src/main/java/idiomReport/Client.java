package idiomReport;

import java.util.List;
import java.util.Map;

import idiomReport.domain.Person;
import idiomReport.usecase.SortPeopleByIdiomUseCase;

public class Client {
    SortPeopleByIdiomUseCase sortPeopleByIdiomUseCase;

    public Client(SortPeopleByIdiomUseCase sortPeopleByIdiomUseCase) {
        this.sortPeopleByIdiomUseCase = sortPeopleByIdiomUseCase;
    }

    public static Client newInstance(SortPeopleByIdiomUseCase sortPeopleByIdiomUseCase) {
        return new Client(sortPeopleByIdiomUseCase);
    }

    public void report() {
        Map<String, List<Person>> data = sortPeopleByIdiomUseCase.execute();
        for (Map.Entry<String, List<Person>> entry : data.entrySet()) {
		    System.out.println("###### IDIOMA: "+entry.getKey()+" ######");
            entry.getValue()
                .forEach(System.out::println);
		}
    }

}
