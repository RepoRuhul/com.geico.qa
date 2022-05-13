package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.CommonActions;

public class AboutYouPage {

	public AboutYouPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	//@FindBy(id = "Id_GiveDateOfBirth_31962-label")
//	@FindBy(xpath = "//input[@id='Id_GiveDateOfBirth_31962']")
//	@FindBy(xpath = "//input[@name='Id_GiveDateOfBirth_31962']")
	@FindBy(xpath = "//input[starts-with(@id,'Id_GiveDateOfBirth')]")
	WebElement dobInputElement;
	@FindBy(id = "Id_GiveDateOfBirth_62515Button")
	WebElement nextBtnElement;
	
	public void inputDOB(CommonActions commonActions, String value) {
		commonActions.inputText(dobInputElement, value);
}
	public void clickNextBtn(CommonActions commonActions) {
	commonActions.click(nextBtnElement);
	
}
   }