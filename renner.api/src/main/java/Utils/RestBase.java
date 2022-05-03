package Utils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;

public class RestBase {
	private static final String REQURES_BASE_URL = "https://reqres.in/api";

	public static ResponseOptions<Response> Request(String metodo, String endpoint) {
		RestAssured.baseURI = REQURES_BASE_URL;
		RequestSpecification request = RestAssured.given();
		request.header("Content-Type", "application/json");
		
		System.out.println(metodo);
		System.out.println(endpoint);
		
		return null;
		
	}
	
}
