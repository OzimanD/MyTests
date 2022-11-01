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

public class TestChangeLogoRoadMap extends Methods {
    //C257299
    //Нажатие на "иконку вызова карты сайта" -> плавно меняется с точек на крестик + блок с картой сайта плавно выезжает вниз
    @Test(description = "Tests of Header")
    public static void Check() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.HeadetRoadMap));
        element.click();
        WebElement element1 = driver.findElement(By.xpath(XpathMainPage.HeadetRoadMap));
        Assert.assertTrue(element1.getAttribute("class").equals("icon-sitemap active"), "Pass Test C257299 ");
    }
}