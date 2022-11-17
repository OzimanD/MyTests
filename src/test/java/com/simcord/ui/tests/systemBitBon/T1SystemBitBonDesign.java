package com.simcord.ui.tests.systemBitBon;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class T1SystemBitBonDesign extends Methods {
//C257362	Дизайн *
//		C257363	При переходе на страницу, по умолчанию, в меню перехода, выбран пункт "О Системе Bitbon"
//		C257364	Наведение на ссылку "Узнать больше" -> текст ссылки становится подчеркнутым + стрелка ">" должна сместиться вправо.
//		C257365	Контент описания статьи соответствует выбранному подразделу в меню перехода
    //	C257367	Меню подразделов отображает весь список подразделов с возможностью быстрого перехода между ними

    public static void GoToSystemBitBon() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBon));
        element.click();
        WaitLoadPage();

    }

    public static void Check1() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonBlock1));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, AboutSystemBitBonBlock1GetText, "C257362");
    }

    public static void Check2() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(AboutSystemBitBonDigitalAsset));
        element0.click();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonBlock1));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, AboutSystemBitBonBlock2GetText, "C257362");
    }

    public static void Check3() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(AboutSystemBitBonOneSpace));
        element0.click();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonBlock1));
        String txtGetText = element.getText();
        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, AboutSystemBitBonBlock3GetText, "C257362");
    }

    public static void Check4() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(AboutSystemBitBonBonPay));
        element0.click();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonBlock1));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, AboutSystemBitBonBlock4GetText, "C257362");
    }

    public static void Check5() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(AboutSystemBitBonProviding));
        element0.click();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonBlock1));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, AboutSystemBitBonBlock5GetText, "C257362");
    }

    public static void Check6() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(AboutSystemBitBonBusiness));
        element0.click();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonBlock1));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, AboutSystemBitBonBlock6GetText, "C257362");
    }

    public static void Check7() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(AboutSystemBitBonRoadMap));
        element0.click();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonBlock1));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, AboutSystemBitBonBlock7GetText, "C257362");
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
