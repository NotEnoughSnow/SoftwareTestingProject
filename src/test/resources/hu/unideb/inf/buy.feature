Feature: Testing the ContactUs page

  Background:
    Given the home page is opened
    And the Women link is clicked
    
    
    
   	  Scenario:
      Given the blouse item is selected
      And characters are in Quantity box
      When the add to cart button is pressed
      Then a null message is displayed
      
      Scenario:
      Given the blouse item is selected
      When the add to cart button is pressed
      Then a buy success message is displayed
      
        
        