package Utils;

import org.json.JSONObject;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class RestBase {
	private static final String REQURES_BASE_URL = "https://reqres.in/api";

	public static ResponseOptions<Response> PostRequest(String endpoint, JSONObject body) {
		RestAssured.baseURI = REQURES_BASE_URL;
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		request.body(body.toString());
		return request.post(endpoint);
	}

	public static ResponseOptions<Response> GetRequest(String endpoint) {
		RestAssured.baseURI = REQURES_BASE_URL;
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		return request.get(endpoint);
	}
	
	public static ResponseOptions<Response> PatchRequest(String endpoint, JSONObject body){
		RestAssured.baseURI = REQURES_BASE_URL;
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		request.body(body.toString());
		return request.patch(endpoint);
	}
}

