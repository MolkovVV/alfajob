package ru.alfabank.job.modules;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class CityConfirmBanner {
    private String selector = "[class^=cityConfirm_]";

    public void remove(){
        executeJavaScript("document.querySelector('" + selector + "').setAttribute('style','display: none')");
    }
}
