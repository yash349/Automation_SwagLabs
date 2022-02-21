package Functions;

import ObjectRepository.CheckingCartPage;
import Utils.CoreActions;
import org.openqa.selenium.WebDriver;

public class Cart_check_func extends CoreActions {
    public Cart_check_func(WebDriver driver)
    {
        super(driver);
    }
    public void check_cart_data()
    {
        ValidatingDataOfCartPage(CheckingCartPage.cart_show);
        if(size_shown==2)
        {
            System.out.println("cart is empty");
        }
        else
        {
            System.out.println("cart is not empty");
        }
    }
    public void clickingDropdown()
    {
        click(CheckingCartPage.going_for_logout);
    }
    public void Clickinglogout()
    {
        click(CheckingCartPage.LOGOUT);
        System.out.println("LOGOUT");
    }
}
