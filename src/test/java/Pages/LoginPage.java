package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath =  "//input[@id='user']")
    public WebElement inputUsername;

    @FindBy(xpath= "//input[@id='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//div[@id='submit-wrapper']")
    public WebElement loginButton;


}
