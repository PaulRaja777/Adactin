package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.Baseclass.Base_Class;
import com.adactin.helper.FileReaderManager;
import com.adactin.helper.Page_Object_Manager;
import com.adactin.runner.Test_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {
	
	public static WebDriver driver = Test_Runner.driver;
	Page_Object_Manager pom = new Page_Object_Manager(driver);


@Given("^user Launch The Application$")
public void user_Launch_The_Application() throws Throwable {
	String url = FileReaderManager.getInstance().getInstanceCR().getUrl();
	   get_ToUrl(url);
	   thread_Sleep(3000);
}
	

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String username) throws Throwable {
		sendKeys(pom.getInstanceHome().getUsername(), username);
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String password) throws Throwable {
		sendKeys(pom.getInstanceHome().getPassword(),password );
	}
	

	@Then("^user Click On The Login Button And It Navigates To The Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page() throws Throwable {
	   click(pom.getInstanceHome().getLogin_Btn());
	   thread_Sleep(3000);
	}
	
	@When("^user Select The Location From Location DropDown$")
	public void user_Select_The_Location_From_Location_DropDown() throws Throwable {
	    dropDown("byindex", "2", pom.getInstanceSearchHotel().getLocation());
	}

	@When("^user Select The Hotels From Hotels DropDown$")
	public void user_Select_The_Hotels_From_Hotels_DropDown() throws Throwable {
	   dropDown("byindex", "2", pom.getInstanceSearchHotel().getHotel_List());
	}

	@When("^user Select The Room Type From Room Type DropDown$")
	public void user_Select_The_Room_Type_From_Room_Type_DropDown() throws Throwable {
	   dropDown("byindex", "3", pom.getInstanceSearchHotel().getRoom_Type());
	}

	@When("^user Select Number Of Rooms From Number of Rooms DropDown$")
	public void user_Select_Number_Of_Rooms_From_Number_of_Rooms_DropDown() throws Throwable {
	   dropDown("byindex", "2", pom.getInstanceSearchHotel().getNo_Of_Rooms());
	   thread_Sleep(3000);
	}

	@When("^user Enter Check In Date In Check In Date Field$")
	public void user_Enter_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
	    ctrlA_Delete(pom.getInstanceSearchHotel().getCheck_In());
		sendKeys(pom.getInstanceSearchHotel().getCheck_In(), "28/03/2021");
		thread_Sleep(3000);
	}

	@When("^user Enter Check Out Date In Check In Date Field$")
	public void user_Enter_Check_Out_Date_In_Check_In_Date_Field() throws Throwable {
	  ctrlA_Delete(pom.getInstanceSearchHotel().getCheck_Out());
	  sendKeys(pom.getInstanceSearchHotel().getCheck_Out(), "31/03/2021");
	}

	@When("^user Select Adult Per Room In Adult Per Room DropDown$")
	public void user_Select_Adult_Per_Room_In_Adult_Per_Room_DropDown() throws Throwable {
	  dropDown("byindex", "2", pom.getInstanceSearchHotel().getAdult_Per_Room());
	}

	@When("^user Select Children Per Room In Children Per Room DropDown$")
	public void user_Select_Children_Per_Room_In_Children_Per_Room_DropDown() throws Throwable {
		dropDown("byindex", "2", pom.getInstanceSearchHotel().getChild_Per_Room());
	}

	@Then("^user Click Search Button And It Navigates To Select Hotel Page$")
	public void user_Click_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
	    click(pom.getInstanceSearchHotel().getSearch_Btn());
	    thread_Sleep(3000);
	}

	@When("^user Select The Hotel From Select Hotel Table$")
	public void user_Select_The_Hotel_From_Select_Hotel_Table() throws Throwable {
	   click(pom.getInstanceSelectHotel().getHotel_RadioBtn());
	}

	@Then("^user Click Continue Button And It Navigates To Book A Hotel Page$")
	public void user_Click_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
	   click(pom.getInstanceSelectHotel().getContinue_Btn());
	   thread_Sleep(3000);
	}

	@When("^user Fill First Name In First Name Field$")
	public void user_Fill_First_Name_In_First_Name_Field() throws Throwable {
	    sendKeys(pom.getInstanceBookHotel().getFirst_Name(), "Jovan");
	}

	@When("^user Fill Last Name In Last Name Field$")
	public void user_Fill_Last_Name_In_Last_Name_Field() throws Throwable {
	  sendKeys(pom.getInstanceBookHotel().getLast_Name(), "Paul");
	}

	@When("^user Fill Billing Address In Billing Address Field$")
	public void user_Fill_Billing_Address_In_Billing_Address_Field() throws Throwable {
	   sendKeys(pom.getInstanceBookHotel().getAddress(), "21,Will Street,US");
	}

	@When("^user Fill Credit Card Number In Credit Card Number Field$")
	public void user_Fill_Credit_Card_Number_In_Credit_Card_Number_Field() throws Throwable {
	    sendKeys(pom.getInstanceBookHotel().getCard_Number(), "5845754585468925");
	}

	@When("^user Select Type Of Credit Card Type From Credit Card Type DropDown$")
	public void user_Select_Type_Of_Credit_Card_Type_From_Credit_Card_Type_DropDown() throws Throwable {
		dropDown("byindex", "3", pom.getInstanceBookHotel().getCard_Type());
	}

	@When("^user Select Expiry Month From Select Month Dropdown In Expiry Date Field$")
	public void user_Select_Expiry_Month_From_Select_Month_Dropdown_In_Expiry_Date_Field() throws Throwable {
	   dropDown("byindex", "8", pom.getInstanceBookHotel().getExp_Month());
	}

	@When("^user Select Expiry Year From Select Month Dropdown In Expiry Year Field$")
	public void user_Select_Expiry_Year_From_Select_Month_Dropdown_In_Expiry_Year_Field() throws Throwable {
	   dropDown("byvalue", "2021", pom.getInstanceBookHotel().getExp_Year());
	}

	@When("^user Enter CVV Number In CVV Field$")
	public void user_Enter_CVV_Number_In_CVV_Field() throws Throwable {
		String cvv = FileReaderManager.getInstance().getInstanceCR().getCVV();
	    sendKeys(pom.getInstanceBookHotel().getCvv_No(), cvv);
	}

	@Then("^user Click Book Button And It Navigates To Booking Cofirmation Page$")
	public void user_Click_Book_Button_And_It_Navigates_To_Booking_Cofirmation_Page() throws Throwable {
	   click(pom.getInstanceBookHotel().getBook_Btn());
	   thread_Sleep(3000);
	    
	}

	
	
	@Then("^user Click My Itinerary And It Navigates To Booked Itinerary Page$")
	public void user_Click_My_Itinerary_And_It_Navigates_To_Booked_Itinerary_Page() throws Throwable {
	   thread_Sleep(3000);
		click(pom.getInstanceItinerary().getIti_Btn());
		thread_Sleep(3000);
	    
	}
	

	@When("^user ScrollDown And takes Screenshot of the Booked Hotels$")
	public void user_ScrollDown_And_takes_Screenshot_of_the_Booked_Hotels() throws Throwable {
	   javaScript_Scroll(pom.getInstanceBooked().getSearchBtnToScroll());
	   thread_Sleep(3000);
	   screenShot("C:\\Users\\USER\\eclipse-workspace\\Adactin_Project\\ScreenShot\\snap.png");
	   thread_Sleep(2000);
	}
	@Then("^user Click Logout And It Navigates to Successfully Logged Out Page$")
	public void user_Click_Logout_And_It_Navigates_to_Successfully_Logged_Out_Page() throws Throwable {
	  thread_Sleep(3000);
		click(pom.getInstanceBooked().getLogout_Btn());
	    
	}


}
