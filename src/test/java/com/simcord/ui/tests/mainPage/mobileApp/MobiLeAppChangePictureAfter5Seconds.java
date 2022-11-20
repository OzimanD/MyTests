package com.simcord.ui.tests.mainPage.mobileApp;

import com.simcord.ui.tests.XpathSelectors.Methods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;
import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.MobileAppPicture4Active;

public class MobiLeAppChangePictureAfter5Seconds extends Methods {
    //C235327	Автоматическая смена активной иконки -> в течении 5 сек
    public static void GoToOneMobileApp() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(MobileApp));
        element.click();
        WaitLoadPage();

    }

    public static void Check1() throws InterruptedException {
        WebElement picture = driver.findElement(By.xpath(MobileAppPicture1Active));
        String txtGetText = picture.getAttribute("class");
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, "_3_Sjq _3empz", "C235327");
    }

    public static void Check2() {
        WebElement picture = driver.findElement(By.xpath(MobileAppPicture2Active));
        String txtGetText = picture.getAttribute("class");
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, "_3_Sjq", "C235327");
    }

    public static void Check3() {
        WebElement picture = driver.findElement(By.xpath(MobileAppPicture2Active));
        String txtGetText = picture.getAttribute("class");
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, "_3_Sjq _3empz", "C235327");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        scroll(1500);
        GoToOneMobileApp();
        scroll(1000);
        Check1();
        WaitLoadPage();
        Check2();
        Thread.sleep(5000);
        // TODO: Тест падает на шаге ниже, посмотреть, что не так
        //  java.lang.AssertionError: C235327
        //  Expected :_3_Sjq _3empz
        //  Actual   :_3_Sjq
        //  P.S: Проверять сгенерированное имя класса - плохая идея, достаточно убедиться,
        //  что класс изменился спустя 5 секунд ожидания (сохранить предыдущее значение сгенерированного класса)
        Check3();
    }
}
