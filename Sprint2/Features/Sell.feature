@Sell
Feature: Selloption 

   Background:
     Given user should be on homepage of ebay website
	
   Scenario: Check Sell option is available
     When Sell option is available
     Then print the text of sell option 

   Scenario Outline: Selecting the sell option
     When user click list an item 
     And  user <type_product> in Sell search box
       Examples:
         |type_product    |
         |laptop          |
         |watches         |
    Then click go 
    And click on sell one like this
    And Print the title

  