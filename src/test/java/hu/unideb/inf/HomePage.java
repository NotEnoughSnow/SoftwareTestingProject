package hu.unideb.inf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.List;
import java.util.Optional;

public class HomePage {

    private static final String PAGE_URL = "http://automationpractice.com/";

    private static final By LOGIN_ERROR = By.xpath("//*[@id=\"center_column\"]/div[1]/ol/li");
    private static final By CONTACT_ERROR = By.cssSelector("#center_column > div > ol > li");
    private static final By FORGOT_PASS_ERROR = By.xpath("//*[@id=\"center_column\"]/div/div/ol/li");
    private static final By FORGOT_PASS_SUCCESS = By.xpath("//*[@id=\"center_column\"]/div/p");
    private static final By CONTACT_US_SUCCESS = By.xpath("//*[@id=\"center_column\"]/p");

  //*[@id="layer_cart"]/div[1]/div[1]/h2

    @FindBy(className = "login")
	public WebElement signInLink;

    @FindBy(id = "SubmitLogin")
	public WebElement signInButton;
    
    @FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
   	public WebElement womenLink;
    
    @FindBy(xpath = "//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a")
   	public WebElement itemLink;
    
    @FindBy(xpath = "//*[@id=\"add_to_cart\"]/button")
   	public WebElement addToCart;
    
    @FindBy(xpath = "//*[@id=\"searchbox\"]/button")
   	public WebElement search;
    
    @FindBy(xpath = "//*[@id=\"SubmitCreate\"]")
   	public WebElement createAccButton;
    
    @FindBy(xpath = "//*[@id=\"newsletter_block_left\"]/div/form/div/button")
   	public WebElement newsletterButton;

    @FindBy(id = "contact-link")
    public WebElement contactUsLink;

    @FindBy(id = "submitMessage")
    public WebElement sendButton;

    @FindBy(id = "id_contact")
    public Select dropDown;
    
    
    @FindBy(xpath = "//*[@id=\"login_form\"]/div/p[1]/a")
    public WebElement forgotPasswordLink;
    
    @FindBy(xpath = "//*[@id=\"form_forgotpassword\"]/fieldset/p/button\n")
    public WebElement retrievePasswordButton;
    

    
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        

    }

    public void openPage() {
        driver.get(PAGE_URL);
        PageFactory.initElements(driver, this);
    }
 
     
    public Optional<String> getLoginError() {
        return getErrorMessage(LOGIN_ERROR);
    }

    public Optional<String> getContactError() {
        return getErrorMessage(CONTACT_ERROR);
    }
    public Optional<String> getForgotPassError() {
        return getErrorMessage(FORGOT_PASS_ERROR);
    }
    public Optional<String> getForgotPassSucess() {
        return getErrorMessage(FORGOT_PASS_SUCCESS);
    }
    
    public Optional<String> getContactSuccess() {
        return getErrorMessage(CONTACT_US_SUCCESS);
    }

    public void fillField(String field, String value) {
        getField(By.id(field)).sendKeys(value);
    }

    public WebElement getField(By locator) {
        return driver.findElement(locator);
    } 
   

    private Optional<String> getErrorMessage(By errorLocator) {
        Optional<WebElement> error = getError(errorLocator);
        if (error.isPresent()) {
            WebElement errorElement = error.get();
            return Optional.of(errorElement.getText());
        } else {
            return Optional.empty();
        }
    }

    private Optional<WebElement> getError(By errorLocator) {
        List<WebElement> elements = driver.findElements(errorLocator);
        if (elements.size() > 0) {
            return Optional.of(elements.get(0));
        } else {
            return Optional.empty();
        }
    }
}
