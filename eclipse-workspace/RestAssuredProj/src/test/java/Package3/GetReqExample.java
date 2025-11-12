package Package3;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class GetReqExample {

	public static void main(String[] args) {
		
		RestAssured.baseURI= "https://automationexercise.com/api/productsList";
		
		given()
		.when()
		.get("/users/2")
		.then()
		.statusCode(200)
		.body("data.id",equalTo(2))
		.body("data.email",containsString("@reqres.in"))
		.log().all();
		

	}

}
