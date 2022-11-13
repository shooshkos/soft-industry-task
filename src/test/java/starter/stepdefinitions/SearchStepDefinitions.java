package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.module.jsv.JsonSchemaValidator;
import net.serenitybdd.rest.SerenityRest;

import java.io.File;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class SearchStepDefinitions {

    final String BASE_URL = "https://waarkoop-server.herokuapp.com/api/v1/search/test/";

    @When("I call GET {string}")
    public void iCallGET(String product) {
        SerenityRest.given().get(BASE_URL + product);
    }

    @Then("I see response has {int} status code")
    public void iSeeResponseHasStatusCode(int code) {
        restAssuredThat(response -> response.statusCode(code));
    }

    @And("I see the proper response body")
    public void iSeeTheProperResponseBody() {
        restAssuredThat(response -> response.body(JsonSchemaValidator.
                matchesJsonSchema(new File("src/test/resources/schema.json"))));
    }

    @When("I call POST method on my endpoint")
    public void iCallPOSTMethodOnMyEndpoint() {
        SerenityRest.given().post(BASE_URL + "testing-data");
    }
}
