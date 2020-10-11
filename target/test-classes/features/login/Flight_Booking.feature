Feature: As a customer I should be able to book flight and get a valid confirmation Id

  Scenario: Checking the flight confirmation functionality of the website
  	Given I am on the home page "http://blazedemo.com/"
    Then I see Welcome to the Simple Travel Ageny! on homePage
    Then I see Choose your departure city and Choose your destination city on page
    And  I select "departure" city as "Paris"
    And I select "destination" city as "Rome"
    And I Click on find flights
    And I am navigated to the "reserve" page
    And I choose a flight
    And I am navigated to the "purchase" page
    And I enter the details and click on purchase flight
    |jenny| 1234 new york |new york|New York|10001|1234567890123456 |jenny|
    And I am navigated to the "confirmation" page
    And I should be seeing confirmation id field as not null
    


	##==============================================================================================
	##Scenarios covered ##
	##----------
	
	#Sc01:Checked if user is navigated to the home page of the flight booking application
	#Sc02:Checked if user is able to see the departure city and destination city of home page
	#Sc03: Checked if user is able to selected departure city and destination city from the drop down
	#Sc04: checked if on clicking find flights user is able to go to the reserve page
	#Sc05: Checked whether I as a user is able to select a flight
	#Sc06: Checked whether I am navigated to the purchase page on choosing a flight
	#Sc07:Checked that on entering the details in the form and clicking on purchase flight confirmation page is displayed 
	#Sc08:Checked that on confirmation page confirmation id is not null
	
	##-- What all could have been tested 
	
	#Sc09:Validate that user is able to see the correctly flight details along with the correct message on reserve page 
	#Sc10: validate that when user navigates from resever page to the purchase page user should be seeing correct flight details and price 
	#Sc11: validate that the fields available on purchase page accept correct data type for example credit card is accepting only 16 digits for visa and master card
	#Sc12: validate that after making payment user is not allowed ot go back via browser back button
	#Sc13: validate that details entered by user on puchase page maches the details displayed on confirmation page
	#Sc14: Validate that flight is in confirmed status and correct date of booking is displayed on the confirmation page
	
	
	
	






	
	
	
	
	
	
	
	
	##--------------------------------
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
    
    ##And I enter password as "testpassword"
    ##And click on login button
    ##Then I am logged in
    ##And I clear cart items if any
    ##Then I choose Electronincs>Headphones and headphones list out
    ##Then I add first availabe headphone to cart
    ##Then I search "Macbook pro" and add second available item to cart
    ##Then I Select cart from home and remove the earlier added headphones
    ##Then I Reduce the Quantity of the macbook pro product to one and proceed to checkout
   ## And I Click on Sign out
	##Then I got log out from the application and land on sign in page*/
   
   
  ##Scenario Outline: Searching different products after login
   ## Given I am on the Login page URL "https://www.amazon.in/"
    ##Then I click on sign in button and wait for sign in page
    ##Then I should see Sign In Page
    ##When I enter username as "testusername"
    ##And I Click on Continue button
    ##And I enter password as "testpassword"
    ##And click on login button
    ##Then I am logged in
	##And I search different "<products>" from the search bar
		
 	##Examples:
	 ##| products |
	 ##| laptops  |
	 ##| pendrive |
	 ##| led tv   |
  
   
