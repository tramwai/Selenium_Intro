package projects.project_01_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class TestCase2 {
    public static void main(String[] args) {
        /**
        Validate Automation Exercise site header items
        Given user navigates to “https://automationexercise.com/”
        Then validate all below header items are displayed and enabled and their text is as below
        Home
        Products
        Cart
        Signup / Login
        Test Cases
        API Testing
        Video Tutorials
        Contact us
         */
        WebDriver driver = Driver.getDriver();
        driver.get("https://automationexercise.com/");
        Waiter.pause(3);

        // Home header validation
        WebElement headerHome = driver.findElement(By.xpath("(//div[@class='shop-menu pull-right']/ul//a)[1]"));
        System.out.println("\nHome header validation");
        System.out.println("Home header is displayed = " + headerHome.isDisplayed());
        System.out.println("Home header is enabled = " + headerHome.isEnabled());
        System.out.println("Home header text is = " + headerHome.getText());

        // Products header validation
        WebElement headerProducts = driver.findElement(By.xpath("(//div[@class='shop-menu pull-right']/ul//a)[2]"));
        System.out.println("\nProducts header validation");
        System.out.println("Products header is displayed = " + headerProducts.isDisplayed());
        System.out.println("Products header is enabled = " + headerProducts.isEnabled());
        System.out.println("Products header text is = " + headerProducts.getText());

        // Cart header validation
        WebElement headerCart = driver.findElement(By.xpath("(//div[@class='shop-menu pull-right']/ul//a)[3]"));
        System.out.println("\nCart header validation");
        System.out.println("Cart header is displayed = " + headerCart.isDisplayed());
        System.out.println("Cart header is enabled = " + headerCart.isEnabled());
        System.out.println("Cart header text is = " + headerCart.getText());

        // Signup/Login header validation
        WebElement headerSignupLogin = driver.findElement(By.xpath("(//div[@class='shop-menu pull-right']/ul//a)[4]"));
        System.out.println("\nSignup/Login header validation");
        System.out.println("Signup/Login header is displayed = " + headerSignupLogin.isDisplayed());
        System.out.println("Signup/Login header is enabled = " + headerSignupLogin.isEnabled());
        System.out.println("Signup/Login header text is = " + headerSignupLogin.getText());

        // Test Cases header validation
        WebElement headerTestCases = driver.findElement(By.xpath("(//div[@class='shop-menu pull-right']/ul//a)[5]"));
        System.out.println("\nTestCases header validation");
        System.out.println("TestCases header is displayed = " + headerTestCases.isDisplayed());
        System.out.println("TestCases header is enabled = " + headerTestCases.isEnabled());
        System.out.println("TestCases header text is = " + headerTestCases.getText());

        // API Testing header validation
        WebElement headerAPITesting = driver.findElement(By.xpath("(//div[@class='shop-menu pull-right']/ul//a)[6]"));
        System.out.println("\nAPI Testing header validation");
        System.out.println("API Testing header is displayed = " + headerAPITesting.isDisplayed());
        System.out.println("API Testing header is enabled = " + headerAPITesting.isEnabled());
        System.out.println("API Testing header text is = " + headerAPITesting.getText());

        // Video Tutorials header validation
        WebElement headerVideoTutorials = driver.findElement(By.xpath("(//div[@class='shop-menu pull-right']/ul//a)[7]"));
        System.out.println("\nVideoTutorials header validation");
        System.out.println("VideoTutorials header is displayed = " + headerVideoTutorials.isDisplayed());
        System.out.println("VideoTutorials header is enabled = " + headerVideoTutorials.isEnabled());
        System.out.println("VideoTutorials header text is = " + headerVideoTutorials.getText());

        // Contact us header validation
        WebElement headerContactUs = driver.findElement(By.xpath("(//div[@class='shop-menu pull-right']/ul//a)[8]"));
        System.out.println("\nContact header validation");
        System.out.println("Contact header is displayed = " + headerContactUs.isDisplayed());
        System.out.println("Contact header is enabled = " + headerContactUs.isEnabled());
        System.out.println("Contact header text is = " + headerContactUs.getText());

        Driver.quitDriver();
    }
}
