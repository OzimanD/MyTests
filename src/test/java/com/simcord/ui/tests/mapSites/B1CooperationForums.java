package com.simcord.ui.tests.mapSites;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathRoadMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathRoadMap.Forums;
import static com.simcord.ui.tests.XpathSelectors.XpathRoadMap.Institutes;

public class B1CooperationForums extends Methods {
    //C236432	Нажатие на каждую гиперссылку -> отображение статьи в основной рабочей области страницы
    public static String GetLink;

    public static String Forums() throws InterruptedException {
        ClickIconMapSites();
        WebElement element2 = driver.findElement(By.xpath(XpathRoadMap.RoadMapCooperationForums));
        element2.click();
        WaitLoadPage();
        waitUntil(XpathRoadMap.RoadMapCooperationForumsME);
        return GetLink;
    }

    public static void Result() throws InterruptedException {
        String GetLink = driver.getCurrentUrl();
//        System.out.println(GetLink);
//        System.out.println(Developers);
        Assert.assertEquals(GetLink, Forums, "Pass Test C236432");
    }


    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        Forums();
        Result();

    }
}