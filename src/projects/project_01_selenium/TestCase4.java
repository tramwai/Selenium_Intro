package projects.project_01_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class TestCase4 {
    public static void main(String[] args) {
        /**
         Validate Automation Exercise site footer
        Given user navigates to “https://automationexercise.com/”
        Then user should see “Copyright © 2021 All rights reserved” text in the footer
         */
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");
        Waiter.pause(3);

        // “Copyright © 2021 All rights reserved” text in the footer
        WebElement textFooter = driver.findElement(By.cssSelector("p[class='pull-left']"));
        System.out.println("text in the footer is displayed = " + textFooter.isDisplayed());
        System.out.println("text footer is: " + textFooter.getText());


        Driver.quitDriver();
    }
}
