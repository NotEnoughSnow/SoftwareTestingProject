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

public class NewsLetterStepDefs extends AbstractStepDefs {


    @Given("{string} is typed in email box")
    public void newsLetterInput(String arg0) {
    	WebElement el = driver.findElement(By.xpath("//*[@id=\"newsletter-input\"]"));
    	el.sendKeys(arg0);
    }
    
    @When("the newsletter button is clicked")
    public void newsletterClick() {
        homePage.newsletterButton.click();
    }
    
    @Then("a {string} newsletter message displays")
    public void newsLetterMesage(String arg0) {

    	WebElement el = driver.findElement(By.xpath("//*[@id=\"columns\"]/p"));

    	assertEquals(el.getText(), arg0);
    }


}
