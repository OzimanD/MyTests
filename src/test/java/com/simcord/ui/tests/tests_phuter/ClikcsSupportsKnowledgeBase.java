package com.simcord.ui.tests.tests_phuter;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathFutter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClikcsSupportsKnowledgeBase extends Methods {
    //	C236419	Каждая категория -> список статей-гиперссылок
    //  C236420	Нажатие на гиперссылку -> переход к отображению статьи в основной рабочей области
    public static boolean KnowledgeBase() throws InterruptedException {
        WebElement element2 = driver.findElement(By.xpath(XpathFutter.FutterSupportsKnowledgeBase));
        element2.click();
        WaitLoadPage();
        String Link2 = driver.getCurrentUrl();
        boolean res2 = Link2.equals(XpathFutter.s39);
        return res2;
    }

    public static void Result() throws InterruptedException {
        Assert.assertTrue(KnowledgeBase(), "Pass Test C236420");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        KnowledgeBase();
        Result();

    }
}