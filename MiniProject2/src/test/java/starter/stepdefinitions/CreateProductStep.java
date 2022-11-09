package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Products.CreateProduct;

public class CreateProductStep {
    @Steps
    CreateProduct createProduct;
    @Given("I set url to create a comment product")
    public void iSetUrlToCreateACommentProduct() {
        createProduct.setUrlCreateComment();
    }

    @And("I set body Content")
    public void iSetBodyContent() {
        createProduct.setBodyContent();
    }

    @When("I send a comment request")
    public void iSendACommentRequest() {
        createProduct.requestComment();
    }

    @Given("I set url to assign a product rating")
    public void iSetUrlToAssignAProductRating() {
        createProduct.setUrlAssignProductRating();
    }

    @And("I set body ratings")
    public void iSetBodyRatings() {
        createProduct.setBodyRatings();
    }

    @When("I send a assign product request")
    public void iSendAAssignProductRequest() {
        createProduct.requestAssign();
    }
}
