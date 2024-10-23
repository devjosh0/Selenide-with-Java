package org.example;

import com.codeborne.selenide.WebDriverRunner;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.open;

public class WebdriverRunner {
    @Test
    public void testSelenide(){

        open("https://www.google.com/");
        WebDriverRunner.getWebDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        WebDriverRunner.getWebDriver().manage().window().maximize();
        WebDriverRunner.clearBrowserCache();
        System.out.println(WebDriverRunner.getAndCheckWebDriver().getTitle());


    }
}
