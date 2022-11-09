package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.project.Login;

public class LoginStep {
    @Steps
    Login login;

    @Given("I am on home page")
    public void iAmOnHomePage() {
        login.openUrl();
    }

    @And("I click icon the login icon")
    public void iClickIconTheLoginIcon() {
        login.clickLoginIcon();
    }

    @When("I input {string} email")
    public void iInputEmail(String arg0) {
        login.inputEmail(arg0);
    }

    @And("I input {string} password")
    public void iInputPassword(String arg1) {
        login.inputPassword(arg1);
    }

    @And("I click login button")
    public void iClickLoginButton() {
        login.clickLoginButton();
    }

    @Then("I will get the {string}")
    public void iWillGetThe(String result) {
        if (result.equals("can't login")) {
            login.ErrorMessageDisplayed();
        }
        else if (result.equals("can login")){
            login.homeDisplayed();
        }
    }
}
