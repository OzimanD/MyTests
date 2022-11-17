package com.simcord.ui.tests.mainPage.Accaunt;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class AccountGoToBitTrade extends Methods {
    //C257360	Нажатие на гиперссылку "Bit Trade" - переход на страницу https://www.bit.trade/ru/registration
    public static void GoToLogin() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.HeaderLogin));
        element.click();
        WaitLoadPage();


    }

    public static void GoToBitTrade() throws InterruptedException {
        WebElement element1 = driver.findElement(By.xpath(AccountBitTrade));
        element1.click();
    }

    public static void Check1() throws InterruptedException {
        String txtGetLink = driver.getCurrentUrl();
        System.out.println(txtGetLink);
        Assert.assertEquals(txtGetLink, LinkBitTrade, "C257359");
        WaitLoadPage();
    }


    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        GoToLogin();
        Scroll500();
        GoToBitTrade();
        WaitLoadPage();
//        Check1();
    }
}
