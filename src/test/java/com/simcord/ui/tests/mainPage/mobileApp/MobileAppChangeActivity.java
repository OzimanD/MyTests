package com.simcord.ui.tests.mainPage.mobileApp;

import com.simcord.ui.tests.XpathSelectors.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class MobileAppChangeActivity extends Methods {
    //	C235328	Автоматическая смена активной иконки происходит в последовательности *
    public static void GoToOneMobileApp() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(MobileApp));
        element.click();
        WaitLoadPage();

    }

    public static void Check1() throws InterruptedException {
        WebElement picture = driver.findElement(By.xpath(MobileAppPicture1Active));
        String txtGetText = picture.getAttribute("class");
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, "_3_Sjq _3empz", "C235328");
    }

    public static void Check2() {
        WebElement picture = driver.findElement(By.xpath(MobileAppPicture2Active));
        String txtGetText = picture.getAttribute("class");
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, "_3_Sjq _3empz", "C235328");
    }

    public static void Check3() {
        WebElement picture = driver.findElement(By.xpath(MobileAppPicture3Active));
        String txtGetText = picture.getAttribute("class");
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, "_3_Sjq _3empz", "C235328");
    }

    public static void Check4() {
        WebElement element = driver.findElement(By.xpath(MobileAppIcon4));
        element.click();
        WebElement picture = driver.findElement(By.xpath(MobileAppPicture4Active));
        String txtGetText = picture.getAttribute("class");
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, "_3_Sjq _3empz", "C235328");
    }


    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        scroll(1500);
        GoToOneMobileApp();
        scroll(1000);
        Check1();
        Thread.sleep(5000);
        Check3();
        Thread.sleep(5000);
        Check2();
        Thread.sleep(5000);
        Check4();

    }
}

