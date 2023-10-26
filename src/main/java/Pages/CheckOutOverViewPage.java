package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckOutOverViewPage {

    WebDriver driver ;

    public CheckOutOverViewPage (WebDriver driver )
    {
        this.driver = driver ;
    }

    //elements
    public static By finishButton ()
    {
        return By.id("finish");
    }
}
