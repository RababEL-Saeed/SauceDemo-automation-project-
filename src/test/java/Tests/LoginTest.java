package Tests;

import Pages.HomePage;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{


    private  final String ValidUser = "standard_user";
    private final String ValidPass= "secret_sauce";


    @Test
    public void verfiyvalidlogin ()
    {
new LoginPage(driver).performlogin (ValidUser, ValidPass);
        Assert.assertTrue(driver.findElement(HomePage.applogo()).isDisplayed());

    }




}
