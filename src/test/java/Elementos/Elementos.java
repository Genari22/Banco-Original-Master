package Elementos;

import org.openqa.selenium.By;

public class Elementos {

	private By btnAbrirconta = By.cssSelector("body > div.viewport-primary > nav.nav-desktop > div.right > div.nav-item.nav-item-nova-conta > a");	
	private By btnAbrirContaParaVoce = By.id("bt1");
	private By campoNome = By.id("nome");
	private By campoTelefone = By.id("telefone");
	private By campoEmail = By.id("email");
	private By campoCpf = By.id("cpf");
	private By btnQueroSerCliente = By.id("btnEnviar");
	private By textoFaltaPouco = By.xpath("//*[@id=\"pu-modalSucesso\"]/div/div[1]/p/span[1]");
	private By btnCookies = By.id("onetrust-accept-btn-handler");
	public By getBtnCookies() {
		return btnCookies;
	}
	public void setBtnCookies(By btnCookies) {
		this.btnCookies = btnCookies;
	}
	public By getTextoFaltaPouco() {
		return textoFaltaPouco;
	}
	public void setTextoFaltaPouco(By textoFaltaPouco) {
		this.textoFaltaPouco = textoFaltaPouco;
	}
	public By getBtnAbrirconta() {
		return btnAbrirconta;
	}
	public By getBtnAbrirContaParaVoce() {
		return btnAbrirContaParaVoce;
	}
	public By getCampoNome() {
		return campoNome;
	}
	public By getCampoTelefone() {
		return campoTelefone;
	}
	public By getCampoEmail() {
		return campoEmail;
	}
	public By getCampoCpf() {
		return campoCpf;
	}
	public By getBtnQueroSerCliente() {
		return btnQueroSerCliente;
	}
	
}
