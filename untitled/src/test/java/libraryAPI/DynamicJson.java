package libraryAPI;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import test.udemi.ReUsableMethods;
import test.udemi.payoad;

import static io.restassured.RestAssured.given;

public class DynamicJson {

    @Test(dataProvider = "BooksData")
    public void addBook(String isbn,String aisle){
        RestAssured.baseURI = "http://216.10.245.166";
        String response = given().header("Content-Type","application/json").
                body(payoad.AddBook(isbn,aisle)).
                when().post("/Library/Addbook.php").
                then().assertThat().statusCode(200).
                extract().response().asString();
        JsonPath js = ReUsableMethods.rawToJson(response);
        String id = js.get("ID");
        System.out.println(id);

        //delete books
        String responseDelete = given().header("Content-Type","application/json").
            body(payoad.DeleteBook(id)).when().post("/Library/DeleteBook.php").
                then().log().all().assertThat().statusCode(200).
                extract().response().asString();
    }


    @DataProvider(name="BooksData")
    public  Object[][] getData(){
        //array = collection of elements
        //multidimensional array = collection of arrays
        return new Object[][]{{"name114111","9442321"},{"name29022","3132231"},{"name33351333","31341632"}};
    }
}
