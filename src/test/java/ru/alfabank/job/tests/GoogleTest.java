package ru.alfabank.job.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import ru.alfabank.job.testdata.TestBase;

import static com.codeborne.selenide.Selenide.$;

public class GoogleTest extends TestBase {
    @Tag("Google")
    @Test
    public void searchInfoQaInGoogle(){
        Selenide.open("https://www.google.com/");
        $("#APjFqb").sendKeys("кто такой QA"+ Keys.ENTER);
        $("#search").shouldBe(Condition.visible);

    }
}
