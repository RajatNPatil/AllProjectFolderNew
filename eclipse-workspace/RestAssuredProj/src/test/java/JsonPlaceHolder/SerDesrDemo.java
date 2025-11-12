package JsonPlaceHolder;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import com.google.gson.Gson;

import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class SerDesrDemo {
	
	@Test
	public void SerializationTest()
	{
		User user = new User(101, "Rajat", "8208134954");
		
		given()
			.contentType(ContentType.JSON)
			.body(user)
		.when()
			.post("https://jsonplaceholder.typicode.com/posts")
		.then()
			.statusCode(201)
			.log()
			.body();
	}
	
	@Test
	public void DeserializationTest()
	{
		Response res= get("https://jsonplaceholder.typicode.com/posts/101");
		
		Gson gson= new Gson();
		
		User user= gson.fromJson(res.asString(), User.class);
		
		System.out.println("Id: "+user.getUid());
		
		System.out.println("Name: "+user.getUname());
		
		System.out.println("Contact: "+user.getContact());
		
	}

}
