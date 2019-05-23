package Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElementMap {

	@FindBy(id="login")
	protected WebElement login;
	
	@FindBy(id="senha")
	protected WebElement senha;
	
	@FindBy(id="btnLogin")
	protected WebElement btnLogin;
}
