package Functions;
import Utils.CoreActions;
import org.openqa.selenium.WebDriver;
import ObjectRepository.*;


public class Select_item_func extends  CoreActions {
    protected  WebDriver driver2;
    public Select_item_func(WebDriver driver) {
        super(driver);
        this.driver2 = driver;
    }

    public Add_cart_func Selectpurchaseitem() {
        click(HomePage.Select_option);
        return new Add_cart_func(driver2);
    }
}