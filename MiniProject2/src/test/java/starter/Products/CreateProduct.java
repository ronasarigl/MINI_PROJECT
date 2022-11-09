package starter.Products;

import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.given;

public class CreateProduct {

    private String url, url2;

    private JSONObject body = new JSONObject();

    public void setUrlCreateComment(){
        url = "https://alta-shop.herokuapp.com/api/products/2/comments";
    }

    public void setBodyContent(){
        body.put("content","the games are great including Gran Turismo 7 but sadly GT4 is much better");
    }

    public void requestComment(){
        given().header("content-type","application/Json")
                .body(body.toJSONString())
                .when().post(url);
    }

    public void setUrlAssignProductRating(){
        url2 = "https://alta-shop.herokuapp.com/api/products/2/ratings";
    }

    public void setBodyRatings(){
        body.put("count","4");
    }

    public void requestAssign(){
        given().header("content-type","application/Json")
                .body(body.toJSONString())
                .when().post(url2);
    }
}
