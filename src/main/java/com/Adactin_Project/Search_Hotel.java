package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {
	public WebDriver driver;
	
	@FindBy(xpath = "//select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath = "//select[@id='hotels']")
	private WebElement hotel_List;
	
	@FindBy(xpath = "//select[@id='room_type']")
	private WebElement room_Type;
	
	@FindBy(xpath = "//select[@id='room_nos']")
	private WebElement no_Of_Rooms;
	
	@FindBy(xpath = "//input[@id='datepick_in']")
	private WebElement check_In;
	
	@FindBy(xpath = "//input[@id='datepick_out']")
	private WebElement check_Out;
	
	@FindBy(xpath = "//select[@id='adult_room']")
	private WebElement adult_Per_Room;
	
	@FindBy(xpath = "//select[@id='child_room']")
	private WebElement child_Per_Room;
	
	@FindBy(xpath = "//input[@id='Submit']")
	private WebElement search_Btn;
	
	public Search_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel_List() {
		return hotel_List;
	}

	public WebElement getRoom_Type() {
		return room_Type;
	}

	public WebElement getNo_Of_Rooms() {
		return no_Of_Rooms;
	}

	public WebElement getCheck_In() {
		return check_In;
	}

	public WebElement getCheck_Out() {
		return check_Out;
	}

	public WebElement getAdult_Per_Room() {
		return adult_Per_Room;
	}

	public WebElement getChild_Per_Room() {
		return child_Per_Room;
	}

	public WebElement getSearch_Btn() {
		return search_Btn;
	}
	
	
	
}
