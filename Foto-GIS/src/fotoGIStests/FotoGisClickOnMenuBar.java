//przeklikuje menu z lewej strony po zalogowaniu 
package fotoGIStests;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import fotoGisClasses.loginClass;
import fotoGisClasses.MapMenuContentBar;

public class FotoGisClickOnMenuBar {

	WebDriver driver;
	String baseUrl;
	//Object repository class
	MapMenuContentBar clickOnBar;
	JavascriptExecutor js;
	
	
	
	
	@Before
	public void setUp() throws Exception {
		
		driver = new ChromeDriver();
		baseUrl = "https://test.foto-gis.eu/login";	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.get(baseUrl);

		js = (JavascriptExecutor) driver;
		//new instance for the click function
		clickOnBar = new MapMenuContentBar(driver);
		
		
		loginClass.email(driver).sendKeys("halo@wp.pl");
		loginClass.password(driver).sendKeys("12345678");
		loginClass.loginButton(driver).click();	
		Thread.sleep(2000);
	}	
		
		
	@Test
	public void test() throws InterruptedException {
		clickOnBar.clickKPI();
		Thread.sleep(2000);
		clickOnBar.clickGISLayer();
		Thread.sleep(2000);
		
		//inicjalizacja przesuwania slidera za pomoca metody actions 
		WebElement slider = driver.findElement(By.xpath("//body/div[@id='section_main']/div[@id='main_content']/div[1]/div[1]/div[2]/div[1]/div[11]/div[1]/div[1]/div[12]/div[1]"));
		Actions action = new Actions(driver);
		action.clickAndHold(slider).moveByOffset(0, 500).release().build().perform();
		
		clickOnBar.clickProjectNumber();
		Thread.sleep(2000);
		clickOnBar.clickPeriod();
		Thread.sleep(2000);
		clickOnBar.clickUsers();
		Thread.sleep(2000);
		
		action.clickAndHold(slider).moveByOffset(0, 100).release().build().perform();
		
		clickOnBar.clickSearch();
		Thread.sleep(2000);
		clickOnBar.clickCollections();
		Thread.sleep(2000);
		
		action.clickAndHold(slider).moveByOffset(0, 100).release().build().perform();
		
		clickOnBar.clickLabels();
		Thread.sleep(2000);
		
		action.clickAndHold(slider).moveByOffset(0, 100).release().build().perform();
		
		clickOnBar.clickHiddenPhotos();
		Thread.sleep(2000);
		
		action.clickAndHold(slider).moveByOffset(0, 100).release().build().perform();
		
		clickOnBar.clickSearchByMeasurementID();
		Thread.sleep(2000);
		
		action.clickAndHold(slider).moveByOffset(0, 100).release().build().perform();
		}

	@After
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
		
}
}