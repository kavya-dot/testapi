import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class test5 {
	
	@Test
	public void test_del()
	{
		
		
		when().
		put("https://reqres.in/api/users/2").
		then().
		statusCode(204);
	}


}
