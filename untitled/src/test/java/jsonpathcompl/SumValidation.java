package jsonpathcompl;

import io.restassured.path.json.JsonPath;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.udemi.payoad;

import static test.udemi.payoad.CourseParse;

public class SumValidation {

    @Test
    public void sumOfCourses(){
        JsonPath js = new JsonPath(payoad.CourseParse());
        int count = js.get("courses.size()");
        int sum = 0;
        for(int i = 0; i<count;i++){
            int price = js.getInt("courses["+i+"].price");
            int copies = js.getInt("courses["+i+"].copies");
            int amount = price * copies;
            sum = sum + amount ;
            System.out.println(amount);
        }
        System.out.println(sum);
        int purchaseAmount = js.getInt("dashboard.purchaseAmount");
        Assert.assertEquals(sum,purchaseAmount);
    }
}
