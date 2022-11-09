package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.project.Login;
import starter.project.Search;

public class SearchStep {
    @Steps
    Login login;

    @Steps
    Search search;
    @Given("I have logged in my account")
    public void iHaveLoggedInMyAccount() {
        login.openUrl();
        login.clickLoginIcon();
        login.inputEmail("ronasari@gmail.com");
        login.inputPassword("novtami");
        login.clickLoginButton();
        login.homeDisplayed();
    }

    @When("I click select button")
    public void iClickSelectButton() {
        search.clickSelectCategoryBtn();
    }

    @And("I click gaming button")
    public void iClickGamingButton() {
        search.clickGamingBtn();
    }

    @Then("I will get product is empty message")
    public void iWillGetProductIsEmptyMessage() {
        search.productEmptyDisplayed();
    }
}
