package uk.co.heartbingo.pages;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.heartbingo.utility.Utility;

public class LoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());


    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(xpath = "//a[@class='buttons__login_bar--login bvs-button is-primary is-round']")
  // @FindBy(id = "username")
    WebElement usernameOrEmailBox;


    @FindBy(id = "password")
    WebElement passwordBox;

    @FindBy(xpath = "//button[@name='login_submit']")
    WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"__next\"]/form/div[3]/span")
    WebElement errorMessage;

    @FindBy(xpath = "//*[@id=\"__next\"]/form/p[2]/a")
    WebElement forogttenPasswordText;

    @FindBy(id = "batBeacon82393571913")
    WebElement iframe;


    public void EnterUserNameOREmail(String userName) {
        sendTextToElement(usernameOrEmailBox, userName);

    }

    public void EnterPassword(String password) {
    sendTextToElement(passwordBox, password);
    }
    public void clickonLoginButton(){

        clickOnElement(loginButton);
}
    public String verifyErrorMessage(){
        log.info("Verifying Error Message" + errorMessage.toString());
        return getTextFromElement(errorMessage);
    }
    public String getForgottenPasswordTextOnLoginPage(){
        log.info("Verifying Login Page Text" + forogttenPasswordText.toString());
        return getTextFromElement(forogttenPasswordText);
    }
    public void switchToIframe() {
        driver.switchTo().frame(iframe);
        log.info("Switching to iframe" + iframe.toString());
    }

}
