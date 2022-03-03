package ru.yandex.bankcard.tests;

import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.yandex.bankcard.Account;


@RunWith(Parameterized.class)
public class AccountTest {
    private String name;
    public boolean isCorrectName;

    public AccountTest(String name, boolean isCorrectName){
        this.name = name;
        this.isCorrectName = isCorrectName;
    }

    @Parameterized.Parameters
    public static Object[][] getAccountName(){
        return new Object[][]{
                {"Тимоти Шаламе", true},
                {"ТимотиШаламе", false},
                {"Тимоти Шаламе Иванович", false},
                {"Тимотииии Шаламеееме", false},
                {"Тимотиии Шаламеееее", true},
                {"тимоти шаламе", true},
                {" Тимоти Шаламе ", false},
                {"Тимоти22 Шаламе22", false},
        };
    }

    @Test
    @DisplayName("Проверка метода checkNameToEmboss()")
    public void checkNameToEmbossSuccess(){
        Account account = new Account(name);
        Assert.assertEquals(name +": не прошел проверку", isCorrectName, account.checkNameToEmboss());
    }
}
