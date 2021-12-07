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

public class SearchStepDefs extends AbstractStepDefs {


    @When("the search button is pressed")
    public void search() {
        homePage.search.click();
    }
    
    @Given("{string} is typed")
    public void typeInSearch(String arg0) {
    	WebElement el = driver.findElement(By.xpath("//*[@id=\"search_query_top\"]"));
    	
    	el.sendKeys(arg0);
    }
    
    @Then("{string} displays")
    public void nothingError(String arg0) {
    	
    	WebElement el = driver.findElement(By.xpath("//*[@id=\"center_column\"]/p"));
        
        assertEquals(el.getText(), arg0);
    }
    
    @Then("{string} success message displays")
    public void displayResults(String arg0) {
    	
    	WebElement el = driver.findElement(By.xpath("//*[@id=\"center_column\"]/h1/span[2]"));
        
        assertEquals(el.getText(), arg0);
    }
    
  
  

}
