package geico.qa.test.auto;

import org.testng.annotations.Test;
import base.BaseClass;

public class AutoTest extends BaseClass {

	@Test
	public void autoTest() {

		mainPage.inputZipCode(commonActions, "14215");
		mainPage.clickGoBtn(commonActions);
		mainPage.clickAutoCheckBox(commonActions);
		mainPage.clickStartMyQuoteBtn(commonActions);
		popUpPage.clickContinueBtn(commonActions);
//		aboutYouPage.inputDOB(commonActions, "10/10/1990");
		aboutYouPage.inputDOB(commonActions, "10101990");
		aboutYouPage.clickNextBtn(commonActions);
		System.out.println("Lazy Debug");
	}
}
