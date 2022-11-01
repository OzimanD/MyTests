package com.simcord.ui.tests.tests_header;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestAuditAndStatistics extends Methods {
    //C236411
    //Нажатие на выбранный пункт меню -> открытие соответствующего раздела
    @Test(description = "Tests of Header")
    public static void Check() throws InterruptedException {

        WebElement element = driver.findElement(By.xpath(XpathMainPage.AuditAndStatistic));
        element.click();
        String s1 = "http://stg.bitbon.space/ru/blockchain/transactions-in-bitbon-system";
        Thread.sleep(1500);
        String Link1 = driver.getCurrentUrl();
        Assert.assertTrue(Link1.equals(s1), "Pass Test C236411");
    }
}