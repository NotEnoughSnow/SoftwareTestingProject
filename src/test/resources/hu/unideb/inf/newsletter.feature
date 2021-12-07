Feature: YourLogo sign in page test

  Background:
    Given the home page is opened

    Scenario Outline:
      Given '<input>' is typed in email box
      When the newsletter button is clicked
      Then a '<msg>' newsletter message displays
      Examples:
        | input  | msg             |
        |  |  Newsletter : Invalid email address. |
        | invalid.email |  Newsletter : Invalid email address. |
        
      
    
