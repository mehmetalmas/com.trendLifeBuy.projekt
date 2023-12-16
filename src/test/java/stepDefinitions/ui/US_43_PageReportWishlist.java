package stepDefinitions.ui;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import pages.admin.PageReportWishlist;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Arrays;
import java.util.List;

public class US_43_PageReportWishlist {


    PageReportWishlist pageReportWishlist = new PageReportWishlist();


    //@US-43 @US-394
    @When("Admin clicks Admin Reports dropdown menu")
    public void admin_clicks_admin_reports_dropdown_menu() {
        ReusableMethods.clickElementByJS(pageReportWishlist.adminReports);
    }

    @When("Admin clicks WishList menu item")
    public void admin_clicks_wish_list_menu_item() {
        ReusableMethods.clickElementByJS(pageReportWishlist.wishlist);
    }

    @Then("Admin sees that the Wishlist reports are accessible.")
    public void admin_sees_that_the_wishlist_reports_are_accessible() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(pageReportWishlist.maincontent).perform();
        ReusableMethods.clickElementByJS(pageReportWishlist.maincontent);
        actions.moveToElement(pageReportWishlist.produckt).perform();
        ReusableMethods.clickElementByJS(pageReportWishlist.produckt);
        ReusableMethods.clickElementByJS(pageReportWishlist.buttonSearch);
        Assert.assertTrue("Tost Button is not displayed", pageReportWishlist.wishlistProudct.isDisplayed());

        actions.moveToElement(pageReportWishlist.maincontent).perform();
        ReusableMethods.clickElementByJS(pageReportWishlist.maincontent);
        actions.moveToElement(pageReportWishlist.user).perform();
        ReusableMethods.clickElementByJS(pageReportWishlist.user);
        ReusableMethods.clickElementByJS(pageReportWishlist.buttonSearch);
        Assert.assertTrue("Tost Button is not displayed", pageReportWishlist.wishlistUser.isDisplayed());
        Driver.getDriver().close();

    }


/*
    //@US-43 @US-395
    @Then("Admin should be able to select the Wish List Type from the Search Text Box")
    public void admin_should_be_able_to_select_the_wish_list_type_from_the_search_text_box() {

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(pageReportWishlist.maincontent).perform();
        ReusableMethods.clickElementByJS(pageReportWishlist.maincontent);
        actions.moveToElement(pageReportWishlist.produckt).perform();
        Assert.assertTrue("Tost Button is not Selected", pageReportWishlist.produckt.isSelected());
        Assert.assertTrue("Tost Button is not Selected", pageReportWishlist.user.isSelected());
        Driver.getDriver().close();

    }

 */

    //@US-43 @US-396
    @Then("Admin should see a list of reports according to the selected type")
    public void admin_should_see_a_list_of_reports_according_to_the_selected_type() {

        Actions actions = new Actions(Driver.getDriver());

        actions.moveToElement(pageReportWishlist.maincontent).perform();
        ReusableMethods.clickElementByJS(pageReportWishlist.maincontent);
        actions.moveToElement(pageReportWishlist.produckt).perform();
        ReusableMethods.clickElementByJS(pageReportWishlist.produckt);
        ReusableMethods.clickElementByJS(pageReportWishlist.buttonSearch);

        List<String> expectedProducktList = Arrays.asList("SL", "PRODUCT", "NUMBER OF USER");
        List<String> actualProducktList = ReusableMethods.getElementsText(pageReportWishlist.producktWishlist);
        Assert.assertTrue(actualProducktList.containsAll(expectedProducktList));

        /*
        actions.moveToElement(pageReportWishlist.maincontent).perform();
        ReusableMethods.clickElementByJS(pageReportWishlist.maincontent);
        actions.moveToElement(pageReportWishlist.user).perform();
        ReusableMethods.clickElementByJS(pageReportWishlist.user);
        ReusableMethods.clickElementByJS(pageReportWishlist.buttonSearch);

        List<String> expectedUserList = Arrays.asList("SL", "USER", "NUMBER OF WISHLIST PRODUCT ");
        List<String> actualUserList = ReusableMethods.getElementsText(pageReportWishlist.userWishlist);
        Assert.assertTrue(actualUserList.containsAll(expectedUserList));
         */

        Driver.getDriver().close();

    }









}
