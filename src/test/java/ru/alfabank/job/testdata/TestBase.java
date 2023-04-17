package ru.alfabank.job.testdata;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import ru.alfabank.job.config.ConfigReader;
import ru.alfabank.job.config.ProjectConfiguration;
import ru.alfabank.job.config.web.WebConfig;
import ru.alfabank.job.helpers.Attach;

public class TestBase {
    private static final WebConfig config = ConfigReader.Instance.read();

    @BeforeAll
    public static void setUp(){
        SelenideLogger.addListener("allure",new AllureSelenide());
        ProjectConfiguration projectConfiguration = new ProjectConfiguration(config);
        projectConfiguration.webConfig();
    }

    @AfterEach
    public void getAttach(){
        Attach.addVideo();
        Attach.browserConsoleLogs();
        Attach.pageSource();
        Attach.screenshotAs("ScreenShot");
    }
}
