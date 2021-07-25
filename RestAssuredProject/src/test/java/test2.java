import org.testng.annotations.Test;
import io.restassured.RestAssured.*;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;
public class test2 {

	@Test
	public void test_get()
	{
		
		given (). 
		get("https://reqres.in/api/users?page=2").
			then ().
			statusCode(200).
			body("data.id[1]", equalTo (7)).
			body("data.first_name", hasItem("Michael","Lawson");
			log().all();
		
			
	}
}
