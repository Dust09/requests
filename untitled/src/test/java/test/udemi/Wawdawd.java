package test.udemi;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
//import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class Wawdawd {
    @Test
    public void rst() throws IOException {
        //given all input details
        // when submit the api
        //then - validate the response
        //Читать с файла для статичных файлов (payoad.json)
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        String response = given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json")
                .body(new String(Files.readAllBytes(Path.of("C:\\Users\\PC\\Desktop\\udemi\\untitled\\src\\test\\java\\test\\udemi\\payoad.json")))).when().post("maps/api/place/add/json")
                .then().assertThat().statusCode(200).body("scope",equalTo("APP")).
                header("Server","Apache/2.4.18 (Ubuntu)").extract().response().asString();

        //System.out.println(response);
        JsonPath js = new JsonPath(response);  // for parsing json
        String plaseId = js.getString("place_id");
        System.out.println(plaseId);

        //Update Place
        String newAddress = "Ufa";
        given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json").
                body(payoad.UpdatePlace(plaseId,newAddress)).
                when().put("maps/api/place/update/json")
        .then().log().all().assertThat().statusCode(200).body("msg",equalTo("Address successfully updated"));

        //Get Place

        String getPlaceResponce = given().log().all().queryParam("key","qaclick123").
                queryParam("place_id", plaseId).when().get("maps/api/place/get/json").
                then().log().all().assertThat().statusCode(200).extract().response().asString();
        JsonPath js2 = ReUsableMethods.rawToJson(getPlaceResponce);
        String actualAddress = js2.getString("address");

        System.out.println(actualAddress);
        Assert.assertEquals(newAddress,actualAddress);

    }

}
