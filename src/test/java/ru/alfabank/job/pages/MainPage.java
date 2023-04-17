package ru.alfabank.job.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.PressEnter;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;

public class MainPage extends Page{
    private final String URL = "https://job.alfabank.ru/";
    private final String MAIN_PAGE_TITLE = "Работа в Альфа‑Банке";
    private final SelenideElement TITLE = $("h1.intro__title");
    private final SelenideElement SEARCH_INPUT = $("#find_vacancy");

    @Step("Открыть главную страницу")
    public Page openPage() {
        open(URL);
        return this;
    }

    @Step("Проверить текст основного заголовка на главной странице")
    public Page checkTitleOnPage(){
        TITLE.shouldHave(Condition.text(MAIN_PAGE_TITLE));
        return this;
    }

    @Step("Проверить что URL главной страницы")
    public void checkUrlOnPage(){
        Assertions.assertEquals(URL,webdriver().driver().getCurrentFrameUrl(),
                "MainPage incorrect url");
    }

    @Step("Ввести поисковой запрос '{vacancy}'")
    public VacanciesPage searchVacancy(String vacancy){
        SEARCH_INPUT.setValue(vacancy).pressEnter();
        return new VacanciesPage();
    }
}