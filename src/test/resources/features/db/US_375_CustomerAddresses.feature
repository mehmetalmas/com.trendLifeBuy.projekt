@US-375 @US-344
  Feature: As an administrator, I should be able to update the address information of the desired Customer in the
    customer_addresses table via the DataBase and verify that the updated address is in the customer_addresses table

@US-497
  Scenario: The address information of the desired Customer in the customer_addresses table should be updated.
   Then DB user updates address of the given user by customer id 18 in customer address table

@US-498
  Scenario: The address information of the desired Customer in the customer_addresses table should be updated2.
    Then DB user updates address table should be taken to a list and it should be verified whether the desired
address is in this list.


