package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;


public class OrderHistory {

    @FindBy(xpath = "//tr[@class='first_item ']//span[@class='price']")
    WebElement totalPrice;


    public Double getTotalPriceOfOrder() {

        ArrayList<String> dollarAmount = (ArrayList<String>) Arrays.stream(totalPrice.getText().split(""))
                .collect(Collectors.toList());
        dollarAmount.remove(0);
        return Double.parseDouble(String.join("", dollarAmount));

    }

}



