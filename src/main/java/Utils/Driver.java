package Utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
    private final WebDriver driver;

    public Driver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yash.agrawal\\Documents\\Assessment\\Sauce_Lab\\src\\main\\resources\\chromedriver.exe");
        this.driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

}
