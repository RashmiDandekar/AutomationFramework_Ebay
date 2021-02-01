@Sigining_in
Feature: Sigining in
	Background:
	  Given user should be on homepage of eBay website
	  When user clicks Sign in
	  
@tag1
  Scenario: successful entering email or username
	  When enter valid email or username
	  Then click continue
	  And Print the title
	  
@tag2
  Scenario Outline: unsuccessful entering email or password
	  When user enters <email_or_username>
	  Then click continue
	  And verify warning message for email or username
		Examples:
		  |email_or_username |
		  |Yesme@            |
		  |Oops@am.com       |
		  |                  |
@tag3	  
  Scenario: successful entering password
	  When enter valid email or username
	  Then click continue
	  And enter the valid password
	  And click sign in button
	  And user clicks sign out

@tag4
  Scenario Outline: unsuccessful entering password 
	  When enter valid email or username
	  Then click continue
	  And enter <password>
	  And click sign in button
	  And verify warning message for password
	  Examples:
	   	|password |
		  |gshs     |
		  |****     |
		  |         |
	
@tag5
	Scenario: successful registration
		Then user clicks Switch account
		When user clicks create an account
		And enters valid firstname
		And enters valid lastname
		And enters valid Email
		And enters valid password for creating account
		Then click create account
		And print the title
		And user clicks sign out

@tag6
	Scenario Outline: unsuccessful registration
		When user clicks create an account
		And enters valid firstname
		And enters valid lastname
		And user enter invalid <Email>
		Then click the password textbox
		And print the error message for email
		Examples:
			|Email     |
			|          |
			|y@a.c     |
			|ad@a@a.   |
			|yogi.b@g  |