package basic;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

/**
 given() -> Initialization/ Auth
 login to application
 request header
 parameters, cookies
 body

 when() -> Resources
 ex: GET(resource path)
 POST(resource path)
 PUT(resource path)
 DELETE(resource path)

 then() -> Validation
 assert
 extract the response, header

 Given  I have this information
 When  I perform this action
 Then  This should be the output
 */

public class GetData {

   @BeforeClass
   public void setUp(){

      RestAssured.baseURI = "https://maps.googleapis.com";
      RestAssured.basePath = "/maps/api";
   }
   @Test
   public void StatuscodeVerification(){
      given()
              .param("origins","Vancouver+BC|Seattle")
              .param("destinations","an+Francisco|VictVictoria+BC")
              .param("key","AIzaSyBZkEpbtoa6cx3sARxOFrcMQSI2zFuQfds")
      .when()
               .get("/distancematrix/json")
      .then()
               .statusCode(200);
   }

   @Test
   public void getResponseBody(){

      Response res =
      given()
              .param("origins","Vancouver+BC|Seattle")
              .param("destinations","an+Francisco|VictVictoria+BC")
              .param("key","AIzaSyBZkEpbtoa6cx3sARxOFrcMQSI2zFuQfds")
              .when()
              .get("/distancematrix/json");
      System.out.println(res.body().prettyPrint());

   }
}
