package hu.unideb.inf;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.fail;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

public class CommonStepDefs extends AbstractStepDefs {

    @Given("the home page is opened")
    public void theHomePageIsOpened() {
        homePage.openPage();
    }
    
    
    @Then("a {string} error message is shown in {string}")
    public void anErrorMessageIsShown(String arg0,String arg1) {
	 
	 Optional<String> errorMessage = null;
	 
	 switch (arg1) {
	 case "forgotPass" : errorMessage = homePage.getForgotPassError(); break;
	 case "contactUs" : errorMessage = homePage.getContactError(); break; 
	 case "signIn" : errorMessage = homePage.getLoginError(); break; 
	 default : fail(); break;
	 }
        
        if (errorMessage.isPresent()) {
            Assert.assertEquals(arg0, errorMessage.get());
        } else {
            fail();
        }
    }
    
    @Then("a {string} success message is shown in {string}")
    public void aSuccessMessageIsShown(String arg0,String arg1) {
	 
	 Optional<String> successMessage = null;
	 
	 switch (arg1) {
	 case "forgotPass" : successMessage = homePage.getForgotPassSucess(); break;
	 case "contactUs" : successMessage = homePage.getContactSuccess(); break; 
	 default : fail(); break;
	 }
        
        if (successMessage.isPresent()) {
            Assert.assertEquals(arg0, successMessage.get());
        } else {
            fail();
        }
    }
    
    @And("the Sign In link is clicked")
    public void theSignInLinkIsClicked() {
         homePage.signInLink.click();
     }
    
    @And("the Women link is clicked")
    public void theWomenLinkIsClicked() {
         homePage.womenLink.click();
     }
    
  //*[@id="block_top_menu"]/ul/li[1]/a
    
    @Given("the {string} is filled with {string}")
    public void theFieldIsFilledWithParameter(String field, String parameter) {
        homePage.fillField(field, parameter);
    }

}
