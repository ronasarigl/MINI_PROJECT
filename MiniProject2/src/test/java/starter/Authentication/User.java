package starter.Authentication;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.containsString;

public class User {

    private String url;

    public void setUserInfo(){
        url = "https://alta-shop.herokuapp.com/api/auth/info";
    }

    public void sendInfoRequest(){
        given().when().get(url);
    }

    public void validateTheCode(){
        then().statusCode(401);
    }

    public void unauthorizedMessage(){
        then().body(containsString("\"unauthorized\""));
    }
}
