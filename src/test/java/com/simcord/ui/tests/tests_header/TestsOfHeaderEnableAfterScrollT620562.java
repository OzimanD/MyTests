package com.simcord.ui.tests.tests_header;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;


public class TestsOfHeaderEnableAfterScrollT620562 extends Methods {
    @Test(description = "Tests of Header")
    public static void Check() throws InterruptedException {

        ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
        WebElement element = driver.findElement(By.xpath(XpathMainPage.HeaderLogo));
        element.click();
        String s1 = "http://stg.bitbon.space/ru";
        String s = driver.getCurrentUrl();
        Assert.assertTrue(s.equals(s1), "Pass Test T620562");
    }
}
