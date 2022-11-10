package com.simcord.ui.tests.mainPage.mobileApp;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class MobileAppDesign extends Methods {
    //C257342	Дизайн *
//C235325	При нажатии на ссылку блока "One Space" -> переход на страницу Мобильное приложение OneSpace
    public static void GoToMobileApp() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(MobileApp));
        element.click();
        WaitLoadPage();

    }

    public static void Check1() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(MobileAppME));
        String txtGetText = driver.getCurrentUrl();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, LinkMobileApp, "C257342");
    }


    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        Scroll1500();
        GoToMobileApp();
        Check1();
    }
}