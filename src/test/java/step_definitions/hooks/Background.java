package step_definitions.hooks;

import base.Base;
import config.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import page_library.AccountPage;
import page_library.HomePage;

public class Background extends Base {

    public static HomePage home;
    public static AccountPage acc;
    public static Config config;

    @Before
    public void setUp(){

        config = new Config();

    }

    @Given("user opens up the browser and navigates to automation")
    public void userOpensUpTheBrowserAndNavigatesToAutomation() {

        startBrowser(config.prop.getProperty("browser"), config.prop.getProperty("url"));

        home = new HomePage(driver);
        acc = new AccountPage(driver);

    }

    @When("click on login link")
    public void click_on_login_link() {

        home.clickLoginLink();

    }

    @After
    public void tearD(){

        quitBrowser();

    }

}
