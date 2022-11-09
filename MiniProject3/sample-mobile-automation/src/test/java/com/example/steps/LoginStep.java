package com.example.steps;

import com.example.app.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {

    LoginPage loginPage = new LoginPage();

    @Given("I am on home page")
    public void iAmOnHomePage() {
        loginPage.productHeaderDisplayed();
    }

    @And("I click icon the login icon")
    public void iClickIconTheLoginIcon() {
        loginPage.clickLoginIcon();
    }


    @When("I click field email")
    public void iClickFieldEmail() {
        loginPage.clickEmail();

    }
    @And("I input {string} email")
    public void iInputEmail(String arg0) {
        loginPage.inputEmail(arg0);
    }

    @And("I click field password")
    public void iClickFieldPassword() {
        loginPage.clickPass();
    }

    @And("I input {string} password")
    public void iInputPassword(String arg1) {
        loginPage.inputPassword(arg1);
    }

    @And("I click the login button")
    public void iClickTheLoginButton() {
        loginPage.clickLoginBtn();
    }

    @Then("I will get {string}")
    public void iWillGet(String result) throws InterruptedException {
        if (result.equals("can't login")) {
            loginPage.errorEmailMsgDisplayed();
            loginPage.errorPassMsgDisplayed();

        } else if (result.equals("can login and main page displayed")) {
            loginPage.mainPageDisplayed();

        } else if (result.equals("can't login because email error message")) {
            loginPage.errorEmailMsgDisplayed();

        } else if (result.equals("can't login because password error message")) {
            loginPage.errorPassMsgDisplayed();

        } else if (result.equals("can't login because invalid  email or password")) {
            loginPage.errorInvalidMsgDisplayed();

        }
    }}