package steps;

import static org.junit.Assert.assertEquals;
import java.util.List;
import org.json.JSONObject;
import Utils.RestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

public class UserSteps {

	private ResponseOptions<Response> response;

	@Given("faco uma requisicao POST no endpoint {string}")
	public void PostRequest(String endpoint, DataTable dataTable) {

		JSONObject body = new JSONObject();
		List<List<String>> data = dataTable.cells();

		body.put("name", data.get(1).get(0));
		body.put("job", data.get(1).get(1));

		response = RestBase.PostRequest(endpoint, body);
	}
	
	@Given("faco uma requisicao PATCH no endpoint {string}")
	public void PatchRequest(String endpoint, DataTable dataTable) {

		JSONObject body = new JSONObject();
		List<List<String>> data = dataTable.cells();

		body.put("name", data.get(1).get(0));
		body.put("job", data.get(1).get(1));

		response = RestBase.PatchRequest(endpoint, body);
	}

	@Then("verifico o status code {int}")
	public void VerifyStatusCode(int statusCode) {
		assertEquals(statusCode, response.statusCode());
	}

	@Then("verifico se o {string} e {string} apresenta corretamente")
	public void CheckBody(String name, String job) {
		assertEquals(name, response.getBody().jsonPath().get("name"));
		assertEquals(job, response.getBody().jsonPath().get("job"));
	}

	@Given("faco uma requisicao GET no endpoint {string}")
	public void GetRequest(String endpoint) {
		response = RestBase.GetRequest(endpoint);
	}

	@Then("verifico se o id {int} apresenta corretamente")
	public void CheckID(int id) {
		assertEquals(id, response.getBody().jsonPath().get("data.id"));
	}
	
	@Then("verifico se o total {int} apresenta corretamente")
	public void verifico_se_o_total_apresenta_corretamente(int total) {
	    assertEquals(total, response.getBody().jsonPath().get("total"));
	}

}
