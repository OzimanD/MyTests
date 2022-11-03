package com.simcord.ui.tests.tests_phuter;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathFutter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClicksLinkPoliceAML extends Methods {
    //C236421	Нажатиие Обратная связь -> переход на страницу Обратной связи
    public static boolean PrivacyPolicy() throws InterruptedException {
        WebElement element2 = driver.findElement(By.xpath(XpathFutter.FutterPrivacyPolicy));
        element2.click();
        WaitLoadPage();
        waitUntil(XpathFutter.FutterPrivacyPolicyME);
        String Link2 = driver.getCurrentUrl();
        back();
        boolean res2 = Link2.equals(XpathFutter.s45);
        return res2;
    }

    public static boolean UseCookies() throws InterruptedException {
        WebElement element2 = driver.findElement(By.xpath(XpathFutter.FutterUseCookies));
        element2.click();
        WaitLoadPage();
        waitUntil(XpathFutter.FutterUseCookiesME);
        String Link2 = driver.getCurrentUrl();
        back();
        boolean res2 = Link2.equals(XpathFutter.s46);
        return res2;
    }

    public static void Result() throws InterruptedException {
        Assert.assertTrue(PrivacyPolicy() && UseCookies(), "Pass Test C236420");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        PrivacyPolicy();
        WaitLoadPage();
        UseCookies();
        Result();

    }
}