package hu.unideb.inf;

import static org.junit.Assert.fail;

import java.util.Optional;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgotPassStepDefs extends AbstractStepDefs {
	
	@And("the Sign in link is clicked")
    public void theSignInLinkIsClicked1() {
        homePage.clickSignInLink();
    }
	
	@And("the Forgot password link is clicked")
    public void theForgotPassIsClicked() {
        homePage.clickForgetPassLink();
    }
	
	 @Given("the email1 address is filled with {string}")
	    public void theForgotPassEmailAddressIsFilledWith(String arg0) {
	        homePage.fillField("email", arg0);
	    }
	 
	 @When("the Retrieve Password button is clicked")
	    public void theRetrievePassIsClicked() {
	        homePage.clickRetrievePass();
	    }
	 
	 @Then("a {string} error message is shown1")
	    public void aForgotPassErrorMessageIsShown(String arg0) {
	        Optional<String> errorMessage = homePage.getForgotPassError();
	        if (errorMessage.isPresent()) {
	            Assert.assertEquals(arg0, errorMessage.get());
	        } else {
	            fail();
	        }
	    }

}
