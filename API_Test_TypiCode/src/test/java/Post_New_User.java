import io.restassured.config.EncoderConfig;
import io.restassured.config.RestAssuredConfig;

import static io.restassured.RestAssured.given;

public class Post_New_User {

    final static String url="https://jsonplaceholder.typicode.com/users";

    public static void main(String args[])
    {
        getResponseBody();
        getResponseStatus();
    }

    //This will fetch the response body as is and log it.
    public static void getResponseBody(){
        EncoderConfig ec = new EncoderConfig();
        String postJsonData = "{\"name\":\"test\"}";
       // JSON.parse(JSON.stringify(userData))

        given()
                .contentType("application/json")
                .config(RestAssuredConfig.config().encoderConfig(ec.appendDefaultContentCharsetToContentTypeIfUndefined(false)))
                .body(postJsonData)
                .when()
                .post(url)
                .then().log().body();
    }

    public static void getResponseStatus(){
        int statusCode= given().queryParam("name","test")
            .when().get(url).getStatusCode();
            System.out.println("The response status is "+statusCode);
            given().when().get(url).then().assertThat().statusCode(200);
    }
}


