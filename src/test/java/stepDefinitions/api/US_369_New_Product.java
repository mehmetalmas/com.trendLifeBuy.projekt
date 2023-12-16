package stepDefinitions.api;

import hooks.api.HooksAPI;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.equalTo;

public class US_369_New_Product {


    private Response response = HooksAPI.response;

    @Given("API user mehmet verify response with matcher class")
    public void api_user_mehmet_verify_response_with_matcher_class() {
        response.then().body("packages.1.items[0].id", equalTo(746));




    }










}
