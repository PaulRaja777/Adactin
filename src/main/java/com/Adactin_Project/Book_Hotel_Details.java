package com.Adactin_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel_Details {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement first_Name;
	
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement last_Name;
	
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address;
	
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement card_Number;
	
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement card_Type;
	
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement exp_Month;
	
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement exp_Year;
	
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cvv_No;
	
	@FindBy(xpath = "//input[@name='book_now']")
	private WebElement book_Btn;
	
	public Book_Hotel_Details(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirst_Name() {
		return first_Name;
	}

	public WebElement getLast_Name() {
		return last_Name;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCard_Number() {
		return card_Number;
	}

	public WebElement getCard_Type() {
		return card_Type;
	}

	public WebElement getExp_Month() {
		return exp_Month;
	}

	public WebElement getExp_Year() {
		return exp_Year;
	}

	public WebElement getCvv_No() {
		return cvv_No;
	}

	public WebElement getBook_Btn() {
		return book_Btn;
	}
	
}
