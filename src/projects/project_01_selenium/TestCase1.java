package projects.project_01_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class TestCase1 {
    public static void main(String[] args) {

        /**
        Validate Automation Exercise site logo
        Given user navigates to “https://automationexercise.com/”
        Then user should see logo on top-left
         */
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");
        System.out.println(driver.findElement(By.cssSelector("div[class='logo pull-left']>a img")).isDisplayed());


        Driver.quitDriver();
    }
}
