package com.simcord.ui.tests.mainPage.exchanges;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class ExchangesDesign extends Methods {
//	C257353	Дизайн *

    public static void GoToOneSpaceExchanges() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.Exchanges));
        element.click();
        WaitLoadPage();

    }

    public static void Check1() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.Exchange1Block));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, ExchangeBlock1GetTxt, "C257353");
    }

    public static void Check2() {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.Exchange2Block));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, ExchangeBlock2GetTxt, "C257353");
    }

    public static void Check3() throws InterruptedException {
        waitUntil(Exchange3Block);
    }

    public static void Check4() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.Exchange4Block));
        String txtGetText = element.getText();
        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, ExchangeBlock3GetTxt, "C257353");
    }


    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        Scroll2000();
        GoToOneSpaceExchanges();
        Check1();
        Check2();
        Check3();
        Check4();
    }
}

