package jiraapi;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class JiraTest {

    @Test
    public void login(){
        RestAssured.baseURI = "http://localhost:8080";
        //Login
        SessionFilter session = new SessionFilter(); //----------- вот так вот
        String response = given().relaxedHTTPSValidation().header("Content-Type","application/json").body("{ \"username\": \"dima\", \"password\": \"SaTreY100$B\" }").
                filter(session).when().post("/rest/auth/1/session").then().log().all().extract().response().asString();
        //можно так
        /*JsonPath js = new JsonPath(response);
        String value = js.getString("session.value");*/
        // а можо так cm выше

        //Add comment
        String expectedMessage = "Hi im new in json";
        String addComment = given().pathParam("key","10000").header("Content-Type","application/json").body("{\n" +
                "    \"body\": \""+expectedMessage+"\",\n" +
                "    \"visibility\": {\n" +
                "        \"type\": \"role\",\n" +
                "        \"value\": \"Administrators\"\n" +
                "    }\n" +
                "}").filter(session).when().post("/rest/api/2/issue/{key}/comment").then().assertThat().statusCode(201).extract().response().asString();
        JsonPath js = new JsonPath(addComment);
        String commentID = js.getString("id");


        //Add aTTachment
        //multiPart работает с файлами
        given().header("X-Atlassian-Token","no-check").filter(session).pathParam("key","10000").
                header("Content-Type","multipart/form-data").
                when().multiPart("file",new File("C:\\Users\\PC\\Desktop\\udemi\\untitled\\src\\test\\java\\test\\udemi\\payoad.json")).
                post("/rest/api/2/issue/{key}/attachments").then().log().all().assertThat().statusCode(200);

        //Get Issue
        String isseDetails = given().filter(session).pathParam("key","10000").
                queryParam("fields","comment").
                when().get("/rest/api/2/issue/{key}").then().log().all().
                extract().response().asString();
        System.out.println("OUTPUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUUTTTT--------------------------------------");
        System.out.println(isseDetails);

        JsonPath js1 = new JsonPath(isseDetails);
        int commntCount = js1.getInt("fields.comment.comments.size()");

        for(int i = 0; i<commntCount;i++){
            String commentIdIssue = js1.get("fields.comment.comments["+i+"].id").toString();
            System.out.println(commentID);
            if(commentIdIssue.equalsIgnoreCase(commentID)){
                String messege = js1.get("fields.comment.comments["+i+"].body").toString();
                Assert.assertEquals(messege,expectedMessage);
                System.out.println(messege);

            }
        }
    }
}
