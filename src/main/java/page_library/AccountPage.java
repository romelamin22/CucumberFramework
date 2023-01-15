package page_library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AccountPage {

    WebDriver driver;

    @FindBy(xpath = "//div[@id='content']//strong[1]")
    public WebElement userVerify;

    public AccountPage(WebDriver driver){

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public String userTextVerify(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        wait.until(ExpectedConditions.visibilityOf(userVerify));

        return userVerify.getText();

    }

/*    public static void main(String[] args) throws InterruptedException {

        WebDriver driver1 = new ChromeDriver();

        Thread.sleep(5000);
        driver1.get("https://automation.scaledupit.com/my-account/");

        Thread.sleep(10000);

        WebElement el = driver1.findElement(By.xpath("//div[@id='content']//strong[1]"));

        Thread.sleep(10000);
        System.out.println(el.getText());


    }*/


}
