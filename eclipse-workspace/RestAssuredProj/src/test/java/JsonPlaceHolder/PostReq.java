package JsonPlaceHolder;

import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.google.gson.JsonObject;

import io.restassured.RestAssured;

public class PostReq {
		
	
		//Create req. body-> 1.String 2.HashMap 3.org.json 4.POJO
		
		@Test
		public void postUser()
		{
		  String baseUrl= "https://jsonplaceholder.typicode.com";
		  
		  HashMap<String,String> reqBody= new HashMap<String,String>(); 
		  
		  reqBody.put("name", "Rajat");
		  reqBody.put("email", "rajat@gmail.com");
		  
		  JsonObject req= new JsonObject();
		  req.addProperty("name", "Raj");
		  req.addProperty("email","raj@gmail.com");;
		  
		  RestAssured.given()
		  			 .header("content-type", "application/json")
		  			 //.body(reqBody)
		  			// .body("{\"name\":\"raj\", \"email\":\"Raj@gmail.com\"}")
		  			 .body(req.toString())
		  			 .when()
		  			 .post(baseUrl+"/posts")
		  			 .then()
		  			 .assertThat()
		  			 .statusCode(201)
		  			 //.time(LessThan(197000L))
		  			 .body("name",equalTo("Raj"))
		  			 .header("content-type", "application/json; charset=utf-8")
		  			 .log()
		  			 //.body();
		  			 .all();
		  
		
		}

}
