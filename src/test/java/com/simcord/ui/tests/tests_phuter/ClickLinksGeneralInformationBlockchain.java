package com.simcord.ui.tests.tests_phuter;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathFutter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ClickLinksGeneralInformationBlockchain extends Methods {
    //	C236419	Каждая категория -> список статей-гиперссылок
    //  C236420	Нажатие на гиперссылку -> переход к отображению статьи в основной рабочей области
    public static boolean Blockchain() throws InterruptedException {
        WebElement element1 = driver.findElement(By.xpath(XpathFutter.FutterGenInfBlockchain));
        element1.click();
        WaitLoadPage();
        String Link1 = driver.getCurrentUrl();
//        driver.navigate().back();
        boolean res1 = Link1.equals(XpathFutter.s10);
        return res1;
    }
    

    public static void Result() throws InterruptedException {
        Assert.assertTrue(Blockchain(), "Pass Test C236420");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        Blockchain();
        Result();
    }
}