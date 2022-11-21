package com.simcord.ui.tests.mainPage.mobileApp;

import com.simcord.ui.tests.XpathSelectors.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class MobileAppOpenIos extends Methods {
    //C235330	Кнопка для скачивания приложения Bitbon Space из Google Play -> переход на страницу Google play
    public static void GoToMobileApp() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(MobileApp));
        element.click();
        WaitLoadPage();

    }

    public static void Check1() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(MobileAppCheckIOS));
        String txtGetText = element.getAttribute("href");
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, LinkMobileAppIOSButton, "C257342");
        element.click();
        WaitLoadPage();
//        System.out.println(driver.getCurrentUrl());
    }


    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        Scroll1500();
        GoToMobileApp();
        Check1();
        Scroll2000();
        WaitLoadPage();
    }
}