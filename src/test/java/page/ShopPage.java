package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ShopPage {

	WebDriver driver;

	public ShopPage(WebDriver driver) {
		this.driver = driver;
	}

	public void modelo() {

		this.driver.findElement(By.xpath("//div[contains(text(),'Tela de 12,9 polegadas')]")).click();
	}

	public void cor() {

		this.driver.findElement(By.xpath("//span[@class='form-label-small'][contains(text(),'Cinza-espacial')]"))
				.click();

	}

	public void armazenamento() {

		this.driver.findElement(By.xpath("//span[@class='form-selector-title']//small[contains(text(),'TB')]")).click();

	}

	public void conectividade() {

		this.driver.findElement(By.xpath("//span[@class='form-selector-title'][contains(text(),'Wi-Fi + Cellular')]"))
				.click();

	}

	public void continuar() {
		this.driver.findElement(By.xpath("//button[@name='add-to-cart']")).click();

	}

	public void verSacola() {
		this.driver.findElement(By.xpath("//button[@name='proceed']")).click();

	}

}
