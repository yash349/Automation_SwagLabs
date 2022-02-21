package Functions;

import ObjectRepository.InformationPage;
import Utils.CoreActions;
import org.openqa.selenium.WebDriver;

public class Information_Page_func extends CoreActions {
    protected WebDriver driver6;
    public Information_Page_func(WebDriver driver)
    {
        super(driver);
        this.driver6=driver;
    }
    public void EnterFirstName(String text)
    {
        entervalues(InformationPage.FIRST_NAME,text);
    }
    public void EnterLastName(String text)
    {
        entervalues(InformationPage.LAST_NAME,text);
    }
    public void EnterPostalCode(String text)
    {
        entervalues(InformationPage.POSTAL_CODE,text);
    }
    public void clickContinue()
    {
        click(InformationPage.CONTINUE);
    }
}
