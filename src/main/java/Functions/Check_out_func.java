package Functions;

import ObjectRepository.CheckoutPage;
import Utils.CoreActions;
import org.openqa.selenium.WebDriver;

public class Check_out_func extends CoreActions {
    protected WebDriver driver5;
    public Check_out_func(WebDriver driver)
    {
        super(driver);
        this.driver5=driver;
    }
    public Information_Page_func click_checkout()
    {
        click(CheckoutPage.CHECKOUT_CLICK);
        return new Information_Page_func(driver5);
    }
}
