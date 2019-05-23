package Page;

import org.openqa.selenium.support.PageFactory;

import Map.*;
import configure.TestRule;

public class MenusPage extends MenusElementMap {

	public void acessarMenuClientesInserir() {
		menusClientes.click();
		submenuClientesInserir.click();
	}
	
	public MenusPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	
}
