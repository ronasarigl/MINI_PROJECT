package com.example.steps;

import com.example.app.pages.RegistPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistStep {

    RegistPage registPage = new RegistPage();
    @And("I click login icon")
    public void iClickLoginIcon() {
        registPage.clickLoginIBtn();
    }

    @And("I click register text")
    public void iClickRegisterText() {
        registPage.clickRegText();
    }

    @When("I click field fullname")
    public void iClickFieldFullname() {
       registPage.clickFullname();
    }

    @And("I input {string} name")
    public void iInputName(String arg0) {
        registPage.inputNewFullname(arg0);
    }

    @And("I click field new email")
    public void iClickFieldNewEmail() {
        registPage.clickNewEmail();
    }

    @And("I input new {string} email")
    public void iInputNewEmail(String arg1) {
        registPage.inputNewEmail(arg1);
    }

    @And("I click field new password")
    public void iClickFieldNewPassword() {
        registPage.clickNewPass();
    }

    @And("I input new {string} password")
    public void iInputNewPassword(String arg2) {
        registPage.inputNewPass(arg2);
    }

    @And("I click register  button")
    public void iClickRegisterButton() {
        registPage.clickRegisterButton();
    }

    @Then("I  get {string}")
    public void iGet(String theresult) throws InterruptedException {
        if (theresult.equals("can't register account")) {
            registPage.errorFullnameMsgDisplayed();
            registPage.errorNewMailMsgDisplayed();
            registPage.errorNewPassMsgDisplayed();

        } else if (theresult.equals("successfull registration")) {
            registPage.mainPageDisplayed();

        } else if (theresult.equals("can't register account because email and password error ")) {
            registPage.errorNewMailMsgDisplayed();
            registPage.errorNewPassMsgDisplayed();

        } else if (theresult.equals("can't register account because name and password error")) {
            registPage.errorFullnameMsgDisplayed();
            registPage.errorNewPassMsgDisplayed();

        } else if (theresult.equals("can't register account because name and email error")) {
            registPage.errorFullnameMsgDisplayed();
            registPage.errorNewMailMsgDisplayed();

        } else if (theresult.equals("can't register account  because name error ")) {
            registPage.errorFullnameMsgDisplayed();

        } else if (theresult.equals("can't register account  because email error")) {
            registPage.errorNewMailMsgDisplayed();
        }
    }

}
