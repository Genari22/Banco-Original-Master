package Steps;

import Elementos.Elementos;
import Metodos.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {

	Metodos m = new Metodos();
	Elementos e = new Elementos();
	
	@Given("que o usuario acesse a url {string}")
	public void que_o_usuario_acesse_a_url(String url) throws InterruptedException {
	   m.abrirNavegador(url);
	   m.pausa(8000);
	}

	@Given("\\(E) selecionar o botao cookies")
	public void e_selecionar_o_botao_cookies() {
	   m.clicar(e.getBtnCookies());
	}
	@Given("\\(E)selecionar o botao abrir conta")
	public void e_selecionar_o_botao_abrir_conta() {
	   m.clicar(e.getBtnAbrirconta());
	}

	@Given("\\(E)selecionar o botao abrir conta pra voce")
	public void e_selecionar_o_botao_abrir_conta_pra_voce() throws InterruptedException {
		m.pausa(5000);
	   m.clicar(e.getBtnAbrirContaParaVoce());
	}

	@When("\\(quando)preencher o formulario de abertura de conta")
	public void quando_preencher_o_formulario_de_abertura_de_conta() {
	   m.preencher(e.getCampoNome(), "Jose");
	   m.preencher(e.getCampoTelefone(), "11112222222");
	   m.preencher(e.getCampoEmail(), "eu@teste.com");
	   m.preencher(e.getCampoCpf(), "30104479060");
	}

	@When("\\(E)selecionar o botao quero ser cliente")
	public void e_selecionar_o_botao_quero_ser_cliente() {
	   m.clicar(e.getBtnQueroSerCliente());
	}

	@Then("\\(Então)sera exibido o texto Falta pouco")
	public void então_sera_exibido_o_texto_falta_pouco() throws InterruptedException {
		m.pausa(5000);
		m.validarTexto(e.getTextoFaltaPouco(), "Falta pouco!");
		m.fecharNavegador();  
	}

	@Given("\\(E) preencher o campo nome {string}")
	public void e_preencher_o_campo_nome(String nome) {
	   
	}

	@Given("\\(E) preencher o campo email {string}")
	public void e_preencher_o_campo_email(String email) {
	    
	}

	@Given("\\(E) preencher o campo telefone {string}")
	public void e_preencher_o_campo_telefone(String telefone) {
	   
	}

	@Given("\\(E) preencher o campo cpf {string}")
	public void e_preencher_o_campo_cpf(String cpf) {
	   
	}

}
