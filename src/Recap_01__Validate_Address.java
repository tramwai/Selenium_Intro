import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.ArrayList;
import java.util.List;

public class Recap_01__Validate_Address {
    public static void main(String[] args) {
        /**
        TEST CASE 1
        Go to https://techglobal-training.netlify.app/
        Validate the address in the footer is displayed and text is "2860 S River Rd Suite 350, Des Plaines IL 60018"
        Validate the copyright in the footer is displayed and text is "© 2023 TechGlobal - All Rights Reserved"
         */
        WebDriver driver = Driver.getDriver();
        driver.get("https://techglobal-training.netlify.app/");
        List<WebElement> elements = driver.findElements(By.xpath("//footer[@class='Footer_footer__kXlYa']//p"));
        String[] actualText = {"2860 S River Rd Suite 350, Des Plaines IL 60018", "© 2023 TechGlobal - All Rights Reserved"};
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).getText().equals(actualText[i])){
                System.out.println("Address and Copyright PASSED");
            }
            else System.out.println("Address and Copyright FAILED");
        }

        /**
        TEST CASE 2
        Go to https://techglobal-training.netlify.app/
        Validate both the instagram and facebook items are displayed and enabled
         */

        List<WebElement> elementList = driver.findElements(By.xpath("//div[@class='Footer_socials__7h4n1']//a"));
        for (WebElement webElement : elementList) {
            if (webElement.isDisplayed() && webElement.isEnabled())
                System.out.println("Validation of instagram and facebook items are displayed and enabled has PASSED");
            else System.out.println("Validation of instagram and facebook items are displayed and enabled has FAILED");
        }



        Driver.quitDriver();
    }



}
