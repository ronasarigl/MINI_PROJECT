package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Authentication.User;

public class UserStep {
    @Steps
    User user;
    @Given("I set the url to get info")
    public void iSetTheUrlToGetInfo() {
        user.setUserInfo();
    }

    @When("I send info request")
    public void iSendInfoRequest() {
        user.sendInfoRequest();
    }

    @Then("I will get status code 401")
    public void iWillGetStatusCode401() {
        user.validateTheCode();
    }

    @And("I get unauthorized message")
    public void iGetUnauthorizedMessage() {
        user.unauthorizedMessage();
    }
}
