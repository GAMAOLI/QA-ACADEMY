package cenario;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.CatalogoPage;
import page.HomePage;
import page.ProdutoPage;
import page.SacolaPage;
import page.SessaoPage;
import page.ShopPage;

public class TesteCenario {

	WebDriver driver = new ChromeDriver();
	HomePage HomePage = new HomePage(driver);
	CatalogoPage CatalogoPage = new CatalogoPage(driver);
	ProdutoPage ProdutoPage = new ProdutoPage(driver);
	ShopPage ShopPage = new ShopPage(driver);
	SacolaPage SacolaPage = new SacolaPage(driver);
	SessaoPage SessaoPage = new SessaoPage(driver);

	@Test
	public void Page() throws InterruptedException {

		HomePage.abriSite();

		CatalogoPage.Catalogo();

		ProdutoPage.seleciona();
		ProdutoPage.comprar();

		ShopPage.modelo();
		Thread.sleep(2000);
		ShopPage.cor();
		Thread.sleep(2000);
		ShopPage.armazenamento();
		Thread.sleep(2000);
		ShopPage.conectividade();
		Thread.sleep(2000);
		ShopPage.continuar();
		Thread.sleep(2000);
		ShopPage.verSacola();
		Thread.sleep(2000);

		SacolaPage.pagar();
		Thread.sleep(2000);
		SacolaPage.irCheckout();
		Thread.sleep(2000);

		SessaoPage.cep();
		Thread.sleep(2000);
		SessaoPage.continuarEnvio();
		Thread.sleep(2000);
		SessaoPage.nomeEendereco();
		Thread.sleep(2000);
		SessaoPage.informacoesContato();
		Thread.sleep(2000);
		SessaoPage.informacoesTributarias();
		Thread.sleep(2000);
		SessaoPage.continuarPagamento();
		Thread.sleep(5000);

	}

	@After
	public void fecharSite() {
		driver.quit();
	}
}
