package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver ;

    public ProductPage (WebDriver driver )
    {
        this.driver = driver ;
    }

    //elements

    public static By priceTag ()
    {
        return By.className("inventory_details_price");
    }


}
