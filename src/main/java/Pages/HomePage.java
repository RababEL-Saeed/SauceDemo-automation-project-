package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver ;

    public  HomePage (WebDriver driver )
    {
        this.driver= driver ;

    }

//elements
public static By productTittle ()
    {
        return By.id("item_4_title_link");
    }


public static By applogo ()
{
return By.className("app_logo");
}

public static By addToCardButton ()
{
    return By.id("add-to-cart-sauce-labs-backpack");
}

public static By cartLink ()
{
    return By.className("shopping_cart_link");
}

public static By shoppingCartBadge ()
{
    return By.className("shopping_cart_badge");
}

public ProductPage navigateTO_Product ()
{
    driver.findElement(HomePage.productTittle()).click();
    return new ProductPage(driver);
}


public void addProductToCard ()
{
    driver.findElement(addToCardButton()).click();
}
public CartPage navToCartPage ()
{

    driver.findElement(cartLink()).click();
    return new CartPage(driver);
}
    }




