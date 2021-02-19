package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOut {

    @FindBy(xpath = "//span[text()=\"Proceed to checkout\"]")
    WebElement proceedToCheckoutButton;

    @FindBy(xpath = "//button[@name=\"processCarrier\"]")
    WebElement submitShipping;

    @FindBy(xpath = "//input[@name=\"cgv\"]")
    WebElement termsOfService;

    @FindBy(xpath = "//a[@class='bankwire']")
    WebElement payByBankWire;

    @FindBy(xpath = "//button[@class='button btn btn-default button-medium']")
    WebElement confirmOrderButton;

    @FindBy(xpath = "//a[@title='Back to orders']")
    WebElement backToOrders;


    public CheckOut proceedFromSummarySection() {
        proceedToCheckoutButton.click();
        return this;
    }

    public CheckOut proceedFromAddressSection() {
        proceedToCheckoutButton.click();
        return this;
    }

    public CheckOut acceptTermsOfService() {
        termsOfService.click();
        return this;
    }

    public CheckOut proceedFromShippingSection() {
        submitShipping.click();
        return this;
    }

    public CheckOut payByBankWire() {
        payByBankWire.click();
        return this;
    }

    public CheckOut confirmOrder() {
        confirmOrderButton.click();
        return this;
    }

    public void backToOrders() {
        backToOrders.click();
    }
}
