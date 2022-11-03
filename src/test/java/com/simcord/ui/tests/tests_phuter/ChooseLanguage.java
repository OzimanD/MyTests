package com.simcord.ui.tests.tests_phuter;

import com.simcord.ui.tests.XpathSelectors.Methods;
import com.simcord.ui.tests.XpathSelectors.XpathFutter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.simcord.ui.tests.XpathSelectors.XpathFutter.txtFactLanguageBoard;

public class ChooseLanguage extends Methods {
    //C236423	Выбор языка ->
    // выпадающий список доступных языков в раскрывающемся виде под футером + стрелочка меняет свое положение при раскрытом/закрытом виде *
    public static void ChoseLanguage() {
        WebElement element2 = driver.findElement(By.xpath(XpathFutter.FutterChoseLanguage));
        element2.click();
        waitUntil(XpathFutter.FutterChoseLanguageME);

    }

    public static void Result() {
        WebElement element = driver.findElement(By.xpath(XpathFutter.FutterChoseLanguageEn));
        String txtGet = element.getText();
//        System.out.println(element.getText());

        Assert.assertEquals(txtGet, txtFactLanguageBoard, "C236423	Выбор языка");
    }

    @Test(description = "Tests of Futter")
    public static void Check() throws InterruptedException {
        ChoseLanguage();
        WaitLoadPage();
        Result();

    }
}