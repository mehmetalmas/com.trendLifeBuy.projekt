@US-363
Feature: US_363_Password Change
  @calistirmaBunu
  Scenario: When a Request Body is sent to the /api/change-password endpoint with the correct information,
  it should be verified that the status code returned is 200 and that the message information in the
  Response Body is "password change successfully".


    * API user sets required path params "api, change-password"
    * API user updates that update the old_password to "123123123a" , password "123123123" password_confirmation "123123123"
    * API user verify that response message message is "password change successfully"
    * API user verify that status code is 200


  @US-466
  Scenario: When a Request Body is sent to the /api/change-password endpoint with incorrect information,
    the status code returned is 409 Conflict and the message information in the Response Body is
    "Invalid Credintials." must be verified
    * API user sets required path params "api, change-password"
    * API user updates that update the old_password to "123123123a" , password "123123123" password_confirmation "123123123"
    * API user verify that response message message is "Invalid Credintials."
    * API user verify that status code is 409









