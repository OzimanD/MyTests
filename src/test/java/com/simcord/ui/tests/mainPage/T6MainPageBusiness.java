package com.simcord.ui.tests.mainPage;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathMainPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathMainPage.*;

public class T6MainPageBusiness extends Methods {
    //C235319	Вся область плашки"Бизнес" кликабельна -> переход на страницу "Бизнес"

    public static void Check1() throws InterruptedException {
        WebElement element = driver.findElement(By.xpath(XpathMainPage.BusinessBox));
        element.click();
        WaitLoadPage();
        String txtGetLink = driver.getCurrentUrl();
        waitUntil(BusinessME);
//        System.out.println(txtGetLink);
        Assert.assertEquals(txtGetLink, LinkBusinessMP, "C235319");

    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        scroll(500);
        Check1();
    }
}