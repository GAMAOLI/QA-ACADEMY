package WebDriver;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbrirNavegador {

	WebDriver driver = new ChromeDriver();

	@Before
	public void abriSite() {
		driver.get("https://www.apple.com/br/");
		driver.manage().window().maximize();
	}
}
