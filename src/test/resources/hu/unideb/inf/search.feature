Feature: Testing the ContactUs page

  Background:
    Given the home page is opened
    
    
    Scenario:
      Given "blouse" is typed
      When  the search button is pressed
      Then "1 result has been found." success message displays
    
   	  Scenario Outline:
   	  Given '<key>' is typed
      When  the search button is pressed
      Then '<msg>' displays
      Examples:
        | key | msg         |
        |  | Please enter a search keyword     |
        | ahwkas | No results were found for your search "ahwkas" |
      	
        
        
        
      
    
