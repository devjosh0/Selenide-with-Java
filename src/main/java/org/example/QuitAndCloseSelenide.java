package org.example;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.commands.ScrollTo;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class QuitAndCloseSelenide {

@Test
    public void testSelenide() throws InterruptedException {

        open("https://practice-automation.com/");
    SelenideElement element = $(By.xpath("//a[contains(text(),'Window Operations')]"));// parent - 0
    element.scrollIntoView(true);
    element.click();

    //Or You can use the WebDriverRunner

//    Actions actions = new Actions(WebDriverRunner.getWebDriver());
//    actions.moveToElement(element)
//                    .perform();


    element.click();
    $(By.xpath("//button/b[text()='New Window']")).click();// child - 1
        switchTo().window(1);
        Thread.sleep(5000);
       // System.out.println(title());
        //Close
        closeWindow();
        switchTo().window(0);
        System.out.println(title());
        //quit
        closeWebDriver();
    }

}
