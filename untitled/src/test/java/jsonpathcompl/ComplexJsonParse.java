package jsonpathcompl;

import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import test.udemi.payoad;
public class ComplexJsonParse {

    @Test
    public static void sss(){
        JsonPath js = new JsonPath(payoad.CourseParse());
        //count courses
        int count = js.getInt("courses.size()");
        System.out.println(count+" SIIIZEEEEE");
        int totalAmount = js.getInt("dashboard.purchaseAmount");
        System.out.println(totalAmount + " TOOTAL AMOUNT");
        //first course
        String titleFirst = js.get("courses[0].title");
        System.out.println(titleFirst + " FIIRST COURCE");

        for (int i = 0 ; i<count ;i++){
          String course = js.get("courses["+i+"].title");
          String price = js.get("courses["+i+"].price").toString();
            System.out.println(course+" "+ price);
            //System.out.println(price);

        }
        System.out.println("---------------------------------------------------------------------------------");
        for(int i = 0; count>i;i++){
            String courseTitles = js.get("courses["+i+"].title");
            //equalsIgnoreCase = игнорит все кроме RPA
            if(courseTitles.equalsIgnoreCase("RPA")){
                System.out.println(courseTitles);
                int copies = js.get("courses["+i+"].copies");
                System.out.println(copies);
            }

        }


    }
}
