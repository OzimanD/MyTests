package com.simcord.ui.tests.mainPage.oneSpaceCommunity;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class OneSpaceCommunityClickOnRoadMap extends Methods {
//	C257341	Нажатие на гиперссылку "Дорожная карта Системы Bitbon" -> в текущей вкладке открывается страница "Дорожная карта Системы Bitbon"

    public static void GoToOneSpaceComuniy() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.CommunityBox));
        element.click();
        WaitLoadPage();

    }

    public static void GoToOneSpaceRoadmap() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(XpathMainPage.CommunityRoadMap));
        element.click();
        WaitLoadPage();

    }

    public static void Check1() throws InterruptedException {
        WaitLoadPage();
        waitUntil(CommunityRoadMapME);
        String txtGetLink = driver.getCurrentUrl();
//        System.out.println(txtGetText);
        Assert.assertEquals(txtGetLink, LinkOneSpaceCommunityRoadmap, "C257341");
    }


    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        Scroll500();
        GoToOneSpaceComuniy();
        Scroll4000();
        GoToOneSpaceRoadmap();
        Check1();
    }
}

