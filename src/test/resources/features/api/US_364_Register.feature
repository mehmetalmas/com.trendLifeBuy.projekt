@US-364
Feature: As a user I must be able to register on the site
  @US-467
  Scenario:When a Request Body is sent to the /api/register endpoint with the necessary information,
  it should be verified that the status code returned is 201 Created and that the message information
  in the Response Body is "Successfully registered".

    * API user sets required path params "api, register"
    * API user adds a new user with first_name "registerApi" last_name "TestApi" email "api@api1000.com" password "123123123" password_confirmation "123123123" user_type "customer" referral_code "0101010101"
    * API user verify that status code is 201
    * API user verify that response message message is "Successfully registered"
    
    

