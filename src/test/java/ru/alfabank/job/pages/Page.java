package ru.alfabank.job.pages;

import io.qameta.allure.Step;
import ru.alfabank.job.modules.CityConfirmBanner;
import ru.alfabank.job.modules.CookieBanner;
import ru.alfabank.job.modules.HeaderMenu;
import ru.alfabank.job.testdata.HeaderMenuTitles;

public abstract class Page {

    private final HeaderMenu HEADER_MENU = new HeaderMenu();
    private final CookieBanner COOKIE_BANNER = new CookieBanner();
    private final CityConfirmBanner cityConfirmBanner = new CityConfirmBanner();

    public abstract Page openPage();

    @Step("Убрать окно подтверждения города")
    public Page removeCityConfirmPopUp() {
        cityConfirmBanner.remove();
        return this;
    }

    @Step("Кликнуть на элемент: '{elementName}' главного меню")
    public Page clickOnHeaderMenuElement(String elementName) {
        HEADER_MENU.click(elementName);
        if (elementName.equals(HeaderMenuTitles.values()[1].toString())) {
            return new VacanciesPage();
        }
        if (elementName.equals(HeaderMenuTitles.values()[2].toString())) {
            return new CareerStartPage();
        } else {
            return new MainPage();
        }
    }

    @Step("Убрать информационный баннер об использовании cookies")
    public Page removeCookiesBanner() {
        COOKIE_BANNER.remove();
        return this;
    }

    public abstract Page checkTitleOnPage();
    public abstract void checkUrlOnPage();
}
