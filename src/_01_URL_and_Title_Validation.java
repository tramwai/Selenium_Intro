import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_URL_and_Title_Validation {
    public static void main(String[] args) throws InterruptedException {

        /**
        Go to https://www.techglobalschool.com
Get current url and validate it
Get title and validate it

EXPECTED RESULT:
URL  = https://www.techglobalschool.com/
Title = SDET Bootcamp | TechGlobal
         */
        // 1. set up

        System.setProperty("webdriver.chrome.driver", "/Users/mihailhariton/IdeaProjects/initial_selenium_project5/chromedriver" );
        WebDriver driver = new ChromeDriver();

        // 2. Test Validation

       // driver.get("https://www.techglobalschool.com"); // no caches
        driver.navigate().to("https://www.techglobalschool.com"); // keeps caches
        Thread.sleep(2000);
        driver.navigate().refresh();
        driver.manage().window().maximize();
        driver.getTitle();
        driver.getCurrentUrl();
        if (driver.getTitle().equals("SDET Bootcamp | TechGlobal"))
            System.out.println("title validation passed");
        else System.out.println("Title validation failed");

        if (driver.getCurrentUrl().equals("https://www.techglobalschool.com"))
            System.out.println("URL validation passed");
        else System.out.println("URL validation failed");

        // 3. Teardown
        Thread.sleep(2000);
        driver.close();

    }
}
