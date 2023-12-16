@US-349 @US-342
Feature:US_044_PageWalletRechargeHistory


  @US-397

  Scenario: As an administrator I would like to have a page where I can see reports of wallet activity.

    Given Admin lands on admin login url and logins with "admin.mehmet" email and "password" password
    When Admin clicks Admin Reports dropdown menu
    And Admin clicks Wallet Recharge History menu
    Then Admin should see that the Wallet Upload History List actions are done

  @US-398

  Scenario: As an administrator I would like to have a page where I can see reports of wallet activity.

    Given Admin lands on admin login url and logins with "admin.mehmet" email and "password" password
    When Admin clicks Admin Reports dropdown menu
    And Admin clicks Wallet Recharge History menu
    Then Admin should see titles correct in Wallet Recharge History List

  @US-399
  Scenario: As an administrator I would like to have a page where I can see reports of wallet activity.

    Given Admin lands on admin login url and logins with "admin.mehmet" email and "password" password
    When Admin clicks Admin Reports dropdown menu
    And Admin clicks Wallet Recharge History menu
    Then Admin should be able to switch between pages in the Wallet Upload History List


