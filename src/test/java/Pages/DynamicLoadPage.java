package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DynamicLoadPage {

    public DynamicLoadPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//a[@class='active']")
    public WebElement Dashboard;

    @FindBy(xpath = "//li[@data-id='photos']")
    public WebElement photos;

    @FindBy(xpath = "//li[@id='more-apps']")
    public WebElement moreApps;

    @FindBy(xpath = "//li[@data-id='activity']")
    public WebElement activity;

    @FindBy(xpath = "//a[@aria-label='Talk']")
    public WebElement talk;

    @FindBy(xpath =  "//li[@data-id='contacts']")
    public WebElement contacts;

    @FindBy(xpath =  "//li[@data-id='circles']")
    public WebElement circles;

    @FindBy(xpath = "//li[@data-id='deck']" )
    public WebElement deck;

    @FindBy(xpath = "//li[@class='menutoggle']")
    public WebElement menu;

    @FindBy(xpath = "//div[@class='notifications']")
    public WebElement notifications;

    @FindBy(xpath = "//div[@class='menutoggle']")
    public WebElement userButton;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement conversationsUsers;

}
