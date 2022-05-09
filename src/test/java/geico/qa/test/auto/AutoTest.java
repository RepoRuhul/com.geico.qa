package geico.qa.test.auto;

import org.testng.annotations.Test;

import base.BaseClass;

public class AutoTest extends BaseClass{

	@Test
	public void autoTest() {
		mainPage.clickHomeOwnersCheckBox(commonActions);
		startPage.inputFirstName(commonActions, "John");
		startPage.inputMiddleName(commonActions, 'H');
		startPage.inputLastName(commonActions, "Doe");
	}
}
