// LoginPage.java
package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    
    private WebDriver driver;
    
    private By userName = By.id("user-name");
    private By userPassword = By.id("password");
    private By logIn = By.id("login-button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void enterUserName(String username1) {
        driver.findElement(userName).sendKeys(username1);
    }
    
    public void enterPassword(String password) {
        driver.findElement(userPassword).sendKeys(password);
    }
    
    public void logIn() {
        driver.findElement(logIn).click();
    }
    
}
