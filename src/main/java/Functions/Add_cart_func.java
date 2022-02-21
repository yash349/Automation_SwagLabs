package Functions;
import Utils.CoreActions;
import org.openqa.selenium.WebDriver;
import ObjectRepository.*;


public class Add_cart_func extends  CoreActions {
    protected  WebDriver driver3;
    public Add_cart_func(WebDriver driver) {
        super(driver);
        this.driver3 = driver;
    }

    public void match_data()
    {
        storedata(AddToCartPage.ProductName);
    }
    public void match_price()
    {
        storeprice(AddToCartPage.productPrice);
    }
    public void cart_check_before(){
        ValidatingDataOfCartPage(AddToCartPage.cart_check);
        if(size_shown<2)
        {
            System.out.println("cart is Empty you can proceed!!!");
        }
        else
        {
            System.out.println("cart is not empty please make it empty first!!!");
        }
    }



    public Go_cart_func ADDTOCART() {
        click(AddToCartPage.CART);
        return  new Go_cart_func(driver3);
    }
}

