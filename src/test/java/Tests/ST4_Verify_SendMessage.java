package Tests;

import Pages.DynamicLoadPage;
import Pages.LoginPage;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ST4_Verify_SendMessage {

    @Test
    public void logInTryCloud() {
        String url = ConfigurationReader.getProperty("environment");
        Driver.getDriver().get(url);

        LoginPage loginPage = new LoginPage();

        String username = ConfigurationReader.getProperty("username");
        loginPage.inputUsername.sendKeys(username);

        String password = ConfigurationReader.getProperty("password");
        loginPage.inputPassword.sendKeys(password);

        loginPage.loginButton.click();

        DynamicLoadPage talkWebElement= new DynamicLoadPage();
        talkWebElement.talk.click();

        DynamicLoadPage converstionUsers= new DynamicLoadPage();
        converstionUsers.conversationsUsers.click();

        DynamicLoadPage webUser10= new DynamicLoadPage();
        webUser10.user10.click();

        DynamicLoadPage messageBox=new DynamicLoadPage();
        messageBox.writeMessage.sendKeys("Hello, please give me a call");

        DynamicLoadPage submitMessage= new DynamicLoadPage();
        submitMessage.sendMessage.click();

        DynamicLoadPage verifyMessage= new DynamicLoadPage();
        String expected= "Hello, please give me a call";
        String actual= verifyMessage.displayedMessage.getText();

        Assert.assertTrue(actual.equals(expected));











    }

        //Test case #2 - verify users can send message

       // WebElement: Talk xpath: //a[@aria-label='Talk']
      // WebElement: Talk css: a[aria-label='Talk']

      // WebElement SearchConversations box xpath //input[@type='text']

    //WebElement user10  xpath  //span[@class='acli__content__line-one__title']")

    //WebElement writeMessage  xpath //div[@contenteditable='contenteditable'] and (class= "new-message-form__advancedinput")

//WebElement submitMessage css [class='new-message-form__button submit icon-confirm-fade']class= new-message-form__button submit icon-confirm-fade

}
