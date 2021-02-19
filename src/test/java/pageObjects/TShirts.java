package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TShirts {

    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
    WebElement tShirt;

    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button/span")
    WebElement addToCartButton;


    public void selectATShirt() {
        tShirt.click();
    }

    public void addToCart() {
        addToCartButton.click();
    }

    public void proceedToCheckout(WebDriver driver) {
        WebElement proceedToCheckoutButton = new WebDriverWait(driver, 5)
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title=\"Proceed to checkout\"]")));
        proceedToCheckoutButton.click();
    }

}



