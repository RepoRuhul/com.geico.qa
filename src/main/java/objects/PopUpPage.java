package objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import commons.CommonActions;

public class PopUpPage {

	public PopUpPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@class='btn btn--primary btn--full-mobile']")
	WebElement continueBtnElement;

	public void clickContinueBtn(CommonActions commonActions) {
		commonActions.click(continueBtnElement);
	}

}
