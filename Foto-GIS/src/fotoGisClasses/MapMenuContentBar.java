package fotoGisClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MapMenuContentBar {
	WebDriver driver; 
	
	@FindBy(id="menu_kpi")
	WebElement KPI;
	
	@FindBy(id="menu_layer")
	WebElement GISLayers;
	
	@FindBy(id="menu_region")
	WebElement ProjectNumber;
	
	@FindBy(id="menu_date")
	WebElement Period;
	
	@FindBy(id="menu_user")
	WebElement Users;
	
	@FindBy(id="menu_search")
	WebElement Search;
	
	@FindBy(id="menu_collections")
	WebElement Collections;
	
	@FindBy(id="menu_tags")
	WebElement Labels;
	
	@FindBy(id="menu_adminOnly")
	WebElement HiddenPhotos;
	
	@FindBy(id="menu_search_measurement")
	WebElement SearchByMeasurementID;

	
	public MapMenuContentBar(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void clickKPI() {
		KPI.click();		
	}
	
	public void clickGISLayer() {
		GISLayers.click();
	}
	
	public void clickProjectNumber() {
		ProjectNumber.click();
	}

	public void clickPeriod() {
		Period.click();
	}

	public void clickUsers() {
		Users.click();
	}
	
	public void clickSearch() {
		Search.click();
	}
	
	public void clickCollections() {
		Collections.click();
	}
	
	public void clickLabels() {
		Labels.click();
	}
	
	public void clickHiddenPhotos() {
		HiddenPhotos.click();
	}
	public void clickSearchByMeasurementID() {
		SearchByMeasurementID.click();
	}	
	
}
//Object repository and Page classesx1`x
//Klasa stworzona do klikania w zakladki content baru znajdujacego sie po lewej stronie ekranu po zalogowaniu 
