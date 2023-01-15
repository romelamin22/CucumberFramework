package page_library;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {

    WebDriver driver;

    //li[@id='menu-item-324']//a
    @FindBy(xpath = "//li[@id='menu-item-324']//a")
    public WebElement loginLink;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement usernameInput;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement passInput;

    @FindBy(xpath = "//button[@value='Log in']")
    public WebElement loginButton;

    @FindBy(xpath = "//ul[@role='alert']//li")
    public WebElement errorMsg;


    public HomePage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    public void clickLoginLink(){

        loginLink.click();

    }

    public void inputUsername(String username){

        sendKeysToElement(usernameInput, username);

    }

    public void inputPass(String password){

        sendKeysToElement(passInput, password);

    }

    public void clickLoginButton(){

        clickOnElement(loginButton);

    }



}
