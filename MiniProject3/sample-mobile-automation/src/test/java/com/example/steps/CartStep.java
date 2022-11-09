package com.example.steps;

import com.example.app.pages.Cart;
import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartStep {

    LoginPage loginPage = new LoginPage();

    Cart cart = new Cart();
    @Given("I have logged in first")
    public void iHaveLoggedInFirst() throws InterruptedException {
        loginPage.productHeaderDisplayed();
        loginPage.clickLoginIcon();
        loginPage.clickEmail();
        loginPage.inputEmail("ronasari@gmail.com");
        loginPage.clickPass();
        loginPage.inputPassword("novtami");
        loginPage.clickLoginBtn();
        loginPage.mainPageDisplayed();
    }


    @Then("the product will be added to cart icon")
    public void theProductWillBeAddedToCartIcon() {
        cart.productCartDisplayed();
    }

    @When("I click beli button")
    public void iClickBeliButton() {
        cart.clickBeliBtn();
    }

    @And("I I click second beli button")
    public void iIClickSecondBeliButton() {
        cart.clickBeliBtnDua();
    }

    @Then("the product will be added to cart")
    public void theProductWillBeAddedToCart() {
        cart.productCartDuaDisplayed();
    }
}
