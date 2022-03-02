package fotoGisClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginClass {
	public static  WebElement element = null;
	
	
//Login to the FotoGIS web app
	public static WebElement email(WebDriver driver) {
		element = driver.findElement(By.id("email"));
		return element;
		
	}
//password to the FotoGIS web app	
	public static WebElement password(WebDriver driver) {
		element = driver.findElement(By.id("password"));
		return element;
		
	}
//Clicking login button	
	public static WebElement loginButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//button[contains(text(),'Logowanie')]"));
		return element;
		
	}

}
