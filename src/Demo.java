package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) throws InterruptedException {

        // 1. Setup driver
        System.setProperty("webdriver.chrome.driver",
               "/Users/mihailhariton/IdeaProjects/initial_selenium_project5/chromedriver" );
        WebDriver driver = new ChromeDriver(); // Instantiating ChromeDriver


        // 2. maximize driver
        //driver.manage().window().fullscreen();
        driver.manage().window().maximize();

        // 3. define implicit wait
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        // 4. Navigate to Google website
        driver.get("https://www.google.com/");

        // 5. Validate the title is Google
        System.out.println("The title of the page is = " + driver.getTitle());

        if (driver.getTitle().equals("Google")) System.out.println("Google title validation PASSED");
        else System.out.println("Google title validation FAILED!!!");
        System.out.println("End of the program");

        // Quit driver
        Thread.sleep(3000);
        driver.quit(); // Quit the driver instance

    }
}
