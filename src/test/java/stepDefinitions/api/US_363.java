package stepDefinitions.api;

import hooks.api.HooksAPI;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class US_363 {
    private Response response = HooksAPI.response;
    private RequestSpecification spec = HooksAPI.spec;

    @Given("API user updates that update the old_password to {string} , password {string} password_confirmation {string}")
    public void api_user_updates_that_update_the_old_password_to_password_password_confirmation(String old_password, String password, String password_confirmation) {
        JSONObject reqBody = new JSONObject();
        reqBody.put("old_password", old_password);
        reqBody.put("password", password);
        reqBody.put("password_confirmation", password_confirmation);

         response = given()
                .headers("Authorization", "Bearer " + HooksAPI.token)
                .contentType(ContentType.JSON)
                .accept("application/json")
                .spec(spec)
                .when()
                .body(reqBody.toString())
                .post(HooksAPI.fullPath);
        HooksAPI.response = response;

    }
    @Given("API user verify that response message message is {string}")
    public void api_user_verify_that_response_message_is(String message) {
        response.then().body("message", equalTo(message));
    }

    @Given("API user adds a new user with first_name {string} last_name {string} email {string} password {string} password_confirmation {string} user_type {string} referral_code {string}")
    public void apı_user_adds_a_new_user_with_first_name_last_name_email_password_password_confirmation_user_type_referral_code(String string, String string2, String string3, String string4, String string5, String string6, String string7) {
        JSONObject reqBody = new JSONObject();
        reqBody.put("first_name", string);
        reqBody.put("last_name", string2);
        reqBody.put("email", string3);
        reqBody.put("password", string4);
        reqBody.put("password_confirmation", string5);
        reqBody.put("user_type", string6);
        reqBody.put("referral_code", string7);

        response = given()
                .headers("Authorization", "Bearer " + HooksAPI.token)
                .contentType(ContentType.JSON)
                .accept("application/json")
                .spec(spec)
                .when()
                .body(reqBody.toString())
                .post(HooksAPI.fullPath);
        HooksAPI.response = response;
    }













}




