package TestCase;
import Utils.CoreTestIntegeration;
import io.qameta.allure.*;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import Utils.Listener;

@Test
@Epic("Epic 1")
@Listeners(Listener.class)

public class ImplementingTestCase extends CoreTestIntegeration {


    @Test(dataProvider = "ab")
    @Description("testing the function")
    @Severity(SeverityLevel.NORMAL)
    @Story("STORY 1")
    @Feature("Feature 1")
    @Owner("Yash Agrawal")
    public void InsertUsername(String data)
    {

        logStep("Sending username");
        Assert.assertEquals(URL,expected,"PASSED");
        String users[]=data.split(",");
        login_obj.EnterUsername(users[0]);
        System.out.println(users[0]);
        login_obj.sleep(2);
        login_obj.EnterPassword(users[1]);
        System.out.println(users[1]);
        login_obj.sleep(2);
        login_obj.ClickSubmit();
        login_obj.sleep(2);
        select_item_obj.Selectpurchaseitem();
        select_item_obj.sleep(2);
        add_to_cart_obj.cart_check_before();
        add_to_cart_obj.ADDTOCART();
        add_to_cart_obj.match_data();
        add_to_cart_obj.match_price();
        add_to_cart_obj.sleep(2);
        go_to_cart_obj.GOTOCART();
        go_to_cart_obj.home_data();
        go_to_cart_obj.cart_price_check();
        go_to_cart_obj.check_name();
        go_to_cart_obj.checkingprice();
        go_to_cart_obj.sleep(2);
        checkout_obj.click_checkout();
        checkout_obj.sleep(2);
        information_obj.EnterFirstName("Yash");
        checkout_obj.sleep(2);
        information_obj.EnterLastName("Agrawal");
        checkout_obj.sleep(2);
        information_obj.EnterPostalCode("2041011");
        checkout_obj.sleep(2);
        information_obj.clickContinue();
        information_obj.sleep(2);
        overview_obj.clickFinish();
        overview_obj.sleep(2);
        complete_obj.clickback();
        complete_obj.sleep(2);
        go_cart_again_obj.click_cart_after_back_home();
        go_cart_again_obj.sleep(2);
        cart_check_obj.check_cart_data();
        cart_check_obj.sleep(2);
        cart_check_obj.clickingDropdown();
        cart_check_obj.sleep(2);
        cart_check_obj.Clickinglogout();
        cart_check_obj.sleep(2);
        close();


    }

}
