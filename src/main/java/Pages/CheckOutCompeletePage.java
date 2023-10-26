package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutCompeletePage {

    WebDriver driver ;

    public CheckOutCompeletePage (WebDriver driver )
    {
        this.driver = driver ;
    }

    //elements
    public static By completionConfirmation ()
    {
        return By.className("complete-text");
    }
}
