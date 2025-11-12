package JsonPlaceHolder;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APITest {
	
	@Test
	public void getUser()
	{
	  String baseUrl= "https://jsonplaceholder.typicode.com";
	  
	  Response response= RestAssured.get(baseUrl+"/posts");
	  
	  System.out.println(response.asString());
	
	}

}
