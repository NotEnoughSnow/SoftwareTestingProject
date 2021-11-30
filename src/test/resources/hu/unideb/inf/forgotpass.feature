Feature: Testing the Forgot Password page

  Background:
    Given the home page is opened
    And the Sign in link is clicked
    And the Forgot password link is clicked

	Scenario:
      Given the email address is filled with "invalid.com"
      When the Retrieve Password button is clicked
      Then a "Invalid email address." error message is shown1
      
    
