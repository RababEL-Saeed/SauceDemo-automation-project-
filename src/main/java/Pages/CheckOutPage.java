package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutPage {

    WebDriver driver ;

    public CheckOutPage (WebDriver driver)
    {
        this.driver = driver ;
    }

    //elements

    public static By firstNameField ()
    {
        return By.id("first-name");
    }

    public static By lastNameField ()
    {
        return By.id("last-name");
    }

    public static By postalCodeField ()
    {
        return By.id("postal-code");
    }

    public static By continueButton ()
    {
        return By.id("continue");
    }

    public static By checkOutLogo ()
    {
        return By.xpath("//span[contains(text(),\"Checkout: Your Information\")]");
    }

    public CheckOutCompeletePage PerformCheckOut (String firstName ,String lastName , String postalCode)
    {
        driver.findElement(firstNameField()).sendKeys(firstName);
        driver.findElement(lastNameField()).sendKeys(lastName);
        driver.findElement(postalCodeField()).sendKeys(postalCode);
        driver.findElement(continueButton()).click();
        driver.findElement(CheckOutOverViewPage.finishButton()).click();
        return new CheckOutCompeletePage(driver);
    }





}
