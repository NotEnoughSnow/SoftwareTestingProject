Feature: YourLogo sign in page test

  Background:
    Given the home page is opened
    And the Sign In link is clicked

    Scenario Outline:
      Given the '<field>' is filled with '<parameter>'
      When the Sign In button is clicked
      Then a '<msg>' error message is shown in '<page>'
      Examples:
        | field | parameter         | msg                        | page    |
        | email |                   | An email address required. | signIn  |
        | email | invalid.email.com | Invalid email address.     | signIn  |
        | email | valid@email.com   | Password is required.      |  signIn |
        