package Package3;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class ExtractingData {

	public static void main(String[] args) {
		
		Response response = given().when().get("/users/2").then().extract().response();
		
		String userMail= response.jsonPath().getString("data.email");
		
		System.out.println(userMail);

	}

}
