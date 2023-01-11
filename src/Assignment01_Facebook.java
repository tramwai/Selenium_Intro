import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

public class Assignment01_Facebook {
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


           // 1. set up driver
           WebDriver driver = Driver.getDriver();

           // 2. Validation

           // Go to https://www.facebook.com/
           driver.get("https://www.facebook.com/");
           Waiter.pause(2);

           //Validate the title of the page is “Facebook - Log In or Sign Up”
        System.out.println(driver.getTitle());

        // Validate the URL of the page is “https://www.facebook.com/”
        System.out.println(driver.getCurrentUrl());

        // Validate “facebook” logo is displayed
        System.out.println(driver.findElement(By.className("fb_logo")).isDisplayed());
        System.out.println(driver.findElement(By.className("_8eso")).getText());

        // Validate heading2 “Connect with friends and the world around you on Facebook.” is displayed
        System.out.println(driver.findElement(By.tagName("h2")).isDisplayed());
        Waiter.pause(2);

        // Validate “Email or Phone Number” input box is displayed
        System.out.println(driver.findElement(By.id("email")).isDisplayed());
        Waiter.pause(2);
        System.out.println(driver.findElement(By.id("pass")).isDisplayed());
        Waiter.pause(2);

        // Validate “Log In” button is displayed
        System.out.println(driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).getText());

        // Validate “Log In” button is enabled
        System.out.println(driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).getText());
        Waiter.pause(2);


        // Validate “Forgot Password?” link is displayed
        System.out.println(driver.findElement(By.cssSelector("._6ltj>a")).getText());
        Waiter.pause(2);

        // Validate “Create New Account” button is displayed
        System.out.println(driver.findElement(By.cssSelector("a[id*='u_0_0_']")).getText());
        Waiter.pause(2);

        // 3. Teardown
           Driver.quitDriver();
    }
}
