@US-369 @US-343
Feature:API As a user, I should be able to access my product list in the cart, add a new product to my cart or delete
  a product from my cart.


Scenario: API When a GET Request is sent to the /api/checkout endpoint, it should be checked that the status code
returned is 200 and that the information in the Response Body is correct.

* API user sets required path params "api, checkout"
* API user sends requests and gets response
* API user verify that status code is 200
* API user mehmet verify response with matcher class