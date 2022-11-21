package com.simcord.ui.tests.mainPage.mobileApp;

import com.simcord.ui.tests.XpathSelectors.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class MobileAppNewEtap extends Methods {
    //C257348	Этап который не пройден имеет состояние ""Шаг не пройден" -> иконка серая
    public static void GoToOneMobileApp() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(MobileApp));
        element.click();
        WaitLoadPage();

    }

    public static void Check1() throws InterruptedException {
        WebElement picture = driver.findElement(By.xpath(MobileAppOldEtap3));
        String txtGetText = picture.getTagName();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, "li", "C257347");
    }

    public static void Check2() {
        WebElement picture = driver.findElement(By.xpath(MobileAppOldEtap4));
        String txtGetText = picture.getTagName();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, "li", "C257347");
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
