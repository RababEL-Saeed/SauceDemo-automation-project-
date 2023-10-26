package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    public String expectedTittle = " Sauce Labs Backpack " ;

    private  final String ValidUser = "standard_user";
    private final String ValidPass= "secret_sauce";



    @Test
    public void verifyProductText ()
    {
        new LoginPage(driver).performlogin(ValidUser,ValidPass);
         String actualTittle = driver.findElement(HomePage.productTittle()).getText();
        Assert.assertEquals(actualTittle ,expectedTittle );

    }



}
