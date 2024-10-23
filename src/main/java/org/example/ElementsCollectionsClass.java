package org.example;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.open;

public class ElementsCollectionsClass {

    @Test
    public void getList(){
        open("https://practice-automation.com/");
        ElementsCollection collections = $$(By.xpath("//a[@class='wp-block-button__link wp-element-button']"));
      for(SelenideElement element : collections){
          String text = element.getText();
          System.out.println(text);
      }
    }
}
