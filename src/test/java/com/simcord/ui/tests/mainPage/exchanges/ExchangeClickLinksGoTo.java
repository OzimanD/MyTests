package com.simcord.ui.tests.mainPage.exchanges;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;
import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.ExchangeBlock3GetTxt;

public class ExchangeClickLinksGoTo extends Methods {
    // C257354	Нажатие на гиперссылку "Перейти" -> переход на главную страницу сайта биржи *

    public static void GoToOneSpaceExchanges() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.Exchanges));
        element.click();
        WaitLoadPage();

    }

    public static void GoToBiBonTrade() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.BitBonTrade));
        element.click();

    }

    public static void Check1() {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.Exchange2Block));
        String txtGetLink = driver.getCurrentUrl();
        System.out.println(txtGetLink);
        Assert.assertEquals(txtGetLink, LinkBitTrade, "C257353");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        Scroll2000();
        GoToOneSpaceExchanges();
        GoToBiBonTrade();
        WaitLoadPage();
        StopLoadPaige();
        Check1();
    }
}