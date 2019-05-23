package Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Map.ClienteElementMap;
import configure.TestRule;

public class ClientePage extends ClienteElementMap {

	public void informarDadosPJ() {
		fisica.click();
		cpf.sendKeys("837.623.723-30");
		razaosocial.sendKeys("Automação Rafael Teste");
		email.sendKeys("rcalandreli@gmail.com");
		datanasc.sendKeys("21011992");

		Select cmbSexo = new Select(sexo);
		cmbSexo.selectByVisibleText("Masculino");

		Select cmbCivil = new Select(estadocivil);
		cmbCivil.selectByVisibleText("Solteiro");

	}

	public void clicarAvancar() {
		// TODO Auto-generated method stub
		avancar.click();
	}

	public void informarEndereco() {
		endp_cep.sendKeys("58075010");
		endp_endereco.sendKeys("Rua Larga");
		endp_numero.sendKeys("5481 A");
		endp_complemento.sendKeys("5481 A");
		endp_cidade.sendKeys("5481 A");

		Select cmbEstado = new Select(endp_estado);
		cmbEstado.selectByVisibleText("SP");

		endp_telefone.sendKeys("8332231821");
		endp_celular.sendKeys("83989832111");

		endc_cep.sendKeys("5800000");
		endc_endereco.sendKeys("Teste 12321");
		endc_numero.sendKeys("5810");
		endc_complemento.sendKeys("Rua Larga");
		endc_cidade.sendKeys("São Paulo");
	
		Select cmcEstado = new Select(endc_estado);
		cmcEstado.selectByVisibleText("SP");
		
		endc_telefone.sendKeys("8332231821");
		endc_celular.sendKeys("83989832111");
		
		
		
		
		
	}

	public void verificarMensagemSucesso() {
	

	}

	
	public void clicarSalvar() {
		salvar.click();
	}
	
	public ClientePage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
}
