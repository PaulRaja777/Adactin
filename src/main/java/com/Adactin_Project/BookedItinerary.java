package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItinerary {
public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='logout']")
	private WebElement logout_Btn;
	@FindBy(xpath = "//input[@id='search_hotel']")
	private WebElement SearchBtnToScroll;
	
	public BookedItinerary(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLogout_Btn() {
		return logout_Btn;
	}

	public WebElement getSearchBtnToScroll() {
		return SearchBtnToScroll;
	}
	

}
