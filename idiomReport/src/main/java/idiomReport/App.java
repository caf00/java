package idiomReport;

import idiomReport.domain.PersonRepositoryImpl;
import idiomReport.usecase.SortPeopleByIdiomUseCaseImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Client client = Client.newClient(
            SortPeopleByIdiomUseCaseImpl.newSortPeopleByIdiomUseCaseImpl(
                PersonRepositoryImpl.newDataRepository()
            )
        );
        client.report();
    }
}
