package com.simcord.ui.tests.tests_phuter;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathFutter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickFeedback extends Methods {
    //C236421	Нажатиие Обратная связь -> переход на страницу Обратной связи
    public static boolean FutterFeedBack() throws InterruptedException {
        WebElement element2 = driver.findElement(By.xpath(XpathFutter.FutterFeedBack));
        element2.click();
        WaitLoadPage();
        waitUntil(XpathFutter.FutterFeedBackME);
        String Link2 = driver.getCurrentUrl();
        boolean res2 = Link2.equals(XpathFutter.s44);
        return res2;
    }

    public static void Result() throws InterruptedException {
        Assert.assertTrue(FutterFeedBack(), "Pass Test C236420");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        FutterFeedBack();
        Result();

    }
}