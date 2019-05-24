package Steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import Steps.ClienteSteps;
import configure.Utils;

import org.junit.Assert;

import Page.ClientePage;
import Page.LoginPage;
import Page.MenusPage;

//onde serão chamadas as implementações dos Steps (o equivalente aos KeywordTests do TestComplete);
public class ClienteSteps {

	@Given("efetuei login no sistema")
	public void efetuarLogin() {
		LoginPage loginPage = new LoginPage();
		loginPage.efetuarLogin();
	}

	@And("acessei o menu Clientes >> Inserir")
	public void acessarMenuClientes() {
		MenusPage menusPage = new MenusPage();
		menusPage.acessarMenuClientesInserir();
	}

	@When("na tela Dados de Identificacao informo os dados de Pessoa Fisica")
	public void informarDadosPJ() {
		ClientePage cli = new ClientePage();
		cli.informarDadosPJ();
		Utils.logPrint("Dados de Identificação");
	}

	@And("na tela Dados de Identificacao clico em Avancar")
	public void clicarAvancar() {
		ClientePage cli = new ClientePage();
		cli.clicarAvancar();
	}

	@And("na tela Enderecos informo os enderecos")
	public void informarEndereco() {
		ClientePage cli = new ClientePage();
		cli.informarEndereco();
		Utils.logPrint("Endereços");
	}

	@And("na tela Enderecos clico em Salvar")
	public void clicarSalvar() {
		ClientePage cli = new ClientePage();
		cli.clicarSalvar();
		Utils.logPrint("Cliente Cadastrado");
	}

	@Then("na tela Enderecos sera exibida mensagem de sucesso")
	public void verificarMensagemSucesso() {
		ClientePage cli = new ClientePage();
		boolean blnExibiuMensagemSucesso = cli.verificarMensagemSucesso();

		if (blnExibiuMensagemSucesso) {
			Utils.logPass("Cliente cadastrado com sucesso");
		} else {
			Utils.logFail("Erro ao cadastrar o cliente");
		}
		
		Assert.assertTrue("Não exibiu a mensagem de Sucesso", blnExibiuMensagemSucesso);

	}



}
