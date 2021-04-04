Feature: Hotel Booking In Adactin Application

@SmokeTest
Scenario Outline: 
Given user Launch The Application 
When user Enter The "<Username>" In Username Field 
And user Enter The "<Password>" In Password Field 
Then user Click On The Login Button And It Navigates To The Search Hotel Page 
Examples:
|Username|Password|
|abc|123|
|xyz|345|
|spraja777|mypassword|

@SanityTest
Scenario: 
When user Select The Location From Location DropDown
And user Select The Hotels From Hotels DropDown
And user Select The Room Type From Room Type DropDown 
And user Select Number Of Rooms From Number of Rooms DropDown
And user Enter Check In Date In Check In Date Field 
And user Enter Check Out Date In Check In Date Field 
And user Select Adult Per Room In Adult Per Room DropDown 
And user Select Children Per Room In Children Per Room DropDown
Then user Click Search Button And It Navigates To Select Hotel Page

@RegressionTest 
Scenario: 
When user Select The Hotel From Select Hotel Table 
Then user Click Continue Button And It Navigates To Book A Hotel Page

@RegressionTest
Scenario: 
When user Fill First Name In First Name Field
And user Fill Last Name In Last Name Field 
And user Fill Billing Address In Billing Address Field 
And user Fill Credit Card Number In Credit Card Number Field 
And user Select Type Of Credit Card Type From Credit Card Type DropDown 
And user Select Expiry Month From Select Month Dropdown In Expiry Date Field
And user Select Expiry Year From Select Month Dropdown In Expiry Year Field
And user Enter CVV Number In CVV Field 
Then user Click Book Button And It Navigates To Booking Cofirmation Page

@RegressionTest
Scenario: 
Then user Click My Itinerary And It Navigates To Booked Itinerary Page

@RegressionTest
Scenario:
When user ScrollDown And takes Screenshot of the Booked Hotels
Then user Click Logout And It Navigates to Successfully Logged Out Page
