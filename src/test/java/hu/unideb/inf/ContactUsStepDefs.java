package hu.unideb.inf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.Optional;

import static org.junit.Assert.fail;

public class ContactUsStepDefs extends AbstractStepDefs {

    @And("the Contact Us link is clicked")
    public void theContactUsLinkIsClicked() {
        homePage.contactUsLink.click();
    }

    @When("the Send button is clicked")
    public void theSendButtonIsClicked() {
        homePage.sendButton.click();
    }


    @Given("the email address is filled with {string}")
    public void theEmailAddressIsFilledWith(String arg0) {
        homePage.fillField("email", arg0);
    }

    @And("the order reference is filled with {string}")
    public void theOrderReferenceIsFilledWith(String arg0) {
        homePage.fillField("id_order", arg0);
    }

    @And("the message is filled with {string}")
    public void theMessageIsFilledWith(String arg0) {
        homePage.fillField("message", arg0);
    }
    
    @And("WebMaster option is selected")
    public void selectOptionFromDropDown() {
    	
        Select drop = new Select(driver.findElement(By.id("id_contact")));

        drop.selectByVisibleText("Webmaster");
    }
    
}
