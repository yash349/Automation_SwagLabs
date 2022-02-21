package Functions;
import Utils.CoreActions;
import org.openqa.selenium.WebDriver;
import ObjectRepository.*;


public class Login_Page_func extends  CoreActions {
    protected  WebDriver driver1;
    public Login_Page_func(WebDriver driver)
    {
        super(driver);
        this.driver1 = driver;
    }

    public void EnterUsername(String text)
    {
        waitForVisibility(LoginPage.TITLE);
        cleardata(LoginPage.USERNAME);
        sleep(2);
        entervalues(LoginPage.USERNAME,text);
    }
    public void EnterPassword(String text)
    {
        cleardata(LoginPage.PASSWORD);
        sleep(2);
        entervalues(LoginPage.PASSWORD,text);
    }
    public Select_item_func ClickSubmit()
    {
        click(LoginPage.SUBMIT);
        return  new Select_item_func(driver1);
    }
}
