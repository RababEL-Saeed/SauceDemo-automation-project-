package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    WebDriver driver ;
    public  CartPage (WebDriver driver )
    {
        this.driver = driver ;
    }

    //elements
    public static By checkOutButton ()
    {
        return By.id("checkout");
    }



    public CheckOutPage clickCheckOutButton ()
    {
        driver.findElement(checkOutButton()).click();
        return new CheckOutPage(driver);
    }
}
