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
	
	@FindBy(xpath = "(//input[@class='zip-code-input'])[1]\"))")
	WebElement zipCode;
	@FindBy(xpath = "(//*[@name='ZipCode'])[1]")
	WebElement zipCodeInputElement;
	//WebElement homeOwnersElement = BaseClass.driver.findElement(By.xpath("(//p[contains(text(),'Auto')])[1]"));
	public void inputZipCode(CommonActions commonActions, String value) {
		commonActions.inputText(zipCodeInputElement, value);
	}
	public void clickHomeOwnersCheckBox(CommonActions commonActions) {
		commonActions.click(zipCode);
	}
}
