package tests;
import adapters.HHVacanciesAdapter;
import models.hh.Vacancy;
import org.testng.annotations.Test;

public class HeadHunterAPITest {

    @Test
    public  void  getVacancies (){
        models.hh.Vacancies vacancies= new HHVacanciesAdapter().get("QA");
        for (models.hh.Vacancy vacancy : vacancies.getItems()) {
            System.out.println("_______________________________________");
            System.out.println("Вакансия: " + vacancy.getName());
            if(vacancy.getSalary() != null) {
                System.out.println("Начальная ЗП:" + vacancy.getSalary().getFrom() + " " + vacancy.getSalary().getCurrency());
            }
        }
    }
}
