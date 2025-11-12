package Package3;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class DeleteReqExample {

	public static void main(String[] args) {
		
		RestAssured.baseURI= "https://reqres.in/api";
		
		given()
		.when()
		.delete("/users/2")
		.then()
		.statusCode(204)     //No Content
		.log().all();
		

	}

}
