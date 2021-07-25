import java.util.HashMap;
import java.util.Map;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class test3 {
@Test
	public void test_post()
	{
		
		//Map<String, Object> map = new HashMap<String, Object>();
		//map.put("name","kavya");
		//map.put("job","intern");
		//System.out.println(map);
	
		JSONObject request = new JSONObject();
		

		
		request.put("name","kavya");
		request.put("job","intern");
		
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().
		header ("Content_type", "application/Json").
		contentType(ContentType.JSON).
		body(request.toJSONString()).
		when().
		post("https://reqres.in/api/users").
		then().
		statusCode(200);
	}

private Object given() {
	// TODO Auto-generated method stub
	return null;
}
	
}
