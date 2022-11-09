package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Hello.HelloGet;

public class HelloStep {

    @Steps
    HelloGet helloGet;
    @Given("I set the valid url get index")
    public void iSetTheValidUrlGetIndex() {
        helloGet.setGetUrl();

    }

    @When("I send get request")
    public void iSendGetRequest() {
        helloGet.sendGetRequest();
    }
}
