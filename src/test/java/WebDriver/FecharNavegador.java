package WebDriver;

import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FecharNavegador {
	
	WebDriver driver = new ChromeDriver();
	
	@After
	public void fecharDriver() {
		driver.quit();
	}

}
