@US-366
Feature:US_366_GetCustomerData
      As a user, I want to be able to access my financial information on the site.

  @US-470
  Scenario:  When a GET Request is sent to the /api/profile/get-customer-data endpoint,
            it should be checked that
            the status code returned is 200 and that
            the user information in the Response Body is correct.

    * API user sets required path params "api, profile, get-customer-data"
    * API user Sends Requests and Gets Response
    * API user verify that status code is 200
    * API User verify that wallet_running_balance is 1949.9899999999998
    * API user verify that wallet_pending_balance is 0
    * API User verify that total_coupon is 0
    * API user verify that total_wishlist is 12
    * API user verify that total_cancel_order is 2
    * API user verify that message is "success"
