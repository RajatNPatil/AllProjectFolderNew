package Package2;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class APIkeyAuthExamp2 {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://api.example.com";
		
		Response response= given().header("x-api-key","YOUR_API_KEY")
				.when().get("/data")
				.then().statusCode(200)
				.log().all()
				.extract().response();
		
		

	}

}
