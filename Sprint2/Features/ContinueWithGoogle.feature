@Continue_with_google
Feature: Continue with google
  Background:
  Given user should be on homepage of eBay website

  Scenario: Successful login with google
  When user clicks Sign in
  And sign in or register page will open
  Then user clicks continue with google option

