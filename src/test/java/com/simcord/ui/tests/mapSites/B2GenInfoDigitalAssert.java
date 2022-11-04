package com.simcord.ui.tests.mapSites;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathRoadMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathRoadMap.Blockchain;
import static com.simcord.ui.tests.XpathSelectors.XpathRoadMap.WhatsIsDigitalAssert;

public class B2GenInfoDigitalAssert extends Methods {
    //C236432	Нажатие на каждую гиперссылку -> отображение статьи в основной рабочей области страницы
    public static String GetLink;

    public static String Blockchain() throws InterruptedException {
        ClickIconMapSites();
        WebElement element2 = driver.findElement(By.xpath(XpathRoadMap.RoadMapGenInfDigitalAsset));
        element2.click();
        WaitLoadPage();
        waitUntil(XpathRoadMap.RoadMapGenInfDigitalAssetME);
        return GetLink;
    }

    public static void Result() throws InterruptedException {
        String GetLink = driver.getCurrentUrl();
//        System.out.println(GetLink);
//        System.out.println(Developers);
        Assert.assertEquals(GetLink, WhatsIsDigitalAssert, "Pass Test C236432");
    }


    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        Blockchain();
        Result();

    }
}