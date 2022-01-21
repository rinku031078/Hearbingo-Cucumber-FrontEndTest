package uk.co.heartbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.heartbingo.utility.Utility;


public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());


    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//button[@type='cookies-policy-button']")
    WebElement iagreeBTN;

    // @FindBy(xpath = "//a[@class='buttons__login_bar--login bvs-button is-primary is-round']")
    // @FindBy(xpath = "//a[normalize-space()='Log In']")
    //@FindBy(linkText = "Log In")
    @FindBy(xpath = "//*[@id=\"header\"]/div/a[1]")
    WebElement loginBTNonHome;



    public void clickOnLoginBtnHomePage() {
        clickOnElement(loginBTNonHome);
    }
    public void clickonIagreeButton() {
        clickOnElement(iagreeBTN);
    }




}