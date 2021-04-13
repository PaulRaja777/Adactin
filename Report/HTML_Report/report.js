$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 10,
      "id": "hotel-booking-in-adactin-application;;;1"
    },
    {
      "cells": [
        "abc",
        "123"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;;;2"
    },
    {
      "cells": [
        "xyz",
        "345"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;;;3"
    },
    {
      "cells": [
        "spraja777",
        "mypassword"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"abc\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 9239024100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 276808900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 141836800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 3530489000,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"xyz\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"345\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 3558007000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 245960600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "345",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 99230200,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 3350707500,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"spraja777\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"mypassword\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click On The Login Button And It Navigates To The Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 3281519600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "spraja777",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 154418900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mypassword",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 128401100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_The_Search_Hotel_Page()"
});
formatter.result({
  "duration": 4035063400,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "user Select The Location From Location DropDown",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "user Select The Hotels From Hotels DropDown",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user Select The Room Type From Room Type DropDown",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select Number Of Rooms From Number of Rooms DropDown",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Enter Check In Date In Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Enter Check Out Date In Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select Adult Per Room In Adult Per Room DropDown",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select Children Per Room In Children Per Room DropDown",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Click Search Button And It Navigates To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Location_From_Location_DropDown()"
});
formatter.result({
  "duration": 300384700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotels_From_Hotels_DropDown()"
});
formatter.result({
  "duration": 230766500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Room_Type_From_Room_Type_DropDown()"
});
formatter.result({
  "duration": 284231900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Number_Of_Rooms_From_Number_of_Rooms_DropDown()"
});
formatter.result({
  "duration": 3221774000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Check_In_Date_In_Check_In_Date_Field()"
});
formatter.result({
  "duration": 3355465500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_Check_Out_Date_In_Check_In_Date_Field()"
});
formatter.result({
  "duration": 350753900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Adult_Per_Room_In_Adult_Per_Room_DropDown()"
});
formatter.result({
  "duration": 225572100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Children_Per_Room_In_Children_Per_Room_DropDown()"
});
formatter.result({
  "duration": 277245700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_Search_Button_And_It_Navigates_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 3942309200,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 27,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 29,
  "name": "user Select The Hotel From Select Hotel Table",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user Click Continue Button And It Navigates To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel_From_Select_Hotel_Table()"
});
formatter.result({
  "duration": 152441500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 3587753400,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 32,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 34,
  "name": "user Fill First Name In First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "user Fill Last Name In Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Fill Billing Address In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Fill Credit Card Number In Credit Card Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Select Type Of Credit Card Type From Credit Card Type DropDown",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Select Expiry Month From Select Month Dropdown In Expiry Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Select Expiry Year From Select Month Dropdown In Expiry Year Field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Enter CVV Number In CVV Field",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "user Click Book Button And It Navigates To Booking Cofirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Fill_First_Name_In_First_Name_Field()"
});
formatter.result({
  "duration": 174619000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Fill_Last_Name_In_Last_Name_Field()"
});
formatter.result({
  "duration": 126096500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Fill_Billing_Address_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 134652100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Fill_Credit_Card_Number_In_Credit_Card_Number_Field()"
});
formatter.result({
  "duration": 131025800,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Type_Of_Credit_Card_Type_From_Credit_Card_Type_DropDown()"
});
formatter.result({
  "duration": 229546500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Expiry_Month_From_Select_Month_Dropdown_In_Expiry_Date_Field()"
});
formatter.result({
  "duration": 320404600,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_Expiry_Year_From_Select_Month_Dropdown_In_Expiry_Year_Field()"
});
formatter.result({
  "duration": 219832100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_CVV_Number_In_CVV_Field()"
});
formatter.result({
  "duration": 129984400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_Book_Button_And_It_Navigates_To_Booking_Cofirmation_Page()"
});
formatter.result({
  "duration": 3094968900,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 44,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 46,
  "name": "user Click My Itinerary And It Navigates To Booked Itinerary Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_My_Itinerary_And_It_Navigates_To_Booked_Itinerary_Page()"
});
formatter.result({
  "duration": 7582450000,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@RegressionTest"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "user ScrollDown And takes Screenshot of the Booked Hotels",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "user Click Logout And It Navigates to Successfully Logged Out Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_ScrollDown_And_takes_Screenshot_of_the_Booked_Hotels()"
});
formatter.result({
  "duration": 5839614900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_Logout_And_It_Navigates_to_Successfully_Logged_Out_Page()"
});
formatter.result({
  "duration": 3741098700,
  "status": "passed"
});
});