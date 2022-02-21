package Functions;

import ObjectRepository.CompletePage;
import Utils.CoreActions;
import org.openqa.selenium.WebDriver;

public class Complete_func extends CoreActions {
    protected WebDriver driver8;
    public Complete_func(WebDriver driver)
    {
        super(driver);
        this.driver8=driver;
    }
    public Select_item_func clickback()
    {
        click(CompletePage.BACK_TO_HOME);
        return new Select_item_func(driver8);
    }
}
