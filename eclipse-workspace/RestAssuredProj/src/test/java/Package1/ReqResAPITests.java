package Package1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ReqResAPITests {
	
		RequestSpecification requestSpecification ;
		Response response;
		
		RequestSpecBuilder requestSpec;
		
		@BeforeMethod
		public void setTestEnv()
		{
			//RestAssured.baseURI = "https://reqres.in/api";
			//requestSpecification = RestAssured.given();
			requestSpecification = new RequestSpecBuilder()
	                .setBaseUri("https://reqres.in/api")
	                .setContentType("application/json")
	                .setAccept("*/*")
	                .addHeader("x-api-key", "reqres-free-v1")
	                .build();
			
		}
		
		
		@Test
		public void testGetUsers()
		{
			response = RestAssured.given().spec(requestSpecification)
								.queryParam("page", "2")
								.when()
								.get("/users");
			
			System.out.println("Response Body: " + response.getBody().asPrettyString());
								
			 JsonPath jsonPath = response.jsonPath();	
			 Assert.assertEquals(jsonPath.get("page"),Integer.valueOf(2))  ;
			
			
//			
//			System.out.println("Response Body: " + response.getBody().asPrettyString());
//			response.then().assertThat().statusCode(200).and().statusLine("HTTP/1.1 200 OK");
		}
		
		@Test
		public void testgetPerticularUser()
		{
		System.out.println("Test for getting a particular user by ID");
		requestSpecification = RestAssured.given().spec(requestSpecification);
				  										//.pathParam("id", 2);
		  response = requestSpecification.when().get("/users/2");
		  System.out.println("Response Body: " + response.getBody().asPrettyString());
			response.then().assertThat().statusCode(200).and().statusLine("HTTP/1.1 200 OK");
		}
		
		@AfterMethod
		public void teatdownEnv()
		{
			
		}
	 
	}


