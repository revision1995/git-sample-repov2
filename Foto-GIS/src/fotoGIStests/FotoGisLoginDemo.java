package fotoGIStests;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import fotoGisClasses.loginClass;
import fotoGisClasses.MapMenuContentBar;

public class FotoGisLoginDemo {

	WebDriver driver;
	String baseUrl;

	
	
	
	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		baseUrl = "https://test.foto-gis.eu/login";	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseUrl);
		loginClass.email(driver).sendKeys("halo@wp.pl");
		loginClass.password(driver).sendKeys("12345678");
		loginClass.loginButton(driver).click();	
		Thread.sleep(2000);
	}	
		
		
	@Test
	public void test() throws InterruptedException {
		
		
		
		
		
	}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
		
}
}