package ru.alfabank.job.tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import ru.alfabank.job.pages.MainPage;
import ru.alfabank.job.testdata.TestBase;

public class SearchTests extends TestBase {

    @ParameterizedTest(name = "Поиск вакансии \"{0}\"")
    @ValueSource(strings = {"Специалист","Менеджер","Продажи"})

    public void searchVacancyFromMainPage(String vacancy){
        MainPage mainPage = new MainPage();
        mainPage.openPage()
                .removeCityConfirmPopUp()
                .removeCityConfirmPopUp();

        mainPage.searchVacancy(vacancy)
                .checkSearchResult();
    }
}
