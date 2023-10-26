package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class ProductTest extends BaseTest {



    private  final String ValidUser = "standard_user";
    private final String ValidPass= "secret_sauce";

    private final String actualprice = "$29.99" ;

@Test
    public void verifyprice ()
{
    new LoginPage(driver).performlogin(ValidUser,ValidPass).navigateTO_Product();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    String expectedPrice = driver.findElement(ProductPage.priceTag()).getText();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

    Assert.assertEquals(actualprice, expectedPrice );

}

@Test
    public void verifyShoppingCartBadge ()
{
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

new LoginPage(driver).performlogin("standard_user","secret_sauce").addProductToCard();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

Assert.assertTrue(driver.findElement(HomePage.shoppingCartBadge()).isDisplayed());
}
}
