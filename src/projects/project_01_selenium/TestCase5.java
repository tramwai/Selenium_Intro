package projects.project_01_selenium;

import com.sun.deploy.security.ruleset.DefaultRule;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class TestCase5 {
    public static void main(String[] args) {
        /**
        Validate Automation Exercise site Test Cases page
        Given user navigates to “https://automationexercise.com/”
        When user clicks on “Test Cases” header item
        Then validate user is navigated to “Test Cases” page successfully by it’s title and url
        Expected URL = https://automationexercise.com/test_cases
        Expected Title = Automation Practice Website for UI Testing - Test Cases
         */
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");
        Waiter.pause(3);

        WebElement testCasesPage = driver.findElement(By.xpath("(//div[@class='shop-menu pull-right']//a)[5]"));
        testCasesPage.click();
        Waiter.pause(3);
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        Driver.quitDriver();
    }
}
