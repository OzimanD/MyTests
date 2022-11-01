package com.simcord.ui.tests.tests_phuter;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathFutter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ClickAuditAndStatistics extends Methods {
    //	C236419	Каждая категория -> список статей-гиперссылок
    //  C236420	Нажатие на гиперссылку -> переход к отображению статьи в основной рабочей области

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        ((JavascriptExecutor) driver).executeScript("scroll(0,5000)");
        //Блокчекйн
//        WebElement element1 = driver.findElement(By.xpath(XpathFutter.FutterAuditAndStatisticsBlockChain));
//        element1.click();
//        waitUntil(XpathFutter.FutterAuditAndStatisticsBlockChainME);
//        String Link1 = driver.getCurrentUrl();
//        driver.navigate().back();
//        waitUntil(XpathFutter.FutterProvidingAnaliticPanel);
        //Сервисные сборы
        WebElement element2 = driver.findElement(By.xpath(XpathFutter.FutterAuditAndStatisticsServicesFees));
        element2.click();
        waitUntil(XpathFutter.FutterAuditAndStatisticsServicesFeesME);
        String Link2 = driver.getCurrentUrl();
        driver.navigate().back();
        //Програмные коды
        WebElement element3 = driver.findElement(By.xpath(XpathFutter.FutterAuditAndStatisticsProgramsCodes));
        element3.click();
        Thread.sleep(1000);
        waitUntil(XpathFutter.FutterAuditAndStatisticsProgramsCodesME);
        String Link3 = driver.getCurrentUrl();
        driver.navigate().back();
//        //Реестры
        WebElement element4 = driver.findElement(By.xpath(XpathFutter.FutterAuditAndStatisticsRegistry));
        element4.click();
        waitUntil(XpathFutter.FutterAuditAndStatisticsRegistryME);
        String Link4 = driver.getCurrentUrl();
        driver.navigate().back();

        Assert.assertTrue((/*Link1.equals(XpathFutter.s30) &*/ Link2.equals(XpathFutter.s31) & Link3.equals(XpathFutter.s32)), "Pass Test C236420");

    }
}

