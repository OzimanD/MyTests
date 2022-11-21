package com.simcord.ui.tests.mainPage;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class T7MainPageExchanges extends Methods {
    //C235321	При нажатии на ссылку блока "Переход к списку бирж" -> переход на страницу со списком бирж

    public static void Check1() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.Exchanges));
        element.click();
        WaitLoadPage();
        String txtGetLink = driver.getCurrentUrl();
        waitUntil(ExchangesME);
//        System.out.println(txtGetLink);
        Assert.assertEquals(txtGetLink, LinkExchangesMP, "C235320");

    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        scroll(2000);
        Check1();
    }
}