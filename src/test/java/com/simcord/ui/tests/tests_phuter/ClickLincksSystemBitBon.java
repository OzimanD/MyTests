package com.simcord.ui.tests.tests_phuter;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathFutter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ClickLincksSystemBitBon extends Methods {
    //	C236419	Каждая категория -> список статей-гиперссылок
    //  C236420	Нажатие на гиперссылку -> переход к отображению статьи в основной рабочей области
    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {

        ((JavascriptExecutor)driver).executeScript("scroll(0,5000)");
        //Новости
        WebElement element1 = driver.findElement(By.xpath(XpathFutter.FutterSystemBitBonNews));
        element1.click();
        waitUntil(XpathFutter.FutterSystemBitBonNewsME);
        String Link1 = driver.getCurrentUrl();
        driver.navigate().back();
        //Экономико-правовая природа
        WebElement element2 = driver.findElement(By.xpath(XpathFutter.FutterSystemBitBonEconomic));
        element2.click();
        waitUntil(XpathFutter.FutterSystemBitBonEconomicME);
        String Link2 = driver.getCurrentUrl();
        driver.navigate().back();
        //Технологическая природа
        WebElement element3 = driver.findElement(By.xpath(XpathFutter.FutterSystemBitBonTechnology));
        element3.click();
        waitUntil(XpathFutter.FutterSystemBitBonTechnologyME);
        String Link3 = driver.getCurrentUrl();
        driver.navigate().back();
        //Приобрести BitBon
        WebElement element4 = driver.findElement(By.xpath(XpathFutter.FutterSystemBitBonBuyBitBon));
        element4.click();
        waitUntil(XpathFutter.FutterSystemBitBonBuyBitBonME);
        String Link4 = driver.getCurrentUrl();
        driver.navigate().back();
        //Сервис Bonpay
        WebElement element5 = driver.findElement(By.xpath(XpathFutter.FutterSystemBitBonServiceBonpay));
        element5.click();
        waitUntil(XpathFutter.FutterSystemBitBonServiceBonpayME);
        String Link5 = driver.getCurrentUrl();
        driver.navigate().back();
        //Протокол Bitbon
        WebElement element6 = driver.findElement(By.xpath(XpathFutter.FutterSystemBitBonProtocolBitBon));
        element6.click();
        waitUntil(XpathFutter.FutterSystemBitBonProtocolBitBonME);
        String Link6 = driver.getCurrentUrl();
        driver.navigate().back();
        //Обеспечение безопасности
        WebElement element7 = driver.findElement(By.xpath(XpathFutter.FutterSystemBitBonSecurity));
        element7.click();
        waitUntil(XpathFutter.FutterSystemBitBonSecurityME);
        String Link7 = driver.getCurrentUrl();
        driver.navigate().back();
        //Термины и определения
        WebElement element8 = driver.findElement(By.xpath(XpathFutter.FutterSystemBitBonTermins));
        element8.click();
        waitUntil(XpathFutter.FutterSystemBitBonTerminsME);
        String Link8 = driver.getCurrentUrl();
        driver.navigate().back();

        Assert.assertTrue(Link1.equals(XpathFutter.s22) & Link2.equals(XpathFutter.s23) & Link3.equals(XpathFutter.s24) &
                Link4.equals(XpathFutter.s25) & Link5.equals(XpathFutter.s26) & Link6.equals(XpathFutter.s27) &
                Link7.equals(XpathFutter.s28) & Link8.equals(XpathFutter.s29),"Pass Test C236420");

    }
}
