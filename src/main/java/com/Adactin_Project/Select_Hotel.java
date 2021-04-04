package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement hotel_RadioBtn;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continue_Btn;
	
	public Select_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getHotel_RadioBtn() {
		return hotel_RadioBtn;
	}

	public WebElement getContinue_Btn() {
		return continue_Btn;
	}
}
