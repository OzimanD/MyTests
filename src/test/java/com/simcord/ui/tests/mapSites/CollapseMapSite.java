package com.simcord.ui.tests.mapSites;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathRoadMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathRoadMap.InfoHeader;
import static com.simcord.ui.tests.XpathSelectors.XpathRoadMap.RoadMapLinks;

public class CollapseMapSite extends Methods {
    //C236433	Нажатие на "крестик" -> свернуть карту сайта

    public static void ClickIconMapSites() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathRoadMap.RoadMapButton));
        element.click();
        Thread.sleep(1000);
    }

    public static void Result() {
        WebElement element = driver.findElement(By.xpath(XpathRoadMap.RoadMap));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, RoadMapLinks, "C236431");
    }

    public static void ClickCollapse() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathRoadMap.RoadMapClickX));
        element.click();
        Thread.sleep(1000);
    }

//    public static void CheckCollapse() {
//
//    }

    public static void ResultCollapse() {
        WebElement element = driver.findElement(By.xpath(XpathRoadMap.HeaderStrings));
        String txtGetText = element.getText();
        Assert.assertEquals(txtGetText, InfoHeader, "C236431");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        ClickIconMapSites();
        Result();
        ClickCollapse();
        ResultCollapse();
    }
}
