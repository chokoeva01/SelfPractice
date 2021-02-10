package Tests;

import Pages.DynamicLoadPage;
import Pages.LoginPage;
import Utilities.ConfigurationReader;
import Utilities.Driver;
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
        converstionUsers.conversationsUsers.sendKeys("Hello world");
        converstionUsers.conversationsUsers.click();









    }

        //Test case #2 - verify users can send message

       // WebElement: Talk xpath: //a[@aria-label='Talk']
      // WebElement: Talk css: a[aria-label='Talk']

      // WebElement SearchConversations box xpath //input[@type='text']

}
