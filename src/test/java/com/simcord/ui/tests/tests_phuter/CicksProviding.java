package com.simcord.ui.tests.tests_phuter;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathFutter;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CicksProviding extends Methods {
    //	C236419	Каждая категория -> список статей-гиперссылок
    //  C236420	Нажатие на гиперссылку -> переход к отображению статьи в основной рабочей области
    public static boolean AnaliticPanel() {
        WebElement element1 = driver.findElement(By.xpath(XpathFutter.FutterProvidingAnaliticPanel));
        element1.click();
        waitUntil(XpathFutter.FutterProvidingAnaliticPanelME);
        String Link1 = driver.getCurrentUrl();
        driver.navigate().back();
        waitUntil(XpathFutter.FutterProvidingAnaliticPanel);
        boolean res1 = Link1.equals(XpathFutter.s15);
        return res1;
    }

    public static boolean BuildConsens() {
        WebElement element2 = driver.findElement(By.xpath(XpathFutter.FutterProvidingBuildConsens));
        element2.click();
        waitUntil(XpathFutter.FutterProvidingBuildConsensME);
        String Link2 = driver.getCurrentUrl();
        driver.navigate().back();
        waitUntil(XpathFutter.FutterProvidingAnaliticPanel);
        boolean res2 = Link2.equals(XpathFutter.s16);
        return res2;
    }

    public static boolean BuildInfrastrucrur() {
        WebElement element3 = driver.findElement(By.xpath(XpathFutter.FutterProvidingBuildInfrastrucrur));
        element3.click();
        waitUntil(XpathFutter.FutterProvidingBuildInfrastrucrurME);
        String Link3 = driver.getCurrentUrl();
        driver.navigate().back();
        boolean res3 = Link3.equals(XpathFutter.s17);
        return res3;
    }

    public static void Result() {
        Assert.assertTrue((AnaliticPanel() && BuildConsens() && BuildInfrastrucrur()), "Pass Test C236420");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        AnaliticPanel();
        BuildConsens();
        BuildInfrastrucrur();

        Result();
    }
}
