package starter.Authentication;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;
import static net.serenitybdd.rest.SerenityRest.then;
import static org.hamcrest.Matchers.containsString;

public class Login {
    private String url;

    private JSONObject body = new JSONObject();

    public void setURLUserLogin(){
        url = "https://alta-shop.herokuapp.com/api/auth/login";
    }

    public void setValidEmailAndPassword(){
        body.put("email","someone@mail.com");
        body.put("password","123123");
    }

    public void setInvalidEmailAndPassword(){
        body.put("email","some@mail.com");
        body.put("password","123");
    }

    public void setNullEmailAndPassword(){
        body.put("email","");
        body.put("password","");
    }

    public void setValidEmailInvalidPassword(){
        body.put("email","someone@mail.com");
        body.put("password","123");
    }

    public void setInvalidEmailValidPassword(){
        body.put("email","someone@mail.com");
        body.put("password","123");
    }

    public void sendTheRequest(){
        given().header("content-type","application/Json")
                .body(body.toJSONString())
                .when().post(url);
    }

    public void validateINotFoundMessage() {
        then().body(containsString("\"email or password is invalid\""));
    }

    public void validateEmailIsRequiredMessage() {
        then().body(containsString("\"email is required\""));
    }

    public void validateEmailPasswordIsRequiredMessage() {
        then().body(containsString("\"email or password is invalid\""));
    }

    public void validateStatusCode(){
        then().statusCode(200);
    }

    public void validateCode(){
        then().statusCode(400);
        }


}

