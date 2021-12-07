Feature: YourLogo sign in page test

  Background:
    Given the home page is opened
    And the Sign In link is clicked

    Scenario Outline:
      Given the '<field>' is filled with '<parameter>'
      When the create account button is clicked
      Then a '<msg>' create account error message displays
      Examples:
        | field | parameter         | msg                        |
        | email_create |                   | Invalid email address. |
        | email_create | invalid.email.com | Invalid email address.    |
        | email_create | valid@email.com   | An account using this email address has already been registered. Please enter a valid password or request a new one.      |
        
        
      
    
