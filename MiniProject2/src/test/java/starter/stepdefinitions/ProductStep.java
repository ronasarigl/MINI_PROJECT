package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Products.GetProduct;

public class ProductStep {
    @Steps
    GetProduct getProduct;
    @Given("I set the url to get all products")
    public void iSetTheUrlToGetAllProducts() {
        getProduct.setTheUrlToGetAllProducts();
    }

    @When("I send request")
    public void iSendRequest() {
        getProduct.sendRequest();
    }

    @Given("I set valid url")
    public void iSetValidUrl() {
        getProduct.setValidUrl();
    }

    @When("I send request product ratings")
    public void iSendRequestProductRatings() {
        getProduct.sendRequestProductRatings();
    }

    @Given("I set valid url comments")
    public void iSetValidUrlComments() {
        getProduct.setUrlComments();
    }

    @When("I send request comment")
    public void iSendRequestComment() {
        getProduct.requestComment();
    }
}
