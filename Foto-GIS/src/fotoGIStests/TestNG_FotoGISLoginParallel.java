
//test otwiera i loguje sie do fotogisa jednoczesnie na firefoxie i chrome, na koniec wylacza przegladarke 
package fotoGIStests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import fotoGisClasses.loginClass;

public class TestNG_FotoGISLoginParallel {
	
	WebDriver driver;
	String baseURL;
	
	@BeforeClass
	//parametr browser jest ustawiony w pliku xml
	@Parameters({"browser"})
	public void setUp(String browser) {
		baseURL = "https://test.foto-gis.eu/login";
		if (browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseURL);
	}
	
	@Test
	public void testLogin() throws InterruptedException {
		loginClass.email(driver).sendKeys("halo@wp.pl");
		loginClass.password(driver).sendKeys("12345678");
		loginClass.loginButton(driver).click();	
		Thread.sleep(5000);
		
	}
	
	@AfterClass
	public void cleanUp() throws InterruptedException {
		driver.quit();
		
	}
}