package com.simcord.ui.tests.mainPage;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class T8MobileApp extends Methods {
    //C235320	При нажатии на ссылку блока "One Space" -> переход на страницу "мобильное приложение"

    public static void Check1() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.MobileApp));
        element.click();
        WaitLoadPage();
        String txtGetLink = driver.getCurrentUrl();
        waitUntil(MobileAppME);
//        System.out.println(txtGetLink);
        Assert.assertEquals(txtGetLink, LinkMobileAppMP, "C235320");

    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        Scroll1500();
        Check1();
    }
}