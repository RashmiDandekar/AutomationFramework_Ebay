@Sell
Feature: Sell 

  Background:
   Given user should be on homepage of eBay website
	
   Scenario: Check Sell option is available
     When Sell option is available
     Then print the text of sell option

   Scenario Outline: Selecting the sell option
     When user clicks sell option
     And user click list an item
     And  user <typeproduct> in Sell search box
     Then click go
     And Print the title
		 Examples:
         |typeproduct     |
         |laptop          |
         |watches         |
  