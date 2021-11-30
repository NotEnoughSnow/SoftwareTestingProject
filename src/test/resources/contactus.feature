Feature: Testing the ContactUs page

  Background:
    Given the home page is opened
    And the Contact Us link is clicked

	Scenario:
      Given the email address is filled with "invalid.com"
      And the order reference is filled with "xxx"
      And the message is filled with "Hello"
      When the Send button is clicked
      Then a "Invalid email address." error message is shown
      
    Scenario:
      Given the email address is filled with "valid@outlook.com"
      And the order reference is filled with "xxx"
      When the Send button is clicked
      Then a "The message cannot be blank." error message is shown
      
    Scenario:
      Given the email address is filled with "some@email.com"
      And the order reference is filled with "432432"
      And the message is filled with "Hello"
      When the Send button is clicked
      Then a "Please select a subject from the list provided." error message is shown
      
    Scenario:
      Given the email address is filled with "some@email.com"
      And the order reference is filled with "432432"
      And the message is filled with "Hello"
      When the Send button is clicked
      Then a "Please select a subject from the list provided." error message is shown
      
    
