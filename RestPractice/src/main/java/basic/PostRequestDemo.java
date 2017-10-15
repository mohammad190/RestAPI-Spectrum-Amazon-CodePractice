package basic;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostRequestDemo {

    @BeforeClass
    public void setUp(){

        RestAssured.baseURI = "https://maps.googleapis.com";
        RestAssured.basePath = "/maps/api";
    }
    @Test
    public void postRequest() {
        Response response =

        given()
                .queryParam("key","AIzaSyAuYk7zibVQh2Eu7NpyaoCDK6Xh2R2fIZE")
                .body("{\n" +
                        "  \"location\": {\n" +
                        "    \"lat\": -33.8669710,\n" +
                        "    \"lng\": 151.1958750\n" +
                        "  },\n" +
                        "  \"accuracy\": 50,\n" +
                        "  \"name\": \"Google Shoes!\",\n" +
                        "  \"phone_number\": \"(02) 9374 4000\",\n" +
                        "  \"address\": \"48 Pirrama Road, Pyrmont, NSW 2009, Australia\",\n" +
                        "  \"types\": [\"shoe_store\"],\n" +
                        "  \"website\": \"http://www.google.com.au/\",\n" +
                        "  \"language\": \"en-AU\"\n" +
                        "}")
                .when()
                    .post("place/add/json");
        System.out.println(response.prettyPrint());

//                .then()
//                .statusCode(200).and()
//                .contentType(ContentType.JSON).and()
//                .body("status",equalTo("OK"));
    }
}
