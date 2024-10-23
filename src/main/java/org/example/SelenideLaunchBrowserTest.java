package org.example;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$$;

public class SelenideLaunchBrowserTest {
    @Test
    public void launchBrowser(){

        // This set the browser firefox
        Configuration.browser = "firefox";


        open("https://www.google.com/");


        //Interacts with the webElements
        // $ -> means findElement
        $(By.name("q")).setValue("Naveen AutomationLabs");
        $(By.name("btnK")).click();
        //Assertions
        $(By.id("logo")).shouldHave(Condition.appear);
        String header = $(By.xpath("//h3[contains(text(),'Welcome to Naveen AutomationLabs - naveen automationlabs')]")).getText();
        System.out.println(header);
        Assert.assertEquals(header,"Welcome to Naveen AutomationLabs - naveen automationlabs");

        // $$ -> means findElements
        int numOfHeaders = $$(By.cssSelector(".LC20lb.DKV0Md")).size();
        System.out.println(numOfHeaders);
        $$(By.cssSelector(".LC20lb.DKV0Md")).shouldHave(CollectionCondition.size(13));

    }
}
