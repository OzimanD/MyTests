package com.simcord.ui.tests.mapSites;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathRoadMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class B1CooperationBusiness extends Methods {
    //C236432	Нажатие на каждую гиперссылку -> отображение статьи в основной рабочей области страницы
    public static String GetLink;

    public static String CooperationBusiness() throws InterruptedException {
        ClickIconMapSites();
        WebElement element2 = driver.findElement(By.xpath(XpathRoadMap.RoadMapCooperationBusiness));
        element2.click();
        WaitLoadPage();
        WaitLoadPage();
        waitUntil(XpathRoadMap.RoadMapCooperationBusinessME);
        return GetLink;
    }

    public static void Result() throws InterruptedException {
        String Business = XpathRoadMap.Business;
//        System.out.println(GetLink);
        String GetLink = driver.getCurrentUrl();
        Assert.assertEquals(GetLink, Business, "Pass Test C236432");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        CooperationBusiness();
        Result();

    }
}