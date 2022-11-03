package com.simcord.ui.tests.tests_phuter;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathFutter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClikcsSupportsHelpsProvider extends Methods {
    //	C236419	Каждая категория -> список статей-гиперссылок
    //  C236420	Нажатие на гиперссылку -> переход к отображению статьи в основной рабочей области
    public static boolean HelpsProvider() throws InterruptedException {
        WebElement element2 = driver.findElement(By.xpath(XpathFutter.FutterSupportsHelpsProvider));
        element2.click();
        WaitLoadPage();
        String Link2 = driver.getCurrentUrl();
        boolean res2 = Link2.equals(XpathFutter.s41);
        return res2;
    }

    public static void Result() throws InterruptedException {
        Assert.assertTrue(HelpsProvider(), "Pass Test C236420");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        HelpsProvider();
        Result();

    }
}