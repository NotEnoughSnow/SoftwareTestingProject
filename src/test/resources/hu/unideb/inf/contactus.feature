Feature: Testing the ContactUs page

  Background:
    Given the home page is opened
    And the Contact Us link is clicked
    
    
    
      Scenario:
      Given the email address is filled with "valid@email.com"
      And the order reference is filled with "432432"
      And the message is filled with "Hello"
      And WebMaster option is selected
      When the Send button is clicked
      Then a "Your message has been successfully sent to our team." success message is shown in "contactUs"

      	  Scenario Outline:
      Given the email address is filled with '<parameter1>'
      And the order reference is filled with '<parameter2>'
      And the message is filled with '<parameter3>'
      When the Send button is clicked
      Then a '<msg>' error message is shown in '<page>'
      Examples:
        | parameter1 | parameter2     | parameter3  | msg                                             | page             |
        | invalid.com       | xxx     | Hello       | Invalid email address.                          |  contactUs       |
        | valid@outlook.com | xxx     |             | The message cannot be blank.                    |  contactUs       |
        | some@email.com    | 432432  | Hello       | Please select a subject from the list provided. |  contactUs       |
        
        
        
      
    
