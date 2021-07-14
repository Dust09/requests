package test.udemi;

public class payoad {

    public static String AddPlace(){

        return "{\n" +
                "  \"location\": {\n" +
                "    \"lat\": -36.383494,\n" +
                "    \"lng\": 30.427362\n" +
                "  },\n" +
                "  \"accuracy\": 50,\n" +
                "  \"name\": \"eba\",\n" +
                "  \"phone_number\": \"88005553535\",\n" +
                "  \"address\": \"ya java\",\n" +
                "  \"types\": [\n" +
                "    \"shoe park\",\n" +
                "    \"shop\"\n" +
                "  ],\n" +
                "  \"website\": \"http://wawaw.com\",\n" +
                "  \"language\": \"French-IN\"\n" +
                "}";
    }

    public static String UpdatePlace(String placeId, String newAddres){
        return "{\n" +
                "\"place_id\":\""+placeId+"\",\n" +
                "\"address\":\""+newAddres+"\",\n" +
                "\"key\":\"qaclick123\"\n" +
                "}";
    }

    public static String CourseParse(){

        return "{\n" +
                "\n" +
                "\"dashboard\": {\n" +
                "\n" +
                "\"purchaseAmount\": 910,\n" +
                "\n" +
                "\"website\": \"rahulshettyacademy.com\"\n" +
                "\n" +
                "},\n" +
                "\n" +
                "\"courses\": [\n" +
                "\n" +
                "{\n" +
                "\n" +
                "\"title\": \"Selenium Python\",\n" +
                "\n" +
                "\"price\": 50,\n" +
                "\n" +
                "\"copies\": 6\n" +
                "\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "\n" +
                "\"title\": \"Cypress\",\n" +
                "\n" +
                "\"price\": 40,\n" +
                "\n" +
                "\"copies\": 4\n" +
                "\n" +
                "},\n" +
                "\n" +
                "{\n" +
                "\n" +
                "\"title\": \"RPA\",\n" +
                "\n" +
                "\"price\": 45,\n" +
                "\n" +
                "\"copies\": 10\n" +
                "\n" +
                "}\n" +
                "\n" +
                "]\n" +
                "\n" +
                "}\n" +
                "\n";
    }

    public static String AddBook(String isbn, String aisle){
        String payload = "{\n" +
                "\n" +
                "\"name\":\"Lear23n Appium Automation with Javaa\",\n" +
                "\"isbn\":\""+isbn+"\",\n" +
                "\"aisle\":\""+aisle+"\",\n" +
                "\"author\":\"John foeee\"\n" +
                "}";
        return payload;
    }


    public static String DeleteBook(String id) {
        String deleteBook = "{\n" +
                " \n" +
                "\"ID\" : \""+id+"\"\n" +
                " \n" +
                "} \n";
        return deleteBook;
    }
}
