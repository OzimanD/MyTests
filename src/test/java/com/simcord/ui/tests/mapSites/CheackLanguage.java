package com.simcord.ui.tests.mapSites;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathRoadMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathRoadMap.RoadMapLinks;
import static com.simcord.ui.tests.XpathSelectors.XpathRoadMap.txtFactLanguageBoard;

public class CheackLanguage extends Methods {
    //	C246115	Выбор языка -> выпадающий список доступных языков в раскрывающемся виде
    //	под футером + стрелочка меняет свое положение при раскрытом/закрытом виде *

    public static void ClickIconMapSites() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathRoadMap.RoadMapButton));
        element.click();
        Thread.sleep(1000);
    }

    public static void ClickOnLanguagesDrop() {
        WebElement element = driver.findElement(By.xpath(XpathRoadMap.LanguagesDrop));
        element.click();
    }

    public static void Result() {
        WebElement element = driver.findElement(By.xpath(XpathRoadMap.LanguagesGetText));
        String txtGetText = element.getText();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetText, txtFactLanguageBoard, "C236431");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        ClickIconMapSites();
        ClickOnLanguagesDrop();
        WaitLoadPage();
        Result();

    }
}

