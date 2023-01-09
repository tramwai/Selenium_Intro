import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGlobalUtil;

public class _05_Locators_tagName {
    public static void main(String[] args) {
             /*
TEST CASE
Go to https://techglobal-training.netlify.app/
Select "Frontend Testing" from the "Practices" dropdown
Select the "Locators" card
Validate the Locators header
Note: Make sure the header is displayed, make sure the text is exactly "Locators"
 */

        try {
            // 1. setup
            WebDriver driver = Driver.getDriver();

            TechGlobalUtil.getFrontendTesting();
            driver.findElement(By.id("card-1")).click();

            WebElement heading = driver.findElement(By.tagName("h1"));

            if (heading.isDisplayed()) System.out.println("Heading validation PASsED");
            else System.out.println("Heading validation failed");

           if (heading.getText().equals("Locators")) System.out.println("Heading text PASSED");
           else System.out.println("Heading text FAILED");


        }catch (Exception e){
            System.out.println("TEST FAILED due to: " + e.getMessage());
        }
        // 3. Teardown
        finally {
            Driver.quitDriver();
        }
    }
}
