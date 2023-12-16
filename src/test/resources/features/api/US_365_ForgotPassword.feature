@US-365
Feature:US_365_ForgotPassword
    As a user, when I forget my password, I want the verification link to be sent to my registered E_mail.

  @US-468
  Scenario: When a Request Body is sent to the /api/forgot-password endpoint with valid information,
          it should be verified that the
          status code returned is 200 and
          the message information in the Response Body is "Reset password link sent on your email id."

    * API user sets required path params "api, forgot-password"
    * API user enters "test@test.com" email information and send post request
    * API user verify that status code is 200
    * API user verify that message information1 is "Reset password link sent on your email id."



  @US-469
  Scenario: When a Request Body is sent to the /api/forgot-password endpoint with invalid information,
          it should be verified that
          the status code returned is 404 Not Found and
          the message information in the Response Body is "Customer not found." it should be verified.

    * API user sets required path params "api, forgot-password"
    * API user enters "asdf@test.com" email information and send post request
    * API user verify that status code is 404
    * API user verify that message information2 is "Customer not found."