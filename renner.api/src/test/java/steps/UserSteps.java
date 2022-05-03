package steps;

import Utils.RestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;

public class UserSteps {

	private static ResponseOptions<Response> response;

	@Given("faco uma requisicao {string} no endpoint {string}")
	public void faco_uma_requisicao_no_endpoint(String metodo, String endpoint) {
	    RestBase.Request(metodo, endpoint);
	}

	@Given("passo como parameters {string} e {string}")
	public void passo_como_parameters_e(String string, String string2) {

	}

	@Then("verifico o status code {string}")
	public void verifico_o_status_code(String string) {

	}

	@Then("verifico se o {string} e {string} apresenta corretamente")
	public void verifico_se_o_e_apresenta_corretamente(String string, String string2) {

	}

	@Then("verifico se o id {int} apresenta corretamente")
	public void verifico_se_o_id_apresenta_corretamente(Integer int1) {

	}
	
	
}
