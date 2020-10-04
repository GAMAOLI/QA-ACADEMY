package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class SacolaPage {

	WebDriver driver;

	public SacolaPage(WebDriver driver) {
		this.driver = driver;
	}

	public void pagar() {
		this.driver.findElement(By.xpath("//button[@id='shoppingCart.actions.checkout']")).click();

	}

	public void irCheckout() {
		this.driver.findElement(By.xpath("//button[@id='guest-checkout']")).click();

	}

}
