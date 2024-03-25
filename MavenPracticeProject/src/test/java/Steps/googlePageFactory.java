package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googlePageFactory {
	
	WebDriver driver; 
	
	public googlePageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(id= "APjFqb")
	private WebElement googleSearchBox;
	public void enterSearchText(String search) {
		googleSearchBox.sendKeys(search);
	}
	
	@FindBy(xpath= "//input[@class=\"gNO89b\"]")
	private WebElement googleSearchButton;
	public void clickSearch() {
		googleSearchButton.click();
	}
	
	
}
