package stepDefinitions.api;

import hooks.api.HooksAPI;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class US_366_GetCustomerData {

    private Response response = HooksAPI.response;

    private RequestSpecification spec = HooksAPI.spec;

    @Given("API user Sends Requests and Gets Response")
    public void api_user_sends_requests_and_gets_response() {
        response = given()
                .headers("Authorization", "Bearer " + HooksAPI.token)
                .contentType(ContentType.JSON)
                .accept("application/json")
                .spec(spec)
                .when()
                .get(HooksAPI.fullPath);
        HooksAPI.response = response;
        //HooksAPI.response.prettyPrint();
    }
    @Given("API User verify that wallet_running_balance is {double}")
    public void api_user_verify_that_wallet_running_balance_is(Double double1) {
        response.then().assertThat().body("wallet_running_balance", equalTo(1949.99F));
    }
    @Given("API user verify that wallet_pending_balance is {int}")
    public void api_user_verify_that_wallet_pending_balance_is(Integer int1) {
        response.then().assertThat().body("wallet_pending_balance", equalTo(int1));
    }
    @Given("API User verify that total_coupon is {int}")
    public void api_user_verify_that_total_coupon_is(Integer int1) {
        response.then().assertThat().body("total_coupon", equalTo(int1));
    }
    @Given("API user verify that total_wishlist is {int}")
    public void api_user_verify_that_total_wishlist_is(Integer int1) {
        response.then().assertThat().body("total_wishlist", equalTo(int1));
    }
    @Given("API user verify that total_cancel_order is {int}")
    public void api_user_verify_that_total_cancel_order_is(Integer int1) {
        response.then().assertThat().body("total_cancel_order", equalTo(int1));
    }
    @Given("API user verify that message is {string}")
    public void api_user_verify_that_message_is(String string) {
        response.then().assertThat().body("message", equalTo(string));
    }


}
