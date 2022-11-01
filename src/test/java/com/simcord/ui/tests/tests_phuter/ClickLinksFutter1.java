package com.simcord.ui.tests.tests_phuter;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathFutter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ClickLinksFutter1 extends Methods {
    //	C236419	Каждая категория -> список статей-гиперссылок
    //  C236420	Нажатие на гиперссылку -> переход к отображению статьи в основной рабочей области

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,5000)");
        WebElement element1 = driver.findElement(By.xpath(XpathFutter.FutterContacts));
        element1.click();
        waitUntil(XpathFutter.FutterContactsME);
        String Link1 = driver.getCurrentUrl();
        String s1 = "http://stg.bitbon.space/ru/bitbon-system-public-contract";
        String s = driver.getCurrentUrl();
        Assert.assertTrue(Link1.equals(s1), "Pass Test C236420");
    }
}
