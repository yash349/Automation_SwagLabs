package Functions;

import ObjectRepository.OverViewPage;
import Utils.CoreActions;
import org.openqa.selenium.WebDriver;

public class Overview_page_func extends CoreActions {
    protected WebDriver driver7;
    public Overview_page_func(WebDriver driver)
    {
        super(driver);
        this.driver7=driver;
    }
    public void clickFinish()
    {
        click(OverViewPage.FINISH);
    }
}
