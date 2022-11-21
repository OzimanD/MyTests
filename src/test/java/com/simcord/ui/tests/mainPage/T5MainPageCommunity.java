package com.simcord.ui.tests.mainPage;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class T5MainPageCommunity extends Methods {
//      C235318	Вся область область плашки "Сообщество" кликабельна -> переход на страницу "Сообщество"

    public static void Check1() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.CommunityBox));
        element.click();
        WaitLoadPage();
        String txtGetLink = driver.getCurrentUrl();
        waitUntil(CommunityME);
//        System.out.println(txtGetLink);
        Assert.assertEquals(txtGetLink, LinkCommunityMP, "C235318");

    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        Scroll500();
        Check1();
    }
}
