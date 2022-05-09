package geico.qa.test.homeowners;

import org.testng.annotations.Test;

import base.BaseClass;

public class AutoTest extends BaseClass{

	@Test
	public void autoTest() {
		mainPage.clickHomeOwnersCheckBox(commonActions);
		mainPage.clickQuoteBtn(commonActions);
		startPage.inputFirstName(commonActions, "John");
		startPage.inputMiddleName(commonActions, 'H');
		startPage.inputLastName(commonActions, "Doe");
	}
}
