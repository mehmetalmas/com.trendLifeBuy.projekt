package stepDefinitions.ui;

import pages.admin.PageWalletRechargeHistory;

public class US_044_PageWalletRechargeHistory {

    PageWalletRechargeHistory pageWalletRechargeHistory = new PageWalletRechargeHistory();

/*

//@US-397

    @When("Admin clicks Wallet Recharge History menu")
    public void admin_clicks_wallet_recharge_history_menu() {
        ReusableMethods.clickElementByJS(pageWalletRechargeHistory.buttonWalletRechargeHistory);
    }

    @Then("Admin should see that the Wallet Upload History List actions are done")
    public void admin_should_see_that_the_Wallet_Upload_History_List_actions_are_done() {

        pageWalletRechargeHistory.walletRechargeHistoryTitel.isEnabled();
        pageWalletRechargeHistory.user5.isEnabled();

    }



//@US-398

        @Then("Admin should see titles correct in Wallet Recharge History List")
        public void admin_should_see_titles_correct_in_wallet_recharge_history_list() {

            List<String> expectedWalletRechargeList = Arrays.asList("Sl", "User", "EMAIL", "TYPE", "AMOUNT", "PAYMENT DETAILS", "TRX ID", "DATE");
            List<String> actualWalletRechargeLsit =ReusableMethods.getElementsText(pageWalletRechargeHistory.walletRechargeHistoryList);
            Assert.assertTrue(actualWalletRechargeLsit.containsAll(expectedWalletRechargeList));

        }



//@US-399
    @Then("Admin should be able to switch between pages in the Wallet Upload History List")
    public void admin_should_be_able_to_switch_between_pages_in_the_wallet_upload_history_list() {

        ReusableMethods.clickElementByJS(pageWalletRechargeHistory.paginateButton2);

        String expectedNummer = "11";
        String actualNummer = pageWalletRechargeHistory.nummer11.getText();
        Assert.assertTrue(actualNummer.contains(expectedNummer));

    }

 */
































}
