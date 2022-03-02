package fotoGIStests;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDemoWithPressKey {
	WebDriver driver;
	String baseUrl;
	
	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		baseUrl = "https://test.foto-gis.eu/login";	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseUrl);
	}	
		
		
	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.id("email")).sendKeys("halo@wp.pl");
		driver.findElement(By.id("email")).sendKeys(Keys.TAB);
		
		
		
		
		//driver.findElement(By.id("password")).sendKeys("12345678");
		//Using Press key option
		//driver.findElement(By.xpath("//button[contains(text(),'Logowanie')]")).sendKeys(Keys.ENTER);
		
		
	}

	@After
	public void tearDown() throws Exception {
		
}
}