package com.simcord.ui.tests.mainPage.Accaunt;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.AccountRoadMap;
import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.AccountRoadMap1;

public class AccountGoToRoadMap extends Methods {
    //	C257359	Нажатие в текстовом блоке на гиперссылку "Дорожной карте Системы Bitbon" -> переход на страницу Дорожная карта
    public static void GoToLogin() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.HeaderLogin));
        element.click();
        WaitLoadPage();


    }

    public static void GoToRoadMap() throws InterruptedException {
        WebElement element1 = driver.findElement(By.xpath(AccountRoadMap));
        element1.click();
    }

    public static void Check1() throws InterruptedException {
        WaitLoadPage();
        String txtGetLink = driver.getCurrentUrl();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetLink, AccountRoadMap1, "C257359");
    }


    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        GoToLogin();
        GoToRoadMap();
        WaitLoadPage();
        Check1();
    }
}
