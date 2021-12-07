Feature: YourLogo sign in page test

  Background:
    Given the home page is opened
    And the Sign In link is clicked

    Scenario Outline:
      Given the '<field>' is filled with '<parameter>'
      When the Sign In button is clicked
      Then the '<msg>' error message is shown
      Examples:
        | field | parameter         | msg                        |
        | email |                   | An email address required. |
        | email | invalid.email.com | Invalid email address.     |
        | email | valid@email.com   | Password is required.      |
        
        
        
        
	Scenario:
      Given the email address is filled with "invalid.com"
      When the Retrieve Password button is clicked
      Then a "Invalid email address." error message is shown (forgot pass)
      
         Scenario Outline:
      Given the '<field>' is filled with '<parameter>'
      When the Retrieve Password button is clicked
      Then a '<msg>' error message is shown (forgot pass)
      Examples:
        | field | parameter         | msg                        |
        | email |                   | Invalid email address. |
        | email | invalid.email.com | Invalid email address.     |
        | email | valid@email.com   | A confirmation email has been sent to your address: valid@email.com      |
        | email | yeetus@email.com   | There is no account registered for this email address.      |
