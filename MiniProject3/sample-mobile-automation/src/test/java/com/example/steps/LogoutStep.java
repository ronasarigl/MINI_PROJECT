package com.example.steps;

import com.example.app.pages.LoginPage;
import com.example.app.pages.LogoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogoutStep {

    LoginPage loginpage = new LoginPage();

    LogoutPage logoutPage = new LogoutPage();
    @Given("I have logged in")
    public void iHaveLoggedIn() {
        loginpage.productHeaderDisplayed();
        loginpage.clickLoginIcon();
        loginpage.clickEmail();
        loginpage.inputEmail("ronasari@gmail.com");
        loginpage.clickPass();
        loginpage.inputPassword("novtami");
        loginpage.clickLoginBtn();
    }

    @When("I click logout icon")
    public void iClickLogoutIcon() {
        logoutPage.clickLogoutBtn();
    }

    @Then("I will go back to login page")
    public void iWillGoBackToLoginPage() {
        logoutPage.prodHeader();
    }
}
