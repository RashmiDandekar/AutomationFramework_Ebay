@Daily_deals
Feature: Daily Deals
  
   Background:
    Given user should be on homepage of eBay website
   
   Scenario: Check Dailydeals button
    When Check dailydeals option is available
    Then print the text of Daily Deals option
   
   Scenario: Selecting the Daily Deals 
		When User clicks on Daily Deals option
		And Print the title
		Then Select the Category for Daily Deals option
		And Print the title
		And Select first product for Dailydeals
		And Add to cart
	 
    
	

   
   
   
   	