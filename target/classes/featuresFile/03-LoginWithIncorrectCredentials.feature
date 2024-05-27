@LoginUser
Feature: Authentification
  ETQ utilisateur je souhaite me connecter

  @LoginUserInvalide
  Scenario: Je souhaite me connecter avec un login invalide
    Given Navigate to the url
    When Verify that home page is visible successfully
    Then Click on Signup Login button
    And Verify that logging to user account message is visible "Login to your account"
    And Enter correct email address "aloulou@yahoo.fr"
    Then Enter correct password "aloulou"
    And Click on login button
    Then Verify the error message is visible "Your email or password is incorrect!"
