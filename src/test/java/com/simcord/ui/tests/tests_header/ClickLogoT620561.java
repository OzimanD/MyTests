package com.simcord.ui.tests.tests_header;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClickLogoT620561 extends Methods {
    @Test(description = "Tests of Header")
    public static void Check() throws InterruptedException {

            ((JavascriptExecutor) driver).executeScript("scroll(0,400)");
            WebElement element = driver.findElement(By.xpath(XpathMainPage.HeaderMain));
            element.click();
            String Link1 = driver.getCurrentUrl();
            Assert.assertTrue(Link1.equals(XpathMainPage.LinkMainPage),"Pass test T620561");
    }
}
