package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.project.Register;

public class Registerstep {
    @Steps
    Register register;
    @And("I click register text")
    public void iClickRegisterText() {
        register.clickRegistText();
    }

    @When("I input {string} name")
    public void iInputName(String arg2) {
        register.inputName(arg2);
    }

    @And("I input new {string} email")
    public void iInputNewEmail(String arg3) {
        register.inputTheEmail(arg3);
    }

    @And("I input new {string} password")
    public void iInputNewPassword(String arg4) {
        register.inputPass(arg4);
    }

    @And("I click register  button")
    public void iClickRegisterButton() {
        register.clickRegisBtn();
    }

    @Then("I will get {string}")
    public void iWillGet(String theresult) {
        if (theresult.equals("secessfull registration"))  {
            register.pageDisplayed();
        }
        else if (theresult.equals("error message"))  {
            register.errorMsgDisplayed();
        }
    }
}
