package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CatalogoPage {
	
	WebDriver driver;

	public CatalogoPage(WebDriver driver) {
		this.driver = driver;
	}

	public void Catalogo() {

		this.driver.findElement(By.xpath("//body/nav[@id='ac-globalnav']/div/ul/li[3]/a[1]")).click(); // CatalogoiPadPage

	}

}
