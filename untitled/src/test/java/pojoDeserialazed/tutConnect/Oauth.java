package pojoDeserialazed.tutConnect;

import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;
import org.junit.Assert;
import org.testng.annotations.Test;
import pojoDeserialazed.Api;
import pojoDeserialazed.GetCourse;
import pojoDeserialazed.WebAutomation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.given;

public class Oauth {

    @Test
    public static void oauth(){
        String code = "4%2F0AY0e-g60WDHHgzo0lVo5om9b0Bw8wWLus3b6Eydd7qHgYNV-RgbmsiwAd_uRZbYcaEWEfA";
      String accessToken = given().urlEncodingEnabled(false).queryParams("code",code).
                queryParams("client_id","692183103107-p0m7ent2hk7suguv4vq22hjcfhcr43pj.apps.googleusercontent.com").
                queryParams("client_secret","erZOWM9g3UtwNRj340YYaK_W").
                queryParams("redirect_uri","https://rahulshettyacademy.com/getCourse.php").
                queryParams("grant_type","authorization_code").
                when().log().all().
                post("https://www.googleapis.com/oauth2/v4/token").asString();
        JsonPath js = new JsonPath(accessToken);
        String token = js.getString("access_token");

       GetCourse responseGetcourse =  given().queryParam("access_token",token).expect().defaultParser(Parser.JSON).
                when().get("https://rahulshettyacademy.com/getCourse.php").as(GetCourse.class);

       /*System.out.println(responseGetcourse.getLinkedIn());
       System.out.println(responseGetcourse.getInstructor());
        System.out.println(responseGetcourse.getCourses().getApi().get(1).getCourseTitle());*/
        List<Api> apiCourses = responseGetcourse.getCourses().getApi();
        for (int i = 0; i<apiCourses.size();i++){
            System.out.println(apiCourses.get(i).getCourseTitle());
            if(apiCourses.get(i).getCourseTitle().equalsIgnoreCase("SoapUI Webservices testing")){
                System.out.println(apiCourses.get(i).getPrice());
            }
        }
        String[] corseTitles = {"Selenium Webdriver Java","Cypress","Protractor"};
        ArrayList<String> a = new ArrayList<String>();

        List<WebAutomation> webAutomationsCourse = responseGetcourse.getCourses().getWebAutomation();
        for(int i = 0; i<webAutomationsCourse.size();i++){
            System.out.println(webAutomationsCourse.get(i).getCourseTitle());
            a.add(webAutomationsCourse.get(i).getCourseTitle());
        }
        List<String> expectedList = Arrays.asList(corseTitles);
        Assert.assertTrue(a.equals(expectedList));
    }
}
