package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SessaoPage {

	WebDriver driver;

	public SessaoPage(WebDriver driver) {
		this.driver = driver;
	}

	public void cep() {
		this.driver.findElement(By.xpath("//input[contains(@name,'postalCode')]")).sendKeys("06280021");

		this.driver.findElement(By.xpath("//button[contains(@class,'form-textbox-button apply-button')]//span[1]"))
				.click();

	}

	public void continuarEnvio() {
		this.driver.findElement(By.xpath("//span[contains(text(),'Continuar para o endereço de envio')]")).click();

	}

	public void nomeEendereco() {

		this.driver.findElement(By.xpath("//input[contains(@name,'firstName')]")).sendKeys("Fulano");

		this.driver.findElement(By.xpath("//input[contains(@name,'lastName')]")).sendKeys("Ciclano");

		this.driver.findElement(By.xpath("//input[@name='street']")).sendKeys("Rua da Felicidade");

		this.driver.findElement(By.xpath("//input[contains(@name,'street2')]")).sendKeys("1234");

		this.driver.findElement(By.xpath("//input[contains(@name,'postalCode')]")).sendKeys("06280021");

		this.driver.findElement(By.xpath("//input[@name='district']")).sendKeys("Vila Dirce");

		this.driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Carapicuiba");

		this.driver.findElement(By.xpath(
				"//body/div[@id='page']/div[@id='checkout-container']/div/div/div/div/div/div/div/div/div/fieldset/div/div[1]/div[1]/div[1]/div[1]/label[1]"))
				.click();

		this.driver.findElement(By.xpath("//body//option[26]")).click();
	}

	public void informacoesContato() {
		this.driver.findElement(By.xpath(
				"//fieldset[contains(@class,'rs-shipping-addresscontact')]//div//input[contains(@name,'emailAddress')]"))
				.sendKeys("fulano@hotmail.com");

		this.driver.findElement(By.xpath("//input[contains(@name,'mobilePhoneAreaCode')]")).sendKeys("11");

		this.driver.findElement(By.xpath(
				"//fieldset[contains(@class,'rs-shipping-addresscontact')]//div[contains(@class,'as-address-layout row as-address-edit')]//div[2]//div[1]//div[1]//div[1]//input[1]"))
				.sendKeys("947503219");

	}

	public void informacoesTributarias() {
		this.driver.findElement(By.xpath("//input[@placeholder='xxx.xxx.xxx-xx']")).sendKeys("101.028.070-86");

	}

	public void continuarPagamento() {
		this.driver.findElement(By.xpath("//span[contains(text(),'Continuar para o pagamento')]")).click();

	}
}
