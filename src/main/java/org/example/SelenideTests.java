package org.example;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collections;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SelenideTests {
@Test
    public void searchBaeldung(){
    //Launch the browser and visit page same time
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
