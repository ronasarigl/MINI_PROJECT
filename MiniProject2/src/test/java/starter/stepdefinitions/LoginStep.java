package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Authentication.Login;

public class LoginStep {
    @Steps
    Login login;
    @Given("I set url user login")
    public void iSetUrlUserLogin() {
        login.setURLUserLogin();
    }

    @And("I Set valid email and password")
    public void iSetValidEmailAndPassword() {
        login.setValidEmailAndPassword();
    }

    @When("I send the request")
    public void iSendTheRequest() {
        login.sendTheRequest();
    }

    @Then("I will get status code 200")
    public void iWillGetStatusCode200(){
        login.validateStatusCode();
    }

    @And("I Set invalid email and password")
    public void iSetInvalidEmailAndPassword() {
        login.setInvalidEmailAndPassword();
    }

    @And("I get error record not found message")
    public void iGetErrorRecordNotFoundMessage() {
        login.validateINotFoundMessage();
    }

    @And("I Set null email and password")
    public void iSetNullEmailAndPassword() {
        login.setNullEmailAndPassword();
    }

    @And("I get error email is required message")
    public void iGetErrorEmailIsRequiredMessage() {
        login.validateEmailIsRequiredMessage();
    }

    @And("I Set valid email and invalid password")
    public void iSetValidEmailAndInvalidPassword() {
        login.setValidEmailInvalidPassword();
    }

    @And("I get error email or password is invalid message")
    public void iGetErrorEmailOrPasswordIsInvalidMessage() {
        login.validateEmailPasswordIsRequiredMessage();
    }

    @And("I Set invalid email and valid password")
    public void iSetInvalidEmailAndValidPassword() {
        login.setInvalidEmailValidPassword();
    }

    @Then("I will get status code 400")
    public void iWillGetStatusCode400(){
        login.validateCode();
    }
}
