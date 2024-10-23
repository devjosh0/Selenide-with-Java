package org.example;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideIFrame {

    @Test
    public void handleIframe() throws InterruptedException {
        open("https://practice-automation.com/iframes/");
        SelenideElement selenideElement = $(By.id("frame2"));
        switchTo().frame(selenideElement);
        $(By.xpath("//button[contains(text(),'Login')]")).click();
        Thread.sleep(3000);
        SelenideElement frame3 = $(By.id("oneid-iframe"));
        switchTo().frame(frame3);
        SelenideElement email = $(By.xpath("//input[@id='InputIdentityFlowValue']"));
      email.setValue("husseinamadu.com");
      Thread.sleep(3000);
      switchTo().defaultContent();
      String confrimText = $(By.xpath("//a[contains(text(),'how to handle iframes in test automation')]")).getText();
        Assert.assertEquals(confrimText,"how to handle iframes in test automation");
        Thread.sleep(3000);
    }
}
