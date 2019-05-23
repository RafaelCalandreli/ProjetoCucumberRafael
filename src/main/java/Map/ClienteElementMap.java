package Map;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


//onde ficam as informações dos objetos de tela (o equivalente ao NameMapping do TestComplete);
public class ClienteElementMap {
	
	
	//Dados Cliente

	@FindBy(id="cpf_cnpj")
	protected WebElement cpf;

	@FindBy(id="fisica")
	protected WebElement fisica;
	
	@FindBy(id="juridica")
	protected WebElement juridica;
	
	@FindBy(id="nome_razaosocial")
	protected WebElement razaosocial;

	@FindBy(id="email")
	protected WebElement email;
	
	@FindBy(id="data_nascimento")
	protected WebElement datanasc;
	
	@FindBy(id="sexo")
	protected WebElement sexo;
	
	@FindBy(id="estado_civil")
	protected WebElement estadocivil;
	
	@FindBy(id="avancar")
	protected WebElement avancar;

	
	//Endereço Principal
	
	protected WebElement endp_cep;
	protected WebElement endp_endereco;
	protected WebElement endp_numero;
	protected WebElement endp_complemento;
	protected WebElement endp_cidade;
	protected WebElement endp_estado;
	protected WebElement endp_telefone;
	protected WebElement endp_celular;
	
	//Endereço de Cobrança
	protected WebElement endc_cep;
	protected WebElement endc_endereco;
	protected WebElement endc_numero;
	protected WebElement endc_complemento;
	protected WebElement endc_cidade;
	protected WebElement endc_estado;
	protected WebElement endc_telefone;
	protected WebElement endc_celular;
	
	//Botão Salvar
	protected WebElement salvar;
	

	
}
