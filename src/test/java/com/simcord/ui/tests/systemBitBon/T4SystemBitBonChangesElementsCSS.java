package com.simcord.ui.tests.systemBitBon;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4SystemBitBonChangesElementsCSS extends Methods {
//	C257369	Активный подраздел имеет синий шрифт + вертикальная полоса слева от текста
//	C257370	Неактивный, доступный для выбора элемент имеет серый шрифтC257367	Меню подразделов отображает весь список подразделов с возможностью быстрого перехода между ними

    public static void GoToSystemBitBon() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBon));
        element.click();
        WaitLoadPage();

    }

    public static void Check1() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonBlock1_1));
        String txtGetText = element.getAttribute("class");
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, "_1MvD5 _3iaXH", "C257362");
    }

    public static void Check2() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonDigitalAsset));
        String txtGetText = element.getAttribute("class");
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, "_1MvD5", "C257362");
    }

    public static void Check3() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonOneSpace));
        String txtGetText = element.getAttribute("class");
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, "_1MvD5", "C257362");
    }

    public static void Check4() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonBonPay));
        String txtGetText = element.getAttribute("class");
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, "_1MvD5", "C257362");
    }

    public static void Check5() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonProviding));
        String txtGetText = element.getAttribute("class");
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, "_1MvD5", "C257362");
    }

    public static void Check6() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonBusiness));
        String txtGetText = element.getAttribute("class");
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, "_1MvD5", "C257362");
    }

    public static void Check7() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonRoadMap));
        String txtGetText = element.getAttribute("class");
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, "_1MvD5", "C257362");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        GoToSystemBitBon();
        WaitLoadPage();
        Check1();
        Check2();
        Check3();
        Check4();
        Check5();
        Check6();
        Check7();

    }
}