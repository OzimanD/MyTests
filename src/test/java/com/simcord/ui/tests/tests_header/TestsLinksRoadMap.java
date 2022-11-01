package com.simcord.ui.tests.tests_header;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathRoadMap;
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

public class TestsLinksRoadMap extends Methods {
    //C236411
    //Нажатие на выбранный пункт меню -> открытие соответствующего раздела
    @Test(description = "Tests of Header")
    public static void Check() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathRoadMap.RoadMapButton));
        element.click();
        WebElement element1 = driver.findElement(By.xpath(XpathRoadMap.RoadMap));
        Thread.sleep(500);
//            System.out.println(element1.getText());
        Thread.sleep(1500);
        String s = driver.getCurrentUrl();
        Assert.assertTrue(element1.getText().equals(XpathRoadMap.RoadMapLinks), "Pass Test C236411");
    }
}

