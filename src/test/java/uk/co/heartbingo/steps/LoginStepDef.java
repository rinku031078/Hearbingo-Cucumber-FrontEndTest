package uk.co.heartbingo.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uk.co.heartbingo.pages.HomePage;
import uk.co.heartbingo.pages.LoginPage;

public class LoginStepDef {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on log in link$")
    public void iClickOnLogInLink() {
        new HomePage().clickOnLoginBtnHomePage();
        new HomePage().clickonIagreeButton();
    }

    @Then("^I should navigate to login page successfully$")
    public void iShouldNavigateToLoginPageSuccessfully() {
        new LoginPage().getForgottenPasswordTextOnLoginPage();
    }


    @And("^enter username \"([^\"]*)\"$")
    public void enterUsername(String username) throws Throwable {
        new LoginPage().switchToIframe();
        new LoginPage().EnterUserNameOREmail(username);

}
    @And("^enter password \"([^\"]*)\"$")
    public void enterPassword(String password) {
        new LoginPage().EnterPassword(password);

    }

    @And("^click on login button$")
    public void clickOnLoginButton() {

        new LoginPage().clickonLoginButton();
    }

    @Then("^I should see  error message \"([^\"]*)\"$")
    public void iShouldSeeErrorMessage(String arg0)  {
          new LoginPage().verifyErrorMessage();
        new LoginPage().getForgottenPasswordTextOnLoginPage();
    }

}
