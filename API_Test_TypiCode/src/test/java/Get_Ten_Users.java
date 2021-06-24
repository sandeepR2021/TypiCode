import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.lessThan;

public class Get_Ten_Users {

    final static String url="https://jsonplaceholder.typicode.com/users";

    public static void main(String args[])
    {
        getResponseBody();
        getResponseStatus();
    }

    //This will fetch the response body as is and log it.
    public static void getResponseBody(){
            given().when().get(url).then().log().body();
    }

    public static void getResponseStatus(){
        int statusCode= given().when().get(url).getStatusCode();
            System.out.println("The response status is "+ statusCode);
            given().when().get(url).then().assertThat().statusCode(200);
    }
}


