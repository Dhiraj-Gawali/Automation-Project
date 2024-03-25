package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFactory {
	
	WebDriver driver;
	
	public LoginPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(id = "user-name")
	private WebElement usernameTextbox; 
	public void enterUserName(String username1) {
        usernameTextbox.sendKeys(username1);
    }
	
	@FindBy(id = "password")
	private WebElement passwordTextbox;
	public void enterPassword(String password1) {
		passwordTextbox.sendKeys(password1);
	}
	
	@FindBy(id= "login-button")
	private WebElement loginButton;
	public void clickLogin() {
		loginButton.click();
	}
	
}
