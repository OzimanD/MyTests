package com.simcord.ui.tests.mainPage.mobileApp;

import com.simcord.ui.tests.XpathSelectors.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;
import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.MobileAppPicture4Active;

public class MobileAppOldEtap extends Methods {
    //C257347	Этап который пройден имеет состояние ""Шаг пройден" -> иконка цветная
    public static void GoToOneMobileApp() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(MobileApp));
        element.click();
        WaitLoadPage();

    }

    public static void Check1() throws InterruptedException {
        WebElement picture = driver.findElement(By.xpath(MobileAppOldEtap1));
        String txtGetText = picture.getAttribute("class");
        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, "active", "C257347");
    }

    public static void Check2() {
        WebElement picture = driver.findElement(By.xpath(MobileAppOldEtap2));
        String txtGetText = picture.getAttribute("class");
        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, "active", "C257347");
    }


    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        Scroll1500();
        GoToOneMobileApp();
        Scroll1000();
        WaitLoadPage();
        Check1();
        Check2();
    }
}
