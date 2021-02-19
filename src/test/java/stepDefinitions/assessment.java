package stepDefinitions;

import com.test.prasanna.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.CheckOut;
import pageObjects.LoginPage;
import pageObjects.MyAccount;
import pageObjects.TShirts;

@RunWith(Cucumber.class)
public class assessment extends Base {

    WebDriver webDriver;

    @Given("^User is on the Login page$")
    public void userIsOnTheLoginPage() throws Throwable {
        webDriver = getDriver();
        webDriver.findElement(By.className("login")).click();
    }

    @And("^User logs in to the application with (.+) and password (.+)$")
    public void userLogsInToTheApplicationWithUsernameAndPasswordPassword(String email, String pass) {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        loginPage.login(email, pass);
    }

    @And("^User selects TShirt$")
    public void userSelectsTShirt() throws InterruptedException {
        MyAccount myAccount = PageFactory.initElements(driver, MyAccount.class);
        myAccount.selectTShirt();
        TShirts tShirts = PageFactory.initElements(driver, TShirts.class);
        tShirts.selectATShirt();
        tShirts.addToCart();
        tShirts.proceedToCheckout(driver);
    }

    @And("^User does checkout$")
    public void userDoesCheckout() {
        CheckOut checkOut = PageFactory.initElements(driver, CheckOut.class);
        checkOut.proceedFromSummarySection()
                .proceedFromAddressSection()
                .acceptTermsOfService()
                .proceedFromShippingSection()
                .payByBankWire()
                .confirmOrder()
                .backToOrders();
    }
}

