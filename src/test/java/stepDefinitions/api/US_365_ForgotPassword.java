package stepDefinitions.api;

import hooks.api.HooksAPI;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class US_365_ForgotPassword {

    private Response response = HooksAPI.response;

    @Given("API user enters {string} email information and send post request")
    public void api_user_enters_email_information_and_send_post_request(String email) {
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("email",email);

        response = given()
                .headers("Authorization", "Bearer " + HooksAPI.token)
                .contentType(ContentType.JSON)
                .accept("application/json")
                .spec(HooksAPI.spec)
                .when()
                .body(jsonObject.toString())
                .post(HooksAPI.fullPath);
        HooksAPI.response = response;
        //HooksAPI.response.prettyPrint();
    }



    @Given("API user verify that message information1 is {string}")
    public void api_user_verify_that_message_information1_is(String string) {
        response.then().assertThat().body("message", equalTo("Reset password link sent on your email id."));
    }

    @Given("API user verify that message information2 is {string}")
    public void api_user_verify_that_message_information2_is(String string) {
        response.then().assertThat().body("message", equalTo("Customer not found."));
    }
}
