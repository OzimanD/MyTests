package com.simcord.ui.tests.tests_phuter;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathFutter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ClicksLoyInf extends Methods {
    //	C236419	Каждая категория -> список статей-гиперссылок
    //  C236420	Нажатие на гиперссылку -> переход к отображению статьи в основной рабочей области

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        Thread.sleep(500);
        ((JavascriptExecutor) driver).executeScript("scroll(0,5000)");
        Thread.sleep(500);
        //Публичный контакт
        WebElement element1 = driver.findElement(By.xpath(XpathFutter.FutterLoyInformPubContactPerformance));
        element1.click();
        Thread.sleep(1000);
        String Link1 = driver.getCurrentUrl();
        driver.navigate().back();
        //Производительность
        WebElement element2 = driver.findElement(By.xpath(XpathFutter.FutterLoyInformPerformance));
        element2.click();
        Thread.sleep(1500);
        String Link2 = driver.getCurrentUrl();
        driver.navigate().back();
        //Экономическое правовое поле
        WebElement element3 = driver.findElement(By.xpath(XpathFutter.FutterLoyInformEconomicField));
        element3.click();
        Thread.sleep(1000);
        String Link3 = driver.getCurrentUrl();
        driver.navigate().back();
        //Компания разработчик
        WebElement element4 = driver.findElement(By.xpath(XpathFutter.FutterLoyInformCorpDev));
        element4.click();
        Thread.sleep(1000);
        String Link4 = driver.getCurrentUrl();
        driver.navigate().back();


        if (Link1.equals(XpathFutter.s18) & Link2.equals(XpathFutter.s19) & Link3.equals(XpathFutter.s20) &
                Link4.equals(XpathFutter.s21)) {
            System.out.println("Pass Test C236420 ");
        } else {
            System.out.println("Fail Test C236420");
        }

    }
}

