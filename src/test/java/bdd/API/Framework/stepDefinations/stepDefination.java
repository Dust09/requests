package bdd.API.Framework.stepDefinations;

import bdd.API.Framework.pojo.pojoSerialized.AddPlace;
import bdd.API.Framework.pojo.pojoSerialized.Location;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.Assert;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static io.restassured.RestAssured.given;

public class stepDefination extends Utils {

    /*RequestSpecification res;
    ResponseSpecification responseExcept;
    Response response;
    TestDataBuild data = new TestDataBuild();*/

    @Given("Add Place Payload")
    public void add_Place_Payload() {
        // Write code here that turns the phrase above into concrete actions
       /* responseExcept = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
        RestAssured.baseURI = "https://rahulshettyacademy.com";
        RequestSpecification req = new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com").addQueryParam("key","qaclick123").
                setContentType(ContentType.JSON).build();
        res = given().spec(req)
                .body(data.addPlacePayload());*/
        System.out.println("23");
    }

    @When("user calls {string} with Post http request")
    public void user_calls_with_Post_http_request(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("2123");
    }

    @Then("the API call got succeess with status code {int}")
    public void the_API_call_got_succeess_with_status_code(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("2123");
    }

}
