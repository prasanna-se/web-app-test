package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOut {

    @FindBy(xpath = "//span[text()=\"Proceed to checkout\"]")
    WebElement proceedToCheckoutButton;

    @FindBy(xpath="//button[@name=\"processCarrier\"]")
    WebElement submitShipping;


    public CheckOut proceedFromSummarySection() {
        proceedToCheckoutButton.click();
        return this;
    }

    public CheckOut proceedFromAddressSection() {
        proceedToCheckoutButton.click();
        return this;
    }

    public CheckOut proceedFromShippingSection() {
        submitShipping.click();
        return this;
    }
}
