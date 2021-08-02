package pojoDeserialazed.xmlser;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.parsing.Parser;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class CConnect {
 /*   @Test
    public void awdaw(){
        //RestAssured.baseURI = "https://08e0a5e5-9ca9-459a-bbbb-1e0a9928ed37.mock.pstmn.io";
        //Login
        SessionFilter session = new SessionFilter(); //----------- вот так вот
        Body response = given().relaxedHTTPSValidation().expect().defaultParser(Parser.XML)
                .when().get("https://run.mocky.io/v3/9248e590-645e-4e41-adfc-a98fd552159a").then().extract().response().as(Body.class);
        //System.out.println(response);
        System.out.println(response.getBody());

    }*/

    @Test
    public void adwa(){
        SessionFilter session = new SessionFilter(); //----------- вот так вот
        Body response = given().relaxedHTTPSValidation().expect().defaultParser(Parser.XML)
                .when().get("https://run.mocky.io/v3/47c91a84-720e-4b2a-ac76-1240971394a3").then().extract().response().as(Body.class);
        //System.out.println(response);
        System.out.println(response.getVisibility());

    }
}
