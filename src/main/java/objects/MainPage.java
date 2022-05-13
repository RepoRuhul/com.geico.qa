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

	@FindBy(xpath = "(//input[@class='zip-code-input'])[1]")
	WebElement zipCodeElement;

	@FindBy(xpath = "//input[@class='btn btn--secondary']")
	WebElement goBtnElement;

	@FindBy(xpath = "(//div[@class='product-checkbox'])[1]")
	WebElement autoCheckBoxElement;

	@FindBy(xpath = "//a[@class='modal-trigger btn btn--primary btn--full-mobile']")
	WebElement startMyCuoteBtnElement;

	public void inputZipCode(CommonActions commonActions, String value) {
		commonActions.inputText(zipCodeElement, value);
	}

	public void clickGoBtn(CommonActions commonActions) {
		commonActions.click(goBtnElement);
	}

	public void clickAutoCheckBox(CommonActions commonActions) {
		commonActions.click(autoCheckBoxElement);
	}

	public void clickStartMyQuoteBtn(CommonActions commonActions) {
		commonActions.click(startMyCuoteBtnElement);
	}
}
