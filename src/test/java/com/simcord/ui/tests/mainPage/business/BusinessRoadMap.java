package com.simcord.ui.tests.mainPage.business;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class BusinessRoadMap extends Methods {
//	C257341	Нажатие на гиперссылку "Дорожная карта Системы Bitbon" -> в текущей вкладке открывается страница "Дорожная карта Системы Bitbon"

    public static void GoToOneSpaceComuniy() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.BusinessBox));
        element.click();
        WaitLoadPage();

    }

    public static void GoToOneSpaceRoadmap() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.BusinessRoadMap));
        element.click();
        WaitLoadPage();

    }

    public static void Check1() throws InterruptedException {
        WaitLoadPage();
        waitUntil(BusinessRoadMapME);
        String txtGetLink = driver.getCurrentUrl();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetLink, LinkBusinessCommunityRoadmap, "C257341");
    }


    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        GoToOneSpaceComuniy();
        scroll(500);
        GoToOneSpaceRoadmap();
        Check1();
    }
}

