package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PageReportWishlist {

    public PageReportWishlist() {
        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy (xpath = "//span[text()='Admin Reports']")
    public WebElement adminReports;

    @FindBy (xpath = "//*[text()='Wishlist']")
    public WebElement wishlist;

    @FindBy (xpath = "//*[@id=\"main-content\"]/section/div/div/div[2]/div/form/div[1]/div/div/div")
    public WebElement maincontent;

    @FindBy (xpath = "//li[@data-value='product']")
    public WebElement produckt;

    @FindBy (xpath = "//button[@id='save_button_parent']")
    public WebElement buttonSearch;

    @FindBy (xpath = "//th[@scope=\"col\"]")
    public List<WebElement> producktWishlist;

    @FindBy (xpath = "//th[@scope=\"col\"]")
    public List<WebElement> userWishlist;





    //@US-43 @US-395

    @FindBy (xpath = "//*[@id=\"main-content\"]/section/div[2]/div/div[1]/div/div/h3")
    public WebElement wishlistProudct;

    @FindBy (xpath = "//*[@id=\"main-content\"]/section/div/div/div[2]/div/form/div[1]/div/div/div/ul/li[3]")
    public WebElement user;

    @FindBy (xpath = "//*[@id=\"main-content\"]/section/div[2]/div/div[1]/div/div/h3")
    public WebElement wishlistUser;








}
