@Sigining_in
  Feature: Sigining in

  Background:
	  Given user should be on homepage of ebay website
	  When user clicks Sign in 
	  Then user clicks Switch account

  Scenario: successful entering email or username
	  When enter valid email or username 
	  Then click continue  

  Scenario Outline: unsuccessful entering email or password
	  When user enters <email_or_username>  
	   Examples:
		  |email_or_username |
		  |Yesme@            |
		  |Oops@am.com       |
		  |                  |
	  Then clicks continue
	  And verify warning message for email or username

  Scenario: successful entering password
	  When enter valid email or username
	  Then click continue 
	  And enter the valid password 
	  And click sign in button
	  And user clicks sign out

  Scenario Outline: unsuccessful entering password 
	  When enter valid email or username
	  Then click continue 
	  And enter <password>
	   Examples:
	   	|password |
		  |gshs     |
		  |****     |
		  |         |
	  And click sign in button
	  And verify warning message for password
	
Scenario: successful registration
When user clicks create an account
And enters valid firstname
And enters valid lastname
And enters valid Email
And enters valid password for creating account
Then click create account
And print the title
And user clicks sign out

Scenario Outline: unsuccessful registration
When user clicks create an account
And enters valid firstname
And enters valid lastname
And user enter invalid <Email>
Examples:
|Email     |
|          |
|y@a.c     |
|ad@a@a.   |
|yogi.b@g  |
Then click the password textbox
And print the error message for email