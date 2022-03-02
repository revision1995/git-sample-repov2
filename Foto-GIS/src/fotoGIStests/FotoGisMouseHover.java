package fotoGIStests;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebElement;

public class FotoGisMouseHover {

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
		driver.findElement(By.id("password")).sendKeys("12345678");
		driver.findElement(By.xpath("//button[contains(text(),'Logowanie')]")).click();
		Thread.sleep(2000);
		
		WebElement adminBar = driver.findElement(By.xpath("//a[@translate='menu.admin']"));
		Actions action = new Actions(driver);
		action.moveToElement(adminBar).perform();
		
		driver.findElement(By.xpath("//a[@href='/tags']")).click();
		
		
		
		
	}
	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
		
}
}