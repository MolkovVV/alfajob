package ru.alfabank.job.tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;
import ru.alfabank.job.pages.CareerStartPage;
import ru.alfabank.job.pages.MainPage;
import ru.alfabank.job.pages.Page;
import ru.alfabank.job.pages.VacanciesPage;
import ru.alfabank.job.testdata.HeaderMenuTitles;
import ru.alfabank.job.testdata.TestBase;

public class NavigationTests extends TestBase {

    @ParameterizedTest(name="Переход на страницу {0} из главного меню страницы 'Главная'")
    @EnumSource(HeaderMenuTitles.class)
    public void clickMAinMenuElementFromMainPage(HeaderMenuTitles title){
        String nameElementMenu = title.toString();
        Page mainPage = new MainPage();

        mainPage.openPage()
                .removeCityConfirmPopUp()
                .removeCookiesBanner()
                .clickOnHeaderMenuElement(nameElementMenu)
                .checkTitleOnPage()
                .checkUrlOnPage();
    }

    @DisplayName("Проверка кликабельности элементов главного меню на странице 'Вакансии'")
    @ParameterizedTest(name="Переход на страницу {0} из главного меню страницы 'Вакансии'")
    @EnumSource(HeaderMenuTitles.class)
    public void clickMAinMenuElementFromVacancies(HeaderMenuTitles title){
        String nameElementMenu = title.toString();
        Page vacanciesPage = new VacanciesPage();

        vacanciesPage.openPage()
                .removeCityConfirmPopUp()
                .removeCookiesBanner()
                .clickOnHeaderMenuElement(nameElementMenu)
                .checkTitleOnPage()
                .checkUrlOnPage();
    }

    @DisplayName("Проверка кликабельности элементов главного меню на странице 'Начало карьеры'")
    @ParameterizedTest(name="Переход на страницу {0} из главного меню страницы 'Начало карьеры'")
    @EnumSource(HeaderMenuTitles.class)
    public void clickMAinMenuElementFromCareerStart(HeaderMenuTitles title){
        String nameElementMenu = title.toString();
        Page careerStartPage = new CareerStartPage();

        careerStartPage.openPage()
                .removeCityConfirmPopUp()
                .removeCookiesBanner()
                .clickOnHeaderMenuElement(nameElementMenu)
                .checkTitleOnPage()
                .checkUrlOnPage();
    }
}
