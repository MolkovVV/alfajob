package ru.alfabank.job.modules;

import static com.codeborne.selenide.Selenide.executeJavaScript;

public class CookieBanner {
    private String selector = ".cookie";

    public void remove(){
        executeJavaScript("document.querySelector('" + selector + "').setAttribute('style','display: none')");
    }
}
