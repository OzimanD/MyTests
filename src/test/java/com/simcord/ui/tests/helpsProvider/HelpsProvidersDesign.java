package com.simcord.ui.tests.helpsProvider;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class HelpsProvidersDesign extends Methods {
    //      C257401	Дизайн *
    //	    C257402	Вход на страницу происходит через *
    //		C257408	Информационные блоки проявляются плавно по 2 блока, одновременно текст и блок
    //      C257403	Блок подменю при скролировании всегда отображаться вверху страницы
    //      C257404	Наведение на пункт перехода "Аналитическая панель Регистратора" -> курсор изменяется на "руку"

    public static void GoToProvidingHeplpsProvider() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.HeaderProviding));
        element.click();
        WaitLoadPage();
        WebElement element1 = driver.findElement(By.xpath(HelpsProvider));
        element1.click();

    }

    public static void Check0() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.HelpsProviderBlock0));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, HelpsProviderGetTxt0, "C257401");
    }

    public static void Check1() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(HelpsProviderBlock1));
        String txtGetText = element0.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, HelpsProviderGetTxt1, "C257401");
    }

    public static void Check2() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(HelpsProviderBlock2));
        String txtGetText = element0.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, HelpsProviderGetTxt2, "C257401");
    }

    public static void Check3() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(HelpsProviderBlock3));
        String txtGetText = element0.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, HelpsProviderGetTxt3, "C257401");
    }

    public static void Check4() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(HelpsProviderBlock4));
        String txtGetText = element0.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, HelpsProviderGetTxt4, "C257401");
    }

    public static void Check5() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(HelpsProviderBlock5));
        String txtGetText = element0.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, HelpsProviderGetTxt5, "C257401");
    }

    public static void Check6() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(HelpsProviderBlock6));
        String txtGetText = element0.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, HelpsProviderGetTxt6, "C257401");
    }

    public static void Check7() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(HelpsProviderBlock7));
        String txtGetText = element0.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, HelpsProviderGetTxt7, "C257401");
    }

    public static void Check8() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(HelpsProviderBlock8));
        String txtGetText = element0.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, HelpsProviderGetTxt8, "C257401");
    }

    public static void Check9() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(HelpsProviderBlock9));
        String txtGetText = element0.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, HelpsProviderGetTxt9, "C257401");
    }

    public static void Check10() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(HelpsProviderBlock10));
        String txtGetText = element0.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, HelpsProviderGetTxt10, "C257401");
    }

    public static void BlockPreMenu() throws InterruptedException {
        Scroll0();
        waitUntil(HelpsProviderPreMenu);
        Scroll500();
        waitUntil(HelpsProviderPreMenu);
        Scroll1000();
        waitUntil(HelpsProviderPreMenu);
        Scroll1500();
        waitUntil(HelpsProviderPreMenu);
        Scroll2000();
        waitUntil(HelpsProviderPreMenu);
        Scroll2500();
        waitUntil(HelpsProviderPreMenu);
        Scroll3000();
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        GoToProvidingHeplpsProvider();
        Check0();
        Check1();
        Check3();
        Check4();
        Scroll1000();
        Check5();
        Check6();
        Check7();
        Check8();
        Scroll1500();
        Check9();
        Check10();
        BlockPreMenu();
    }
}