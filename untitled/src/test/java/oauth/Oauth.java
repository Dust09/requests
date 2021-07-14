package oauth;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Oauth {

    @Test
    public static void oauth(){

      String accessToken = given().urlEncodingEnabled(false).queryParams("code","4%2F0AY0e-g47iThT04vNbh4XsP_iB8tf-9GPdWYo6zLikNj4G7yTtejaQ3G0d2QNC3qKLb2gOg").
                queryParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com").
                queryParams("client_secret","erZOWM9g3UtwNRj340YYaK_W").
                queryParams("redirect_uri","https://rahulshettyacademy.com/getCourse.php").
                queryParams("grant_type","authorization_code").
                when().log().all().
                post("https://www.googleapis.com/oauth2/v4/token").asString();
        JsonPath js = new JsonPath(accessToken);
        String token = js.getString("access_token");

       String response =  given().queryParam("access_token",token).
                when().log().all().get("https://rahulshettyacademy.com/getCourse.php").asString();
        System.out.println(response);
    }
}
