package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.net.URL;

public class LoginPage {

WebDriver driver ;

public LoginPage (WebDriver driver)
{
    this.driver = driver ;
}
//element
public final  String URL = "https://app.peaktime.app/" ;

//elements

    public static By userNameField ()
    {
        return By.id("user-name");
    }

    public static By passwordField ()
    {
        return By.id("password");
    }

    public static By LoginButton ()
    {
        return By.id("login-button") ;
    }





//action
public LoginPage openwebsite ()
{
    driver.navigate().to("https://www.saucedemo.com/");
    return this ;
}


public HomePage performlogin (String username , String password )
{
    driver.findElement(userNameField()).sendKeys(username);
    driver.findElement(passwordField()).sendKeys(password);
    driver.findElement(LoginButton()).click();
    return new HomePage(driver);
}

















}
