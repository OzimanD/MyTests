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

public class TestAboutBitbon extends Methods {
    //C236411
    //Нажатие на выбранный пункт меню -> открытие соответствующего раздела
    @Test(description = "Tests of Header")
    public static void Check() throws InterruptedException {
        
        WebElement element = driver.findElement(By.xpath(XpathMainPage.HeaderAboutBitbon));
        element.click();
        String s1 = "http://stg.bitbon.space/ru/bitbon-system";
        Thread.sleep(1500);
        String Link = driver.getCurrentUrl();
        Assert.assertTrue(Link.equals(s1), "Pass Test C236411");
    }
}