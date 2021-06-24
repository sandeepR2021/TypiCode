import io.restassured.config.EncoderConfig;
import io.restassured.config.RestAssuredConfig;
import static io.restassured.RestAssured.*;

public class Get_Single_User {

    final static String url="https://jsonplaceholder.typicode.com/users";

    public static void main(String args[])
    {
        String username = "Bret";
        String website = "hildegard.org";
        getResponseBodyandStatus(username, website);
    }

    //This will fetch the response body as is and log it.
    public static void getResponseBodyandStatus(String username, String website){
        EncoderConfig ec = new EncoderConfig();
            given()
                .queryParam("username",username)
                .queryParam("website",website)
                .contentType("application/json")
                .when()
                .get(url)
                .then().log().body()
                .and().assertThat().statusCode(200);
                System.out.println("The response status is "  + get(url).getStatusCode());
    }
}


