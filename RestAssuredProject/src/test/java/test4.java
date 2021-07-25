import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
public class test4 {

	@Test
	public void test_put()
	{
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
		put("https://reqres.in/api/users/2").
		then().
		statusCode(200);

}
}

