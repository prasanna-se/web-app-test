package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(id = "email")
    WebElement emailAddress;

    @FindBy(id = "passwd")
    WebElement password;

    @FindBy(id = "SubmitLogin")
    WebElement signIn;


    public void login(String email, String pass) {
        emailAddress.sendKeys(email);
        password.sendKeys(pass);
        signIn.click();
    }

}
