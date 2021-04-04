package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Itinerary {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@name='my_itinerary']")
	private WebElement iti_Btn;
	
	public Booking_Itinerary(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getIti_Btn() {
		return iti_Btn;
	}

	
	}
	
