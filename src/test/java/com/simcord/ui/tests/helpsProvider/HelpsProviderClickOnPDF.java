package com.simcord.ui.tests.helpsProvider;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class HelpsProviderClickOnPDF extends Methods {

    //      C257404	Наведение на пункт перехода "Аналитическая панель Регистратора" -> курсор изменяется на "руку"

    public static void GoToProvidingHeplpsProvider() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.HeaderProviding));
        element.click();
        WaitLoadPage();

    }

    public static void GoToPDFProviding() throws InterruptedException {
        WaitLoadPage();
        WebElement element = driver.findElement(By.xpath(HelpsProviderPDF1));
        element.click();
        WaitLoadPage();
        WaitLoadPage();
        WaitLoadPage();
        driver.switchTo().;
        driver.close();
        WaitLoadPage();
        WaitLoadPage();
        WaitLoadPage();
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        GoToProvidingHeplpsProvider();
        GoToPDFProviding();

    }
}
