package stepDefinitions;

import com.test.prasanna.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageObjects.*;

@RunWith(Cucumber.class)
public class assessment extends Base {

    WebDriver webDriver;
    Double totalPrice;

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

    @When("^User does checkout$")
    public void userDoesCheckout() {
        CheckOut checkOut = PageFactory.initElements(driver, CheckOut.class);
        checkOut.proceedFromSummarySection()
                .proceedFromAddressSection()
                .acceptTermsOfService()
                .proceedFromShippingSection()
                .payByBankWire()
                .confirmOrder();

        totalPrice = checkOut.getAmount();
        checkOut.backToOrders();

    }

    @Then("^verify order history$")
    public void verifyOrderHistory() {
        OrderHistory orderHistory = PageFactory.initElements(driver, OrderHistory.class);
        Assert.assertEquals(totalPrice, orderHistory.getTotalPriceOfOrder());
    }
}

