package test.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {

    private static WebDriver driver;

    private Driver(){}

    // method to set up chrome driver
    public static WebDriver getDriver(){
        if (driver == null){
            System.setProperty("webdriver.chrome.driver", "/Users/mihailhariton/IdeaProjects/initial_selenium_project5/chromedriver" );
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }

    // method to quit driver
    public static void quitDriver(){
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }



}
