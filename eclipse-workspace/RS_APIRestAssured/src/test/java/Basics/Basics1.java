//package Basics;
//
//import io.restassured.RestAssured;
//import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;
//
//import files.payload;
//
//public class Basics1 {
//
//	public static void main(String[] args) {
//		
//		//Validate if add place API is working as expected or not
//		
////		given- input the details
////		when- submit the api- http methods, resource
////		then- validate the response
//		
//		RestAssured.baseURI= "https://rahulshettyacademy.com";
//		
//		given().log().all().queryParam("key", "qaclick123").header("Content-Type","application/json")
//		.body(payload.AddPlace())
//		.when().post("/maps/api/place/add/json")
//		.then().assertThat().statusCode(200).body("Scope", equalTo("APP")).header("Server", "Apache/2.4.52 (Ubuntu)");
//		
//		
//		
//		
//
//	}
//
//}
