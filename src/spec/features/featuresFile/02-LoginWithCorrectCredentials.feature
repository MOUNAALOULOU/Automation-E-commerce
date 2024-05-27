@LoginUser
Feature: Authentification
  ETQ utilisateur je souhaite me connecter

  @LoginUserValide
  Scenario: Je souhaite me connecter avec un login valide
    Given Navigate to the url
    When Verify that home page is visible successfully
    Then Click on Signup Login button
    And Verify that logging to user account message is visible "Login to your account" 
    And Enter correct email address "maloulou@yahoo.fr"
   Then Enter correct password "mouna"
    And Click on login button
    Then Verify that the logged user message is visible "Logged in as username" 
    And Click Delete Account button
    Then Verify that account deleted message is visible "ACCOUNT DELETED!"
    