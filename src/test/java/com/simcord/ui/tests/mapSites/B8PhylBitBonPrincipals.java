package com.simcord.ui.tests.mapSites;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathRoadMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathRoadMap.PhilosophyPrincipals;

public class B8PhylBitBonPrincipals extends Methods {
    //C236432	Нажатие на каждую гиперссылку -> отображение статьи в основной рабочей области страницы
    public static String GetLink;

    public static String PhilosophyPrincipals() throws InterruptedException {
        ClickIconMapSites();
        WebElement element2 = driver.findElement(By.xpath(XpathRoadMap.RoadMapGeneralPhilosophyPrincipals));
        element2.click();
        WaitLoadPage();
        waitUntil(XpathRoadMap.RoadMapGeneralPhilosophyPrincipalsME);
        return GetLink;
    }

    public static void Result() throws InterruptedException {
        String GetLink = driver.getCurrentUrl();
//        System.out.println(GetLink);
//        System.out.println(Developers);
        Assert.assertEquals(GetLink, PhilosophyPrincipals, "Pass Test C236432");
    }


    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        // TODO: Тест падает на шаге ниже, посмотреть, что не так
        //  Ошибка: org.openqa.selenium.TimeoutException:
        //  Expected condition failed: waiting for presence of element located by:
        //  By.xpath: /html/body/div/div[1]/main/div/section/div[4]/div[1]/div/h1
        //  (tried for 10 second(s) with 500 milliseconds interval)
        PhilosophyPrincipals();
        Result();

    }
}
