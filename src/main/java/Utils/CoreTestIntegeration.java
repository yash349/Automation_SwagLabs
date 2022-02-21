package Utils;
import Functions.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.DataProvider;
@SuppressWarnings("DataProviderReturnType")
public class CoreTestIntegeration
{
    protected WebDriver driver;
    protected static final String URL = "https://www.saucedemo.com/";

    protected Login_Page_func login_obj;
    protected Select_item_func select_item_obj;
    protected Go_cart_func go_to_cart_obj;
    protected Add_cart_func add_to_cart_obj;
    protected Check_out_func checkout_obj;
    protected Information_Page_func information_obj;
    protected Overview_page_func overview_obj;
    protected Complete_func complete_obj;
    protected Again_go_to_cart_func go_cart_again_obj;
    protected Cart_check_func cart_check_obj;
    protected String expected;

    @BeforeClass
    public void openBrowser() {
        driver = new Driver().getDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        expected=driver.getCurrentUrl();

        login_obj = new Login_Page_func(driver);

        select_item_obj=new Select_item_func(driver);
        add_to_cart_obj=new Add_cart_func(driver);
        go_to_cart_obj=new Go_cart_func(driver);
        checkout_obj=new Check_out_func(driver);
        information_obj=new Information_Page_func(driver);
        overview_obj=new Overview_page_func(driver);
        complete_obj=new Complete_func(driver);
        go_cart_again_obj=new Again_go_to_cart_func(driver);
        cart_check_obj=new Cart_check_func(driver);

    }

    protected static void logStep(String step) {
        Logger.step(step);
    }

    @AfterClass
    public void close() {
        driver.quit();
    }
    @DataProvider(name="ab")
    public String[] readJSONDATA() throws IOException, ParseException {
        JSONParser jsonparser = new JSONParser();
        FileReader reader = new FileReader("C:\\Users\\yash.agrawal\\Documents\\Assessment\\Sauce_Lab\\src\\test\\java\\Configuration\\config.json");
        Object obj = jsonparser.parse(reader);
        JSONObject userloginobj = (JSONObject) obj;
        JSONArray userloginArray = (JSONArray) userloginobj.get("userLogin");
        String[] arr = new String[userloginArray.size()];
        for (int i = 0; i < userloginArray.size(); i++) {
            JSONObject users = (JSONObject) userloginArray.get(i);
            String user = (String) users.get("username");
            String pwd = (String) users.get("password");
            arr[i] = user + "," + pwd;
        }
        return arr;
    }
}

