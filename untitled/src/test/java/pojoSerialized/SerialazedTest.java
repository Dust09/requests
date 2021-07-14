package pojoSerialized;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class SerialazedTest {

    @Test
    public void serelizationy(){
        AddPlace p = new AddPlace();
        p.setAccuracy(50);
        p.setAddress("elkipalki");
        p.setLanguage("america");
        p.setPhone_number("808885553535");
        p.setWebsite("https://site.com");
        p.setName("Oleg");

        List<String> muList = new ArrayList<String>();
        muList.add("chernykovka");
        muList.add("hata");
        p.setTypes(muList);

        Location l = new Location();
        l.setLat(38.883913);
        l.setLng(-38.891234);
        p.setLocation(l);

        RestAssured.baseURI = "https://rahulshettyacademy.com";
        Response res = given().log().all().queryParam("key","qaclick123").body(p).
                when().post("/maps/api/place/add/json").
                then().assertThat().statusCode(200).extract().response();
        String responseString = res.asString();
        System.out.println(responseString);
    }
}
