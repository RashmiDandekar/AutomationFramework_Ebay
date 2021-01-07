@First

Feature: Registration for online cooking school

	Background:
	Given user loads the browser and user open the webpage
	
	Scenario: verify title
		 When verify title
		 And Print the title in console
		 Then Click on the hyperlink
		 And Verify the text “Recipe class Brochure is sent to your registered mail id”
		 And Print the title in console
		 And Go back to the previous page
		 And Print the title in console
		 
	Scenario: Empty first name
			When user give null first name
			And user clicks last name
			And alert box pops
			And Print the Alert message on console
			And Handle the Alert
			Then user clicks first name
			And alert box pops
			And Print the Alert message on console
			And Handle the Alert
	
	Scenario: enter details
			When user enters first name
			Then user enters last name
			And enters valid email
			When enter mobile no as characters
			Then clicks on category
			And alert box pops
			And Print the Alert message on console
			And Handle the Alert
	 		
	Scenario: Enter wrong data in mobile
			When user enter wrong mobile no
			Then clicks on category
			And alert box pops
			And Handle the Alert
			
  Scenario: All details
  		When user enters first name
			Then user enters last name
			And enters valid email
			And user enters correct mobile no
   		And user select Category as NonVeg
   		And city preference as “Mumbai”
			And Select mode of learning
			And Select interested course duration as “6 months”
			And Write meaningful sentence “Your Enquiry”
		 	
 	Scenario: submission
 		When user enters first name
		Then user enters last name
		And enters valid email
		And user enters correct mobile no
   	And user select Category as NonVeg
   	And city preference as “Mumbai”
		And Select mode of learning
		And Select interested course duration as “6 months”
		And Write meaningful sentence “Your Enquiry”
 		And Click on Enquire Now!
 		And alert box pops
 		And verfy alert msg
		And Handle the Alert
		And verify the text
		