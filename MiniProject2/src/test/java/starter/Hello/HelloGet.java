package starter.Hello;

import static net.serenitybdd.rest.SerenityRest.given;

public class HelloGet {

    private String url;

    public void setGetUrl(){
        url = "https://alta-shop.herokuapp.com/api/hello";
    }

    public void sendGetRequest(){
        given().when().get(url);
    }
}
