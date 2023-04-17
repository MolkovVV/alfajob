package ru.alfabank.job.modules;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$;

public class HeaderMenu {
    private final ElementsCollection HEADER_MENU_ELEMENTS = $$(".nav__link");

    public void click(String elementName) {
        HEADER_MENU_ELEMENTS.findBy(text(elementName)).click();

    }
}
