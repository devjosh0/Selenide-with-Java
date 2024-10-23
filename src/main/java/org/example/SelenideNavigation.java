package org.example;


import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class SelenideNavigation {
    @Test
    public void navigateBrowser() throws InterruptedException {
      open("https://www.google.com/");
        System.out.println(title());
        //Visit Site
        open("http://www.amazon.com");
        System.out.println(title());
        //Go Back
        back();
        System.out.println(title());
        //Forward
        forward();
        System.out.println(title());
        //back
        back();
        System.out.println(title());

        Thread.sleep(5000);
        refresh();
    }
}
