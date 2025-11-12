package Package2;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class APIkeyAuthExamp {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
		
		Response response= given().header("contentType","application/json")
				.when().get("/posts")
				.then().statusCode(200)
				.log().all()
				.extract().response();
		
		

	}

}
