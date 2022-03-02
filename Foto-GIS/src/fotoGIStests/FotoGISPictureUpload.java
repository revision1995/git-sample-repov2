//test wrzuca zdjecie z dysku do fotogisa (TYLKO SAME ZDJÊCIE BEZ WYGRANIA LOKALIZACJI I WRZUCENIA GO DO SYSTEMU)


package fotoGIStests;

import org.testng.annotations.Test;

import fotoGisClasses.loginClass;

import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class FotoGISPictureUpload {
	WebDriver driver;
	String baseUrl;

	
	
	
	@BeforeClass
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
	public void fileUpload() throws InterruptedException, AWTException {
		driver.findElement(By.xpath("//a[@id='menu_upload_photo']")).click();
		
		WebElement fileInput = driver.findElement(By.xpath("//label[@id='labelForFile']"));
		fileInput.click();
		
		//w tym miejscu po otwarciu okienka systemu wybieramy sciezke pliku 
		StringSelection ss = new StringSelection("C:\\Users\\rados\\OneDrive\\Pulpit\\zdjêcia\\xxx.jpg");
		//skopiowalismy sciezke pliku
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss ,null);
		
		
		// Control + V
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
		
		
	}

	@AfterClass
	public void tearDown() throws Exception {
		Thread.sleep(2000);
		driver.quit();
		
}
}
