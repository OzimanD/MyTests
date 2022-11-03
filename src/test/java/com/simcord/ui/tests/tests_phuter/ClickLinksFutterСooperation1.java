package com.simcord.ui.tests.tests_phuter;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathFutter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickLinksFutterСooperation1 extends Methods {
    //	C236419	Каждая категория -> список статей-гиперссылок
    //  C236420	Нажатие на гиперссылку -> переход к отображению статьи в основной рабочей области
    public static boolean Business() {
        WebElement element1 = driver.findElement(By.xpath(XpathFutter.FutterCooperationBusiness));
        element1.click();
        waitUntil(XpathFutter.FutterCooperationBusinessME);
        String Link1 = driver.getCurrentUrl();
        driver.navigate().back();
        waitUntil(XpathFutter.FutterProvidingAnaliticPanel);
        boolean res1 = Link1.equals(XpathFutter.s1);
        return res1;
    }

    public static boolean BitupAgency() {
        WebElement element2 = driver.findElement(By.xpath(XpathFutter.FutterCooperationBitupAgency));
        element2.click();
        waitUntil(XpathFutter.FutterCooperationBitupAgencyME);
        String Link2 = driver.getCurrentUrl();
        driver.navigate().back();
        boolean res2 = Link2.equals(XpathFutter.s2);
        return res2;
    }

    public static boolean Operators() {
        WebElement element3 = driver.findElement(By.xpath(XpathFutter.FutterCooperationOperators));
        element3.click();
        waitUntil(XpathFutter.FutterCooperationOperatorsME);
        String Link3 = driver.getCurrentUrl();
        driver.navigate().back();
        boolean res3 = Link3.equals(XpathFutter.s3);
        return res3;
    }

    public static boolean Developers() throws InterruptedException {
        WebElement element4 = driver.findElement(By.xpath(XpathFutter.FutterCooperationDevelopers));
        element4.click();
        WaitLoadPage();
        waitUntil(XpathFutter.FutterCooperationDevelopersME);
        String Link4 = driver.getCurrentUrl();
        driver.navigate().back();
        boolean res4 = Link4.equals(XpathFutter.s4);
        return res4;
    }

    public static void Result() throws InterruptedException {
        Assert.assertTrue(Business() & BitupAgency() & Operators() &
                Developers(), "Pass Test C236420");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        //бизнесу
        WaitLoadPage();
        Business();
        //Агентам
        WaitLoadPage();
        BitupAgency();
        //Операторам
        WaitLoadPage();
        Operators();
        //Разработчикам
        WaitLoadPage();
        Developers();
        WaitLoadPage();
        
        Result();

    }
}
