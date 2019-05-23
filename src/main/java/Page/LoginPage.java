package Page;

import org.openqa.selenium.support.PageFactory;

import Map.LoginElementMap;
import configure.TestRule;

public class LoginPage extends LoginElementMap {

	public void efetuarLogin() {
		login.sendKeys("john");
		senha.sendKeys("john");
		btnLogin.click();
	}

	public LoginPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
}
