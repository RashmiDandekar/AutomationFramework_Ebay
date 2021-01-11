@Buy
Feature: Buy the products   

    Background:
	   Given user should be on homepage of eBay website
	
		Scenario: Check Buy option is available
		 When Buy option is available
		 Then print the text of Buy option
		
		Scenario: Selecting the Buy option
		 When User clicks on Buy option
		 And Print the title
		 Then Select the Category for Buy option
		 And Print the title
		 And Select the product for Buy option
		 And Print the title
		 
		Scenario Outline: Writing the product name for buy
		 When User clicks on Buy option
		 And Print the title
     Then user <typeproduct> in search box in Buy option
      Examples:
       |typeproduct    |
       |Reebok         |
       | Bottle        |
     And click on search Buy option
     And Print the title 
     And Choose and select the product to buy
     And Add to cart
     