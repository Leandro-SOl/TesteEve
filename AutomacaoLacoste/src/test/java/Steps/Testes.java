package Steps;

import org.openqa.selenium.By;

import PagesInteractions.Metodos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Testes {

	Metodos metodo = new Metodos();

	@Given("que eu esteja no {string}")
	public void que_eu_esteja_no_para_realizar_login(String appUrl) throws InterruptedException {
		metodo.abrirNavegador(appUrl);
		Thread.sleep(2000);

	}

	@When("consultar alguma peca de roupa")
	public void consultar_alguma_peca_de_roupa() throws InterruptedException {
		// elemento de aceitar termos
		metodo.clicar(By.id("didomi-notice-agree-button"));
		Thread.sleep(2000);
		// elemento barra de pesquisa
		metodo.escrever("Boné masculino em algodão com tira contrastante", By.name("q"));
		Thread.sleep(2000);
		metodo.submit(By.name("q"));
		Thread.sleep(2000);
	}

	@When("adicionar no carrinho")
	public void adicionar_no_carrinho() throws InterruptedException {
		// clicando na peca encontrada
		metodo.clicar(By.cssSelector(
				"body > main > section > div > div.js-plp-tiles-wrapper.cell-25 > div.js-plp-tiles.js-tracking-contents-wrapper.l-display-grid.l-column-gap--small.grid-template-4.grid-template-m-2.padding-1 > div:nth-child(1) > div > div.l-relative.l-overflow-hidden.l-vmargin--small > a > div.js-product-tile-hover-img.product-tile-image-hover.l-overlay"));

		Thread.sleep(2000);

		// adicionando ao carrinho
		metodo.clicar(By.cssSelector(
				"body > main > section > article > div.js-pdp-desc.offset-2.cell-9.cell-wide-7.offset-mt-1.cell-mt-23.offset-m-0.cell-m-25.l-vspaced-row-1.l-vspaced-row-m-0.l-no-padding-bottom > div.js-pdp-actions.js-sticky-banner-start.cell-9.cell-wide-7.cell-mt-23.offset-m-1 > div.js-pdp-sticky-atc.l-vmargin--large.no-mob.no-tab > div > div > button"));
		Thread.sleep(2000);

		// clicando em meu carrinho
		metodo.clicar(By.cssSelector("#top-minicart > div > a"));
	}

	@Then("consulta realizada com sucesso")
	public void consulta_realizada_com_sucesso() {

	}

}
