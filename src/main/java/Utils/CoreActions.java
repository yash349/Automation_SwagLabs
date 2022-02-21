package Utils;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CoreActions {
    protected final WebDriver driver;
    protected final WebDriverWait waiter;
    protected String Add_cart_text;
    protected String Go_cart_text;
    protected String cart_price;
    protected String Go_price;
    protected Boolean value;
    protected int size_shown;
    protected CoreActions(WebDriver driver)
    {
        this.driver=driver;
        this.waiter=new WebDriverWait(driver,10);
    }
    protected boolean waitForVisibility(By element) {
        boolean isVisible = true;
        try {
            waiter.until(ExpectedConditions.visibilityOfElementLocated(element));
        } catch (TimeoutException te) {
            isVisible = false;
        }
        return isVisible;
    }
    public void click(By element)
    {
        driver.findElement(element).click();
    }
    public void entervalues(By element,String text)
    {
        driver.findElement(element).sendKeys(text);
    }
    public String storedata(By element)
    {
        Add_cart_text=driver.findElement(element).getText();
        return Add_cart_text;
    }
    public String catchdata(By element)
    {
        Go_cart_text=driver.findElement(element).getText();
        return Go_cart_text;
    }
    public void cleardata(By element)
    {
        driver.findElement(element).clear();
    }
    public String storeprice(By element)
    {
        cart_price=driver.findElement(element).getText();
        return cart_price;
    }
    public String catchprice(By element) {
        Go_price = driver.findElement(element).getText();
        return Go_price;
    }
    public Boolean checkQty(By element)
    {
        value=driver.findElement(element).isEnabled();
        return value;
    }
    public int ValidatingDataOfCartPage(By element)
    {
        size_shown=(driver.findElements(element)).size();
        System.out.println("size of div=" +size_shown);
        return size_shown;
    }
    public void sleep(double sec)
    {
        try {
            Thread.sleep((long)(sec * 1000));
        }catch (InterruptedException ex)
        {
            ex.printStackTrace();
        }
    }
}