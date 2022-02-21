package Functions;
import Utils.CoreActions;
import org.openqa.selenium.WebDriver;
import ObjectRepository.*;
import org.testng.asserts.SoftAssert;


public class Go_cart_func extends  CoreActions {
    SoftAssert softAssert = new SoftAssert();
    protected WebDriver driver4;
    public  Go_cart_func(WebDriver driver)
    {
        super(driver);
        this.driver4=driver;
    }
    public void home_data()
    {
        catchdata(GoToCartPage.Cart_ProductName);
    }
    public void cart_price_check()
    {
        catchprice(GoToCartPage.Cart_price);
    }
    public void check_name()
    {
        softAssert.assertEquals(Add_cart_text,Go_cart_text,"Product name matched");
        checkQty(CheckingCartPage.cart_show);
        if(value!=true)
        {
            System.out.println("GO_CART_cart is empty");
        }
        else
        {
            System.out.println("GO_CART_cart is not empty");
        }
        System.out.println("PRODUCT NAME IS MATCHED");
    }
    public void checkingprice()
    {
        softAssert.assertEquals(cart_price,Go_price,"Product price matched");
        System.out.println("PRODUCT PRICE IS MATCHED");
    }
    public Check_out_func GOTOCART()
    {
        click(GoToCartPage.GO_CART);
        return new Check_out_func(driver4);
    }

}
