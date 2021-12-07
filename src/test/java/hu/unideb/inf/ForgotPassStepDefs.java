package hu.unideb.inf;

import static org.junit.Assert.fail;

import java.util.Optional;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForgotPassStepDefs extends AbstractStepDefs {
	
	@And("the Forgot password link is clicked")
    public void theForgotPassIsClicked() {
        homePage.forgotPasswordLink.click();
    }
	 
	 
	 @When("the Retrieve Password button is clicked")
	    public void theRetrievePassIsClicked() {
	        homePage.retrievePasswordButton.click();
	    }
	 
	

}
