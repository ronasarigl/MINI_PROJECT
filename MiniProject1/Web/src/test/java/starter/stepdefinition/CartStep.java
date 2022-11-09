package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.project.Cart;
import starter.project.Login;

public class CartStep {

    @Steps
    Login login;

    @Steps
    Cart cart;
    @Given("I have logged in first")
    public void iHaveLoggedInFirst() {
        login.openUrl();
        login.clickLoginIcon();
        login.inputEmail("ronasari@gmail.com");
        login.inputPassword("novtami");
        login.clickLoginButton();
        login.homeDisplayed();
    }

    @When("I click cart button")
    public void iClickCartButton() {
        cart.clickCartButton();
    }

    @Then("I will get added products")
    public void iWillGetAddedProducts() {
        cart.detailProductDisplayed();
    }
}
