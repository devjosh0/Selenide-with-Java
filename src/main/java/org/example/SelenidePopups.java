package org.example;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.*;

public class SelenidePopups {
@Test
    public void testSelenide() throws InterruptedException {
    open("https://practice-automation.com/");

    //Handle it using Selenide

    $(By.xpath("//a[contains(text(),'Popups')]")).click();
    $(By.id("alert")).click();
    Alert alert = switchTo().alert();
    alert.accept();



    //Handle if using WebDriverRunner

//    SelenideElement element= $(By.xpath("//a[contains(text(),'Popups')]"));
//    Actions actions = new Actions(WebDriverRunner.getWebDriver());
//    actions.moveToElement(element)
//                    .perform();
//    element.click();
//    $(By.id("alert")).click();
//    WebDriverWait wait = new WebDriverWait(WebDriverRunner.getWebDriver(), Duration.ofSeconds(20));
//    Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//    Thread.sleep(3000);
//    alert.accept();

}
@Test
public void authAlert() throws InterruptedException {
    open("https://practice-automation.com/popups/");
    $(By.xpath("//button[@id = 'prompt']")).click();
    Alert alert = switchTo().alert();
    alert.sendKeys("Hello");
    Thread.sleep(3000);
   alert.accept();
  // open("","","","");
}
}
