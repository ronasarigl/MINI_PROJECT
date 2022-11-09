package starter.Products;

import static net.serenitybdd.rest.SerenityRest.given;

public class GetProduct {

    private String url, url2, url3;

    public void setTheUrlToGetAllProducts(){
        url = "https://alta-shop.herokuapp.com/api/products";
    }

    public void sendRequest(){
        given().when().get(url);
    }


    public void setValidUrl(){
        url2 = "https://alta-shop.herokuapp.com/api/products/2/ratings";
    }

    public void sendRequestProductRatings(){
        given().when().get(url2);
    }

    public void setUrlComments(){
        url3 = "https://alta-shop.herokuapp.com/api/products/2/comments";
    }

    public void requestComment(){
        given().when().get(url3);
    }

}
