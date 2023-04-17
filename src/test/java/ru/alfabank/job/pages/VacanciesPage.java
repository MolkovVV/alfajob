package ru.alfabank.job.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.*;

public class VacanciesPage extends Page {
    private final String URL = "https://job.alfabank.ru/vacancies";
    private final String VACANCIES_PAGE_TITLE = "Вакансии в Альфа-Банке";
    private final SelenideElement TITLE = $("h1.intro__title");
    private final SelenideElement SARCH_RESULTS = $(".VacanciesList_vacancies-grid__L6mMu");

    @Step("Открыть страницу Вакансии")
    public Page openPage() {
        open(URL);
        return this;
    }

    @Step("Проверить текст основного заголовка на странице вакансии")
    public Page checkTitleOnPage() {
        TITLE.shouldHave(Condition.text(VACANCIES_PAGE_TITLE));
        return this;
    }

    @Step("Проверить URL страницы вакансии")
    public void checkUrlOnPage() {
        Assertions.assertEquals(URL, webdriver().driver().getCurrentFrameUrl(),
                "VacanciesPage incorrect url");
            }

    @Step("Проверить отображение поисковой выдачи на странице вакансии")
    public Page checkSearchResult(){
        SARCH_RESULTS.shouldBe(Condition.visible);
        return this;
    }
}
