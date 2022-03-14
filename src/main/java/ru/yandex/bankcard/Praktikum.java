package ru.yandex.bankcard;

public class Praktikum{

    public static void main(String[] args) {
        Account account = new Account("Тимоти Шаламе");

        try {
            boolean isCorrectName = account.checkNameToEmboss();
            System.out.println(isCorrectName);
        }catch (Exception  exception){
            exception.printStackTrace();
        }
    }
}
