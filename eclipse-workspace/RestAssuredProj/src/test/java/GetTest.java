import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetTest {
	
	public static void main(String[] args)
	{
	
	
		String baseUrl= "https://jsonplaceholder.typicode.com";
		
		Response response= RestAssured.get(baseUrl+"/posts");
		
		System.out.println(response.asString());
		Assert.assertEquals(response.statusCode(), 200);

}
}