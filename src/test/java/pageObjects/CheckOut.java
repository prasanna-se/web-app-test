package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOut {

    @FindBy(xpath = "//span[text()=\"Proceed to checkout\"]")
    WebElement proceedToCheckoutButton;

    @FindBy(xpath="//button[@name=\"processCarrier\"]")
    WebElement submitShipping;
    @FindBy(xpath="//input[@name=\"cgv\"]")
    WebElement termsOfService;


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
}
