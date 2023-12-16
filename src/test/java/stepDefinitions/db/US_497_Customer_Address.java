package stepDefinitions.db;

public class US_497_Customer_Address {

    /*
    String querySelect;
    String queryUpdate;
    String querySelectAdressList;
    String getQuerySelectAdress;

//@US-497
    @Then("DB user updates address of the given user by customer id {int} in customer address table")
    public void db_user_updates_address_of_the_given_user_by_customer_id_in_customer_address_table(Integer int1) {
        querySelect = "SELECT address, city, state, country, postal_code " +
                "FROM u480337000_tlb_training.customer_addresses WHERE customer_id=18";
        List<Object> bevor = DBUtils.getRowList(querySelect);
        queryUpdate ="UPDATE u480337000_tlb_training.customer_addresses " +
                "SET address = 'istanbul', city= '7292', state='349', country ='19', postal_code = '1221'  " +
                "WHERE customer_id=18;";
        List<Object> after = DBUtils.getRowList(queryUpdate);
        Assert.assertFalse(after.equals(bevor));

    }


//@US-498
    @Then("DB user updates address table should be taken to a list and it should be verified whether the " +
            "desired address is in this list.")
    public void db_user_updates_address_table_should_be_taken_to_a_list_and_it_should_be_verified_whether_the_desired_address_is_in_this_list() {


        querySelectAdressList ="SELECT DISTINCT address FROM u480337000_tlb_training.customer_addresses";
        List<Object> adressList = DBUtils.getRowList(querySelectAdressList);
        getQuerySelectAdress ="SELECT address FROM u480337000_tlb_training.customer_addresses WHERE customer_id=18";
        List<Object> adres = DBUtils.getRowList(getQuerySelectAdress);
        Assert.assertTrue(adressList.contains(adres));

     /*
        querySelectAdressList ="SELECT DISTINCT address FROM u480337000_tlb_training.customer_addresses";
        List<String> adressList2 =DBUtils.getColumnNames(querySelectAdressList);
        getQuerySelectAdress ="SELECT address FROM u480337000_tlb_training.customer_addresses WHERE customer_id=18";
        List<String> adres2 = DBUtils.getColumnNames(getQuerySelectAdress);
        assertTrue(adressList2.contains(adres2));

     */


}