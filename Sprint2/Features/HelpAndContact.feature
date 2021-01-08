@Help_And_Contact
Feature: Help and contact

Background:
  Given user should be on homepage of ebay website

Scenario: Check Help & contact option is available
 When Help & Contact is available
 Then print the text of Help and contact option
   

Scenario: Writing query for Help & Contact
 When user clicks on Help & Contact
 Then Print the title
 And type the query in search box
 And select the query from list
 And Print the title

Scenario: selecting query in Help & Contact
 When user clicks on Help & Contact
 Then Print the title
 And click the query
 And Print the title