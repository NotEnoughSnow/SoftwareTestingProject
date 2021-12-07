package hu.unideb.inf;

import io.cucumber.java.After;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class SignUpStepDef extends AbstractStepDefs {


    @When("the create account button is clicked")
    public void theSignInButtonIsClicked() {
        homePage.createAccButton.click();
    }
    
    
    @Then("a {string} create account error message displays")
    public void createAccountError(String arg0) {

    	WebElement el = driver.findElement(By.xpath("//*[@id=\"create_account_error\"]/ol/li"));

    	assertEquals(el.getText(), arg0);
    }


}
