@logout
Feature: Deconnection
  ETQ utilisateur je souhaite me deconnecter

  @logoutUser
  Scenario: Je souhaite me deconnecter
    Given Navigate to the url
    When Verify that home page is visible successfully
    Then Click on Signup Login button
    And Verify that logging to user account message is visible "Login to your account"
    And Enter correct email address "mouna.aloulou@yahoo.fr"
    Then Enter correct password "mouna"
    And Click on login button
    Then Verify that the logged user message is visible "Logged in as username"
    And Click Logout button
    Then Verify that that user is navigated to login page
