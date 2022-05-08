package geico.qa.test.homeowners;

import org.testng.annotations.Test;

import base.BaseClass;

public class HomeOwnersTest extends BaseClass{

	@Test
	public void homeOwnerTest() {
		mainPage.clickHomeOwners(commonActions);
		zipCodePage.inputZipCode(commonActions,"14215");
		zipCodePage.clickQuoteBtn(commonActions);
		startPage.inputFirstName(commonActions, "John");
		startPage.inputMiddleName(commonActions, 'H');
		startPage.inputLastName(commonActions, "Doe");
	}
}
