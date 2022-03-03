package ru.yandex.bankcard;

public class Praktikum{

    public static void main(String[] args) {

        Account account = new Account("Тимоти Шаламе");
        boolean isCorrectName = account.checkNameToEmboss();
        System.out.println(isCorrectName);

    }
}
