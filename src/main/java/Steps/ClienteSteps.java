package Steps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import Steps.ClienteSteps;
import Page.ClientePage;
import Page.LoginPage;
import Page.MenusPage;

//onde serão chamadas as implementações dos Steps (o equivalente aos KeywordTests do TestComplete);
public class ClienteSteps {
	ClientePage cli = new ClientePage();

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

		cli.informarDadosPJ();
	}

	@And("na tela Dados de Identificacao clico em Avancar")
	public void clicarAvancar() {

		cli.clicarAvancar();
	}

	@And("na tela Enderecos informo os enderecos")
	public void informarEndereco() {
		cli.informarEndereco();
	}

	@And("na tela Enderecos clico em Salvar")
	public void clicarSalvar() {
		cli.clicarSalvar();
	}

	@Then("na tela Enderecos sera exibida mensagem de sucesso")
	public void verificarMensagemSucesso() {
		cli.verificarMensagemSucesso();
	}

	@And("efetuarei logout do sistema")
	public void efetuarLogouf() {

	}

}
