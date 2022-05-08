package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import commons.CommonActions;

public class MainPage {

	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//p[contains(text(),'Auto')])[1]")
	WebElement autoElement;
	
	//WebElement autoElement = BaseClass.driver.findElement(By.xpath("(//p[contains(text(),'Auto')])[1]"));
	
	public void clickHomeOwners(CommonActions commonActions) {
		commonActions.click(autoElement);
	}
}
