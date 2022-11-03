package com.simcord.ui.tests.tests_phuter;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathFutter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickPublickContact extends Methods {
    //C257313	Нажатие гиперссылки "Публичный контракт Системы Bitbon" ->
    // переход на страницу с Публичным контрактом
    public static boolean PublicContact() throws InterruptedException {
        WebElement element2 = driver.findElement(By.xpath(XpathFutter.FutterPublicContact));
        element2.click();
        WaitLoadPage();
        waitUntil(XpathFutter.FutterPublicContactME);
        String Link2 = driver.getCurrentUrl();
        boolean res2 = Link2.equals(XpathFutter.s43);
        return res2;
    }

    public static void Result() throws InterruptedException {
        Assert.assertTrue(PublicContact(), "Pass Test C236420");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        PublicContact();
        Result();

    }
}
