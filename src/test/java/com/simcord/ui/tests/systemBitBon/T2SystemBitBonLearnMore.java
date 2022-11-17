package com.simcord.ui.tests.systemBitBon;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class T2SystemBitBonLearnMore extends Methods {
//C257366	Нажатие на ссылку "Узнать больше" -> открывается страница соответствующая заголовку описанной статьи

    public static void GoToSystemBitBon() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBon));
        element.click();
        WaitLoadPage();

    }

    public static void Check1() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonLearnMore));
        element.click();
        WaitLoadPage();
        String txtGetText = driver.getCurrentUrl();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, AboutSystemBitBonLinkRoadMap1, "C257366");
    }

    public static void Check2() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(AboutSystemBitBonDigitalAsset));
        element0.click();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonLearnMore));
        element.click();
        WaitLoadPage();
        String txtGetText = driver.getCurrentUrl();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, AboutSystemBitBonLinkProtocolBitBon2, "C257366");
    }

    public static void Check3() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(AboutSystemBitBonOneSpace));
        element0.click();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonLearnMore));
        element.click();
        WaitLoadPage();
        String txtGetText = driver.getCurrentUrl();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, AboutSystemBitBonLinkOneSpace3, "C257366");
    }

    public static void Check4() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(AboutSystemBitBonBonPay));
        element0.click();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonLearnMore));
        element.click();
        WaitLoadPage();
        String txtGetText = driver.getCurrentUrl();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, AboutSystemBitBonLinksServicesBonPay4, "C257366");
    }

    public static void Check5() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(AboutSystemBitBonProviding));
        element0.click();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonLearnMore));
        element.click();
        WaitLoadPage();
        String txtGetText = driver.getCurrentUrl();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, AboutSystemBitBonLinksProviding5, "C257366");
    }

    public static void Check6() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(AboutSystemBitBonBusiness));
        element0.click();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonLearnMore));
        element.click();
        WaitLoadPage();
        String txtGetText = driver.getCurrentUrl();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, AboutSystemBitBonLinksBusiness6, "C257366");
    }

    public static void Check7() throws InterruptedException {
        WebElement element0 = driver.findElement(By.xpath(AboutSystemBitBonRoadMap));
        element0.click();
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.AboutSystemBitBonLearnMore));
        element.click();
        WaitLoadPage();
        String txtGetText = driver.getCurrentUrl();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, AboutSystemBitBonLinkRoadMap1, "C257366");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        GoToSystemBitBon();
        WaitLoadPage();
        Check1();
        back();
        Check2();
        back();
        Check3();
        back();
        Check4();
        back();
        Check5();
        back();
        Check6();
        back();
        Check7();

    }
}

