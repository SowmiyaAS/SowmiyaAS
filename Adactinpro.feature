Feature: Test Adactin Hotel Application

@smoke_001 
Scenario: Test Adactin login functionality
Given user launch the application
When user enter valid username
And user enter valid password
And user clik on the login button and it navigate to the next page

@sc_002
Scenario: Test hotel Search Functionality
When user enter  the location
And user enter the hotel name 
And user enter  the hotel roomtype
And user enter the hotel roomnum
And user enter the adults per room
And user enter the Childrens per room
And user click on the search button and it navigate to the continue page

@sc_003
Scenario: Test continue functionality
When user click on the select hotel button
And user click on the continue button and it navigate to the booknow page

@sc_004 
Scenario: Test booknow functionality
When user enter the first name
And user enter the last name
And user enter the address
And user enter the card number
And user enter the card type
And user enter the cardexpiremonth
And user enter the cardexpireyear
And user enter the cvv number
Then user enter the booknow button and it navigate to the booknow page







 
