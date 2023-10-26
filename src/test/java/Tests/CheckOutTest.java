package Tests;

import Pages.CheckOutCompeletePage;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class CheckOutTest extends BaseTest {

    @Test
    public void validateCheckoutFullScenario ()
    {

              new LoginPage(driver).performlogin("standard_user","secret_sauce").addProductToCard();
              driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
                new HomePage(driver).navToCartPage().clickCheckOutButton()
                .PerformCheckOut("rabab","saeed","123456");
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        Assert.assertTrue(driver.findElement(CheckOutCompeletePage.completionConfirmation()).isDisplayed());
    }
}
