package com.simcord.ui.tests.tests_phuter;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathFutter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathFutter.Years;
import static com.simcord.ui.tests.XpathSelectors.XpathFutter.txtFactLanguageBoard;

public class CheakYears extends Methods {

    //C257312	Год "до" меняется автоматически при наступлении нового года

    public static void Result() {
        WebElement element = driver.findElement(By.xpath(XpathFutter.FutterCheckYears));
        String txtGetYears = element.getText();
//        System.out.println(txtGetYears.substring(0, 9));
        Assert.assertEquals(txtGetYears.substring(0, 9), Years, "C236423	Выбор языка");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        Result();

    }
}