package Tests;
import Pages.DynamicLoadPage;
import Pages.LoginPage;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ST4_Talks_TitleVerification {

    @Test
    public void logInTryCloud(){
    String url= ConfigurationReader.getProperty("environment");
    Driver.getDriver().get(url);

        LoginPage loginPage= new LoginPage();

        String username= ConfigurationReader.getProperty("username");
        loginPage.inputUsername.sendKeys(username);

        String password=ConfigurationReader.getProperty("password");
        loginPage.inputPassword.sendKeys(password);

        loginPage.loginButton.click();


       DynamicLoadPage talkWebElement= new DynamicLoadPage();
       String expected= "talk";
       String actual= talkWebElement.talk.getText();

        Assert.assertTrue(talkWebElement.talk.isDisplayed());
       // Assert.assertTrue(actual.contains(expected));





        // WebElement: Talk xpath: //a[@aria-label='Talk']
        //WebElement: Talk css: a[aria-label='Talk']
        //String actualTitle= WebdriverFactory.getWebdriverFactory()getTiltle();
        //String expectedTitle= "Talk";
        // System.out.println("actualTitle="+ actualTitle);
        // System.out.println("expectedTitle="+expectedTitle);

        //Assert.assertTrue(actualTitle.contains(expectedTitle);










    }



   }






