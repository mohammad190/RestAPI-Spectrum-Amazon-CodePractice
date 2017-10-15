package basic;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;


import static io.restassured.RestAssured.given;

public class ValidateResponse {

    @BeforeClass
    public void setUp(){

        RestAssured.baseURI = "https://maps.googleapis.com";
        RestAssured.basePath = "/maps/api";
    }
    @Test
    public void validateResponse() {
        given()
                .param("origins", "Vancouver+BC|Seattle")
                .param("destinations", "an+Francisco|VictVictoria+BC")
                .param("key", "AIzaSyBZkEpbtoa6cx3sARxOFrcMQSI2zFuQfds")
                .when()
                .get("/distancematrix/json")
                .then()
                .statusCode(200)
                .and()
                //.body("rows[0].elements[0].distance.text",equalTo("1,527 km"))
                .body("rows[1].elements[1].duration.value",equalTo(16651))
                .contentType(ContentType.JSON);
    }
}
