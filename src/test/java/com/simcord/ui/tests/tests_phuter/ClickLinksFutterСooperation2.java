package com.simcord.ui.tests.tests_phuter;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathFutter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickLinksFutterСooperation2 extends Methods {
    public static boolean Exchanges() throws InterruptedException {
        WebElement element5 = driver.findElement(By.xpath(XpathFutter.FutterCooperationExchanges));
        element5.click();
        WaitLoadPage();
        waitUntil(XpathFutter.FutterCooperationExchangesME);
        String Link5 = driver.getCurrentUrl();
        driver.navigate().back();
        boolean res5 = Link5.equals(XpathFutter.s5);
        return res5;
    }

    public static boolean Lawyers() throws InterruptedException {
        WebElement element6 = driver.findElement(By.xpath(XpathFutter.FutterCooperationLawyers));
        element6.click();
        WaitLoadPage();
        waitUntil(XpathFutter.FutterCooperationLawyersME);
        String Link6 = driver.getCurrentUrl();
        driver.navigate().back();
        boolean res6 = Link6.equals(XpathFutter.s6);
        return res6;
    }

    public static boolean Institutes() {
        WebElement element7 = driver.findElement(By.xpath(XpathFutter.FutterCooperationInstitutes));
        element7.click();
        waitUntil(XpathFutter.FutterCooperationInstitutesME);
        String Link7 = driver.getCurrentUrl();
        driver.navigate().back();
        boolean res7 = Link7.equals(XpathFutter.s7);
        return res7;
    }

    public static boolean Forums() {
        WebElement element8 = driver.findElement(By.xpath(XpathFutter.FutterCooperationForums));
        element8.click();
        waitUntil(XpathFutter.FutterCooperationForumsME);
        String Link8 = driver.getCurrentUrl();
        driver.navigate().back();
        boolean res8 = Link8.equals(XpathFutter.s8);
        return res8;
    }

    public static boolean States() {
        WebElement element9 = driver.findElement(By.xpath(XpathFutter.FutterCooperationStates));
        element9.click();
        waitUntil(XpathFutter.FutterCooperationStatesME);
        String Link9 = driver.getCurrentUrl();
        driver.navigate().back();
        boolean res9 = Link9.equals(XpathFutter.s9);
        return res9;
    }

    public static void Result() throws InterruptedException {
        Assert.assertTrue(Exchanges() & Lawyers() & Institutes() &
                Forums() & States(), "Pass Test C236420");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {


        Exchanges();
        //Юристам
        WaitLoadPage();
        Lawyers();
        //Институтам
        WaitLoadPage();
        Institutes();
        //Форум и СМИ
        WaitLoadPage();
        Forums();
        //Государствам
        WaitLoadPage();
        States();


    }
}