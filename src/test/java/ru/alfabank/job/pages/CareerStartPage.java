package ru.alfabank.job.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Selenide.*;

public class CareerStartPage extends Page {
    private final String URL = "https://job.alfabank.ru/start-career";
    private final String CAREER_PAGE_TITLE = "Начни карьеру в правильном месте";
    private final SelenideElement TITLE = $("h1.intro__title");

    @Step("Открыть страницу Начало карьеры")
    public Page openPage() {
        open(URL);
        return this;
    }

    @Step("Проверить текст основного заголовка на странице начало карьеры")
    public Page checkTitleOnPage() {
        TITLE.shouldHave(Condition.text(CAREER_PAGE_TITLE));
        return this;
    }

    @Step("Проверить URL страницы начало карьеры")
    public void checkUrlOnPage() {
        Assertions.assertEquals(URL, webdriver().driver().getCurrentFrameUrl(),
                "CareerStartPage incorrect url");
    }
}
