package projects.project_01_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class TestCase3 {
    public static void main(String[] args) {

        /**
        Test Case 3: Validate Automation Exercise site SUBSCRIPTION form
        Given user navigates to “https://automationexercise.com/”
        Then user should see heading2 as “SUBSCRIPTION”
        And user should see and email input box with “Your email address” placeholder
        And user should see arrow submit button
        And user should see “Get the most recent updates from our site and be updated your self...” text under the email input box
         */
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");
        Waiter.pause(3);

        // heading2 as “SUBSCRIPTION”
        WebElement heading2 = driver.findElement(By.cssSelector("div[class='single-widget']>h2"));
        System.out.println("Heading2 is displayed = " + heading2.isDisplayed() + "\n");
        System.out.println("heading2 = SUBSCRIPTION = " + heading2.getText() + "\n");

        // email input box
        WebElement emailInputBox = driver.findElement(By.id("susbscribe_email"));
        System.out.println("Email input box with “Your email address” placeholder is displayed = " + emailInputBox.isDisplayed() + "\n");
        System.out.println("email input box placeholder message is: " + emailInputBox.getAttribute("placeholder") + "\n");

        // arrow submit button
        WebElement arrowSubmitButton = driver.findElement(By.id("subscribe"));
        System.out.println("Arrow submit button is displayed = " + arrowSubmitButton.isDisplayed() + "\n");

        // text under the email input box
        WebElement textUnderBox = driver.findElement(By.xpath("//div[@class='single-widget']//p"));
        System.out.println("text under the email input box is displayed = " + textUnderBox.isDisplayed() + "\n");
        System.out.println("text under the email input box is: " + textUnderBox.getText() + "\n");

        Driver.quitDriver();

    }
}
