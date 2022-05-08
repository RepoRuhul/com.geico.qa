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
	
	@FindBy(xpath = "(//div[@class='zip-code-form'])[1]")
	WebElement homeOwenersCheckbox;
	
	//WebElement homeOwnersElement = BaseClass.driver.findElement(By.xpath("(//p[contains(text(),'Auto')])[1]"));
	
	public void clickHomeOwnersCheckBox(CommonActions commonActions) {
		commonActions.click(homeOwenersCheckbox);
	}
}
