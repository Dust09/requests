package specBuilders;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.testng.annotations.Test;
import pojoSerialized.AddPlace;
import pojoSerialized.Location;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class SpecBuilderTest {

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

        ResponseSpecification responseExcept = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
        RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key","qaclick123").
                setContentType(ContentType.JSON).build();


        RequestSpecification res = given().spec(req)
                .body(p);

        Response response = res.when().post("/maps/api/place/add/json").
                then().spec(responseExcept).extract().response();
        String responseString = response.asString();
        System.out.println(responseString);
    }
}
