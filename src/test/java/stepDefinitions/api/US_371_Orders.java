package stepDefinitions.api;

import hooks.api.HooksAPI;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;

import static hooks.api.HooksAPI.spec;
import static io.restassured.RestAssured.given;

public class US_371_Orders {


    @Given("API user enters order id {int}, reason {int}")
    public void api_user_enters_that_order_id_reason(Integer orderId, Integer rsn) {
        JSONObject reqBody = new JSONObject();
        JSONObject innerBody = new JSONObject();

        reqBody.put("order_id", orderId);
        reqBody.put("reason", rsn);



        System.out.println(reqBody.toString(2));

        Response response = given()
                .headers("Authorization", "Bearer " + HooksAPI.token)
                .contentType(ContentType.JSON)
                .accept("application/json")
                .spec(spec)
                .when()
                .body(reqBody.toString())
                .post(HooksAPI.fullPath);
        HooksAPI.response = response;

        response.prettyPrint();

    }



}
