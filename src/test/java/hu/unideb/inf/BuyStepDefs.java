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
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class BuyStepDefs extends AbstractStepDefs {


    @Given("the blouse item is selected")
    public void theItemLinkIsSelected() {
        homePage.itemLink.click();
    }
    
    @And("characters are in Quantity box")
    public void charInput() {
    	WebElement el = driver.findElement(By.xpath("//*[@id=\"quantity_wanted\"]"));
    	
    	el.clear();
    	el.sendKeys("aa");

    	
        homePage.addToCart.click();
    }

    @When("the add to cart button is pressed")
    public void theAddToCartButtonIsPressed() {
        homePage.addToCart.click();
    }
    
    @Then("a buy success message is displayed")
    public void successMessage() {
    	
    	WebElement el = driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/h2/span[2]"));
    	
        assertNotNull(el);
    }
    
    @Then("a null message is displayed")
    public void nullMessage() {
    	
    	WebElement el = driver.findElement(By.xpath("//*[@id=\"product\"]/div[2]/div/div/div/div/p"));
    	 
        assertNotNull(el);
    }
    
    
  

}
