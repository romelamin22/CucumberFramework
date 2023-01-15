package base;

import config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Base extends Config {

    public WebDriver driver;

    public WebDriverWait wait;

    public void startBrowser(String browser, String url){

        if (browser.equalsIgnoreCase("chrome")){

            driver = new ChromeDriver();

        } else if (browser.equalsIgnoreCase("firefox")) {

            driver = new FirefoxDriver();

        } else if (browser.equalsIgnoreCase("edge")) {

            driver = new EdgeDriver();

        }

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        driver.manage().window().maximize();

        driver.get(url);

    }

    public void sendKeysToElement(WebElement element, String keys){

        element.sendKeys(keys);

    }

    public void clickOnElement(WebElement element){

        element.click();

    }

    public boolean isElementVisible(WebElement element){

        return true;

    }

    public void quitBrowser(){

        driver.quit();

    }

}
