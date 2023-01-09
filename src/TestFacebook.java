import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

import java.util.EventListener;

public class TestFacebook {
    public static void main(String[] args) {

/**
Go to https://www.facebook.com/
Validate the title of the page is “Facebook - Log In or Sign Up”
Validate the URL of the page is “https://www.facebook.com/”
Validate “facebook” logo is displayed
Validate heading2 “Connect with friends and the world around you on Facebook.” is displayed
Validate “Email or Phone Number” input box is displayed
Validate “Password” input box is displayed
Validate “Log In” button is displayed and enabled
Validate “Forgot Password?” link is displayed
Validate “Create New Account” button is displayed
 */

       try {
           // 1. set up driver
           WebDriver driver = Driver.getDriver();

           // 2. Validation

           // Go to https://www.facebook.com/
           driver.get("https://www.facebook.com/");
           Waiter.pause(2);

           //Validate the title of the page is “Facebook - Log In or Sign Up”
           if (driver.getTitle().equals("Facebook - Log In or Sign Up")) // correct from URL: Facebook - log in or sign up
               System.out.println("Title validation PASSED");
           else System.out.println("Title validation FAILED");

           // Validate the URL of the page is “https://www.facebook.com/”
           if (driver.getCurrentUrl().equals("https://www.facebook.com/"))
               System.out.println("URL validation PASSED");
           else System.out.println("URL validation FAILED");

            // Validate “facebook” logo is displayed
           WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[1]/div/img"));
           if (logo.isDisplayed()) System.out.println("Logo validation PASSED");
           else System.out.println("Logo validation FAILED");

           // Validate heading2 “Connect with friends and the world around you on Facebook.” is displayed
           WebElement heading = driver.findElement(By.tagName("h2"));
           Waiter.pause(2);
           if (heading.isDisplayed()) System.out.println("Heading validation PASSED");
           else System.out.println("Heading validation FAILED");

            WebElement email = driver.findElement(By.id("email"));
            Waiter.pause(2);
            if (email.isDisplayed()) System.out.println("Email input box validation PASSED");
            else System.out.println("Email input box validation FAILED");

            WebElement password = driver.findElement(By.id("passContainer"));
            Waiter.pause(2);
            if (password.isDisplayed()) System.out.println("Password input box validation PASSED");
            else System.out.println("Password input box validation FAILED");

            // Validate “Log In” button is displayed and enabled
//           WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
//           Waiter.pause(2);
//           login.click();
//           Waiter.pause(2);
//           // Validate “Log In” button is displayed
//           if(login.isDisplayed()) System.out.println("Log In button is displayed validation PASSED");
//           else System.out.println("Log In button is displayed validation failed");

           // Validate “Log In” button is enabled
         WebElement login = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button"));
           Waiter.pause(2);
           if (login.isEnabled()) System.out.println("Log In button is enabled validation PASSED");
           else System.out.println("Log In button is enabled validation FAILED");

           // Validate “Forgot Password?” link is displayed
           WebElement forgotPassword = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a"));
           Waiter.pause(2);
           if (forgotPassword.isDisplayed()) System.out.println("Forgot password validation PASSED");
            else System.out.println("Forgot password validation FAILED");

           // Validate “Create New Account” button is displayed
           WebElement createNewAccount = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a"));
           Waiter.pause(2);
           if (createNewAccount.isDisplayed()) System.out.println("Create new account button validation PASSED");
           else System.out.println("Create new account button validation FAILED");

       }catch (Exception e) {
           System.out.println("Test failed due to: " + e.getMessage());
       }


        // 3. Teardown
        finally {
           Driver.quitDriver();
       }

    }
}
