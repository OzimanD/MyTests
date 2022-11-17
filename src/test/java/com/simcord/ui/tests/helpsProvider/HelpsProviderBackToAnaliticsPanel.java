package com.simcord.ui.tests.helpsProvider;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class HelpsProviderBackToAnaliticsPanel extends Methods {

    //      C257404	Наведение на пункт перехода "Аналитическая панель Регистратора" -> курсор изменяется на "руку"

    public static void GoToProvidingHeplpsProvider() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.HeaderProviding));
        element.click();
        WaitLoadPage();
        WebElement element1 = driver.findElement(By.xpath(HelpsProvider));
        element1.click();

    }

    public static void BackAnaliticPanel() throws InterruptedException {
        waitUntil(HelpsProviderPreMenu);
        WebElement element = driver.findElement(By.xpath(HelpsProviderPreMenu));
        element.click();
        WaitLoadPage();
        String Link = driver.getCurrentUrl();
        Assert.assertEquals(Link, AboutSystemBitBonLinksProviding5, "C257404");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        GoToProvidingHeplpsProvider();
        BackAnaliticPanel();
    }
}