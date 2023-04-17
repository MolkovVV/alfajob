package ru.alfabank.job.testdata;

public enum HeaderMenuTitles {
    MAIN("Главная"),
    VACANCIES("Вакансии"),
    STARTCAREER("Начало карьеры");

    private String titleMenu;

    HeaderMenuTitles(String titleMenu) {
        this.titleMenu = titleMenu;
    }

    @Override
    public String toString() {
        return titleMenu;
    }
}
