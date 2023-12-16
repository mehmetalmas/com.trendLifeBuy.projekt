@US-371 @US-344
Feature: US_371_Orders
  As a user, I should be able to access the list of my orders and cancel my requested order.

  @US-482
  Scenario: When a GET Request is sent to the /api/order-list endpoint,
  it should be checked that the status code returned is 200 and that the information in the Response Body is correct.

    * API user sets required path params "api, order-list"
    * API user sends requests and gets response
    * API user verify that status code is 200
    * API user verify that response message is "order not found" v2

  @US-483
  Scenario: When the POST Request Body is sent to the /api/order-manage/cancel-store endpoint with valid information,
  it should be verified that the status code returned is 202 (Accepted) and the message information in the Response Body is "Order Cancelled Successfully".
    * API user sets required path params "api, order-manage, cancel-store"
    * API user enters order id 3232, reason 3
    * API user verify that status code is 302
    * API user verify that response message is "Order Cancelled Failed" v2
