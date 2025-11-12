package Package3;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PutReqExample {

	public static void main(String[] args) {
		
		RestAssured.baseURI= "https://reqres.in/api";
		
		given()
		.contentType(ContentType.JSON)
		.body("{ \"name\": \"John\", \"job\": \"Senior QA Engineer\" }")
		.when()
		.put("/users/2")
		.then()
		.statusCode(200)
		.body("job",equalTo("Senior QA Engineer"))
		.log().all();
		

	}

}
