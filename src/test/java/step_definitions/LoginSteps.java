package step_definitions;

import base.Base;
import config.Config;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;

import static step_definitions.hooks.Background.home;
import static step_definitions.hooks.Background.config;
import static step_definitions.hooks.Background.acc;

public class LoginSteps extends Base {

/*    HomePage home;
    AccountPage acc;
    Config config;*/

/*//    @Given("user opens up the browser and navigates to automation")
//    public void userOpensUpTheBrowserAndNavigatesToAutomation() {
//
//        config = new Config();
//
//        startBrowser(config.prop.getProperty("browser"), config.prop.getProperty("url"));
//
//        home = new HomePage(driver);
//        acc = new AccountPage(driver);
//
//    }

    @When("click on login link")
    public void click_on_login_link() {

        home.clickLoginLink();

    }*/

/*    @When("enters valid username")
    public void enters_valid_username() {

        home.inputUsername(config.prop.getProperty("username"));


    }*/

    @And("enters valid {string} in username field")
    public void entersValidInUsernameField(String username) {

        home.inputUsername(username);

    }

/*
    @When("enters valid password")
    public void enters_valid_password() {

        home.inputPass(config.prop.getProperty("password"));

    }
*/

    @And("enters valid {string} in password field")
    public void entersValidInPasswordField(String password) {

        home.inputPass(password);

    }

    @When("clicks on login button")
    public void clicks_on_login_button() {

        home.clickLoginButton();

    }

    @Then("user is navigated to my account page")
    public void user_is_navigated_to_my_account_page() {

        Assert.assertEquals("test", acc.userTextVerify());

    }

    @And("enters invalid {string} in username field")
    public void entersInvalidInUsernameField(String username) {

        home.inputUsername(username);

    }

    @And("enters invalid {string} in password field")
    public void entersInvalidInPasswordField(String password) {

        home.inputPass(password);

    }

    @Then("user sees an error message")
    public void userSeesAnErrorMessage() {

        Assert.assertTrue(isElementVisible(home.errorMsg));

    }
}
