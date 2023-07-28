package testcsripts;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;

public class TC_01Test extends BaseClass {
	@Test
public void LoginWithValidCredentials() {
	loginpage.getLoginLink().click();
	jsutility.enteringDatUsingJavScript(driver, loginpage.getEmailTf(), "mamatha123@gmail.com");
	loginpage.getEmailTf().sendKeys("mamatha@gmail.com");
	loginpage.getPasswordTf().sendKeys("***************");
	loginpage.getLoginLink().click();
}
}
