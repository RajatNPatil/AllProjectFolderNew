package Package3;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class PostReqExample {

	public static void main(String[] args) {
		
		RestAssured.baseURI= "https://reqres.in/api";
		
		given()
		.contentType(ContentType.JSON)
		.body("{ \"name\": \"John\", \"job\": \"QA Engineer\" }")
		.when()
		.post("/users	")
		.then()
		.statusCode(201)
		.body("name",equalTo("John"))
		.body("job",equalTo("QA Engineer"))
		.log().all();
		

	}

}
