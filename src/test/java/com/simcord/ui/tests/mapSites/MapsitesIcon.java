package com.simcord.ui.tests.mapSites;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathFutter;
import com.simcord.ui.tests.XpathSelectors.XpathRoadMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathFutter.Years;
import static com.simcord.ui.tests.XpathSelectors.XpathRoadMap.RoadMapLinks;

public class MapsitesIcon extends Methods {
    //	C236431	Нажатие на иконку карты сайта -> отобразить карту сайта согласно дизайна

    public static void ClickIconMapSites() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathRoadMap.RoadMapButton));
        element.click();
        Thread.sleep(1000);
    }

    public static void Result() {
        WebElement element = driver.findElement(By.xpath(XpathRoadMap.RoadMap));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, RoadMapLinks, "C236423	Выбор языка");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        ClickIconMapSites();
        Result();

    }
}
