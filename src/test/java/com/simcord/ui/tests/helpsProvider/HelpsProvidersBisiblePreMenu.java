package com.simcord.ui.tests.helpsProvider;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;
import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.HelpsProviderPreMenu;

public class HelpsProvidersBisiblePreMenu extends Methods {

    //      C257404	Наведение на пункт перехода "Аналитическая панель Регистратора" -> курсор изменяется на "руку"

    public static void GoToProvidingHeplpsProvider() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.HeaderProviding));
        element.click();
        WaitLoadPage();
        WebElement element1 = driver.findElement(By.xpath(HelpsProvider));
        element1.click();

    }

    public static void BlockPreMenu() throws InterruptedException {
        Scroll0();
        waitUntil(HelpsProviderPreMenu);
        Scroll500();
        waitUntil(HelpsProviderPreMenu);
        Scroll1000();
        waitUntil(HelpsProviderPreMenu);
        Scroll1500();
        waitUntil(HelpsProviderPreMenu);
        Scroll2000();
        waitUntil(HelpsProviderPreMenu);
        Scroll2500();
        waitUntil(HelpsProviderPreMenu);
        Scroll3000();
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        GoToProvidingHeplpsProvider();
        BlockPreMenu();
    }
}