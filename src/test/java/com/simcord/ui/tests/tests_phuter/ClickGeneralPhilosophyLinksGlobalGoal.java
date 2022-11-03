package com.simcord.ui.tests.tests_phuter;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathFutter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickGeneralPhilosophyLinksGlobalGoal extends Methods {
    //	C236419	Каждая категория -> список статей-гиперссылок
    //  C236420	Нажатие на гиперссылку -> переход к отображению статьи в основной рабочей области
    public static boolean GlobalNet() throws InterruptedException {
        WebElement element2 = driver.findElement(By.xpath(XpathFutter.FutterGeneralPhilosophyGlobalNet));
        element2.click();
        WaitLoadPage();
        String Link2 = driver.getCurrentUrl();
        boolean res2 = Link2.equals(XpathFutter.s38);
        return res2;
    }

    public static void Result() throws InterruptedException {
        Assert.assertTrue(GlobalNet(), "Pass Test C236420");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        GlobalNet();
        Result();

    }
}