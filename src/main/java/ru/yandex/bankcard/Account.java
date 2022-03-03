package ru.yandex.bankcard;

public class Account {

    private final String name;

    public Account(String name) {
        this.name = name;
    }

    public boolean checkNameToEmboss() {
        return name.matches("^(?=.{3,19}$)([а-яА-ЯёЁ]+ [а-яА-ЯёЁ]+)$");
    }

}
