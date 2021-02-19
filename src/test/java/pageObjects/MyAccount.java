package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccount {

    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
    WebElement tShirts;

    @FindBy(id = "passwd")
    WebElement orderHistoryAndDetails;

    @FindBy(id = "SubmitLogin")
    WebElement myPersonalInformation;


    public void selectTShirt() {
        tShirts.click();
    }

}
