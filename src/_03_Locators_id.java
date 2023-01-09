package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Locators_id {
    public static void main(String[] args) throws InterruptedException {

        /*
Go to https://techglobal-training.netlify.app/
Validate the company logo is displayed
 */
        System.setProperty("webdriver.chrome.driver", "/Users/mihailhariton/IdeaProjects/initial_selenium_project5/chromedriver" );
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Validation
        driver.get(" https://techglobal-training.netlify.app/");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement logo = driver.findElement(By.id("logo"));
        if (logo.isDisplayed()) System.out.println("logo validation PASSED");
        else System.out.println("logo validation FAILED");


        // 3. teardown
        driver.close();
    }
}
