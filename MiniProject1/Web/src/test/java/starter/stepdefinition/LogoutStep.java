package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.project.Login;
import starter.project.Logout;

public class LogoutStep {

    @Steps
    Login login;

    @Steps
    Logout logout;
    @Given("I have logged in")
    public void iHaveLoggedIn() {
        login.openUrl();
        login.clickLoginIcon();
        login.inputEmail("ronasari@gmail.com");
        login.inputPassword("novtami");
        login.clickLoginButton();
        login.homeDisplayed();
    }

    @When("I click profile icon")
    public void iClickProfileIcon() {
        logout.clickProfileIcon();
    }

    @And("I click logout text")
    public void iClickLogoutText() {
        logout.clickLogoutText();
    }

    @Then("I will go back to login page")
    public void iWillGoBackToLoginPage() {
        logout.loginPageDisplayed();
    }
}
