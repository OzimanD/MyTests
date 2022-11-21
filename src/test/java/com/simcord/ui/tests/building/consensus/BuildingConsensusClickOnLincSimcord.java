package com.simcord.ui.tests.building.consensus;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class BuildingConsensusClickOnLincSimcord extends Methods {
    //	C257395	Нажатие на гиперссылку "Симкорд" -> в новой вкладке браузера открываются страница в соответствии с указанной ссылкой

    public static final String LinkSimcord = "https://www.simcord.com/ru?_ga=2.197197994.406741707.1669021486-1548049717.1664961709";

    public static void GoToBuildConsensus() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(RoadMapProvidingBuildConsens));
        element.click();
        WaitLoadPage();

    }

    public static void GoToPDF1Providing() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(BuildConsensLinkSimcord));
        element.click();
        GoToNewTabBrowser();
        String GetLink = driver.getCurrentUrl();
        System.out.println(driver.getCurrentUrl());
        Assert.assertEquals(GetLink, LinkSimcord, "C257395");
        CloseNewWindowBrowser();

    }


    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        Scroll5000();
        GoToBuildConsensus();
        GoToPDF1Providing();
    }
}
