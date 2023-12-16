@US-348 @US-342

Feature: US_043_PageReportWishlist


  @US-394

  Scenario: As an administrator, I would like to have a page where I can see the wishlist reports in order to have information about the products on the wishlist.

    Given Admin lands on admin login url and logins with "admin.mehmet" email and "password" password
    When Admin clicks Admin Reports dropdown menu
    And Admin clicks WishList menu item
    Then Admin sees that the Wishlist reports are accessible.

  @US-395
  Scenario: As an administrator, I would like to have a page where I can see the wishlist reports in order to have information about the products on the wishlist.
    Given Admin lands on admin login url and logins with "admin.mehmet" email and "password" password
    When Admin clicks Admin Reports dropdown menu
    And Admin clicks WishList menu item
    Then Admin should be able to select the Wish List Type from the Search Text Box


  @US-396
  Scenario: As an administrator, I would like to have a page where I can see the wishlist reports in order to have information about the products on the wishlist.
    Given Admin lands on admin login url and logins with "admin.mehmet" email and "password" password
    When Admin clicks Admin Reports dropdown menu
    And Admin clicks WishList menu item
    Then Admin should see a list of reports according to the selected type