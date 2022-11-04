package com.simcord.ui.tests.mapSites;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathRoadMap;
import com.sun.jdi.Method;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathRoadMap.BitUpAgent;
import static com.simcord.ui.tests.XpathSelectors.XpathRoadMap.Operators;

public class B1CooperationOperators extends Methods {
    //C236432	Нажатие на каждую гиперссылку -> отображение статьи в основной рабочей области страницы
    public static String GetLink;

    public static String Operators() throws InterruptedException {
        ClickIconMapSites();
        WebElement element2 = driver.findElement(By.xpath(XpathRoadMap.RoadMapCooperationOperators));
        element2.click();
        WaitLoadPage();
        waitUntil(XpathRoadMap.RoadMapCooperationOperatorsME);
        return GetLink;
    }

    public static void Result() throws InterruptedException {
        String GetLink = driver.getCurrentUrl();
//        System.out.println(GetLink);
//        System.out.println(Operators);
        Assert.assertEquals(GetLink, Operators, "Pass Test C236432");
    }


    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        Operators();
        Result();

    }
}