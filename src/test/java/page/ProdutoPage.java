package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProdutoPage {

	WebDriver driver;

	public ProdutoPage(WebDriver driver) {
		this.driver = driver;
	}

	public void seleciona() {
		this.driver
				.findElement(By
						.xpath("//li[@class='chapternav-item chapternav-item-ipad-pro']//a[@class='chapternav-link']"))
				.click(); // selecionarIpad

	}

	public void comprar() throws InterruptedException {
		this.driver.findElement(By.xpath("//a[@class='ac-ln-button']")).click();
		Thread.sleep(2000);
	}
}
