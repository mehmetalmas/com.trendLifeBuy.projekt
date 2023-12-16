package pages.admin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class PageWalletRechargeHistory {
    public PageWalletRechargeHistory() {PageFactory.initElements(Driver.getDriver(), this);}


//@US-397
    @FindBy (xpath = "//*[@id='sidebar_menu']/li[16]/ul/li[6]/a")
    public WebElement buttonWalletRechargeHistory;

    @FindBy (xpath = "//th[@aria-label]")
    public List<WebElement> walletRechargeHistoryList;

    @FindBy (xpath = "//*[@id='main-content']/section/div/div/div[1]/div/div/h3")
    public WebElement walletRechargeHistoryTitel;

    @FindBy (xpath = "//*[@id='walletTable']/tbody/tr[5]/td[2]")
    public WebElement user5;

    @FindBy (xpath = " //a[@data-dt-idx='2']")
    public WebElement paginateButton2;

    @FindBy (xpath = "//*[@id=\"walletTable\"]/tbody/tr[1]/td[1]")
    public WebElement nummer11;

























}
