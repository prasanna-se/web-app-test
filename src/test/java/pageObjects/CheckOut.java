package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

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

    @FindBy(xpath = "//span[@class='price']/strong")
    WebElement amount;

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

    public Double getAmount() {

        ArrayList<String> dollarAmount = (ArrayList<String>) Arrays.stream(amount.getText().split(""))
                .collect(Collectors.toList());
        dollarAmount.remove(0);
        return Double.parseDouble(String.join("", dollarAmount));

    }

    public void backToOrders() {
        backToOrders.click();
    }
}
