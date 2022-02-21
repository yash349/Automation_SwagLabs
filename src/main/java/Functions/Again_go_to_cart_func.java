package Functions;

import ObjectRepository.AddToCartPage;
import ObjectRepository.AgainGoToCartPage;
import Utils.CoreActions;
import org.openqa.selenium.WebDriver;

public class Again_go_to_cart_func extends CoreActions {
    public Again_go_to_cart_func(WebDriver driver)
    {
        super(driver);
    }
    public void click_cart_after_back_home()
    {
        click(AgainGoToCartPage.cart_click);
    }
}
