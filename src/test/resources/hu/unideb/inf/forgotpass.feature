Feature: Testing the Forgot Password page

  Background:
    Given the home page is opened
    And the Sign In link is clicked
    And the Forgot password link is clicked

	  Scenario Outline:
      Given the '<field>' is filled with '<parameter>'
      When the Retrieve Password button is clicked
      Then a '<msg>' error message is shown in '<page>'
      Examples:
        | field | parameter         | msg                                                                 | page              |
        | email |                   | Invalid email address.                                              |  forgotPass       |
        | email | invalid.email.com | Invalid email address.                                              |   forgotPass      |
        | email | yeetus@email.com   | There is no account registered for this email address.             |   forgotPass      |
      
    
	Scenario:
      Given the "email" is filled with "valid@email.com"
      When the Retrieve Password button is clicked
      Then a "A confirmation email has been sent to your address: valid@email.com" success message is shown in "forgotPass"