package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.Adactin_Project.Book_Hotel_Details;
import com.Adactin_Project.BookedItinerary;
import com.Adactin_Project.Booking_Itinerary;
import com.Adactin_Project.Home_Page_Adactin;
import com.Adactin_Project.Search_Hotel;
import com.Adactin_Project.Select_Hotel;

public class Page_Object_Manager {
	public WebDriver driver;
	private Home_Page_Adactin home;
	private Search_Hotel search;
	private Select_Hotel select;
	private Book_Hotel_Details book;
	private Booking_Itinerary itinerary;
	private BookedItinerary bookedList;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public Home_Page_Adactin getInstanceHome() {
		home = new Home_Page_Adactin(driver);
		return home;
	}
	public Search_Hotel getInstanceSearchHotel() {
		search = new Search_Hotel(driver);
		return search;
	}
	public Select_Hotel getInstanceSelectHotel() {
		select = new Select_Hotel(driver);
		return select;
	}
	public Book_Hotel_Details getInstanceBookHotel() {
		book = new Book_Hotel_Details(driver);
		return book;
	}
	public Booking_Itinerary getInstanceItinerary() {
		itinerary = new Booking_Itinerary(driver);
		return itinerary;
	}
	public BookedItinerary getInstanceBooked() {
		bookedList = new BookedItinerary(driver);
		return bookedList;
	}
}
