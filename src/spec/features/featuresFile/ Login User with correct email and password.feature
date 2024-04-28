@LoginUser
Feature: Authentification
  ETQ utilisateur je souhaite me connecter

  @LoginUserValide
  Scenario: Se connecter avec un login valide
    Given Launch browser
    When Navigate to url 'http://automationexercise.com'
    And Verify that home page is visible successfully
    When Click on 'Signup / Login' button
    And Verify 'Login to your account' is visible
    And Enter correct email address and password
    And Click 'login' button
    When Verify that 'Logged in as username' is visible
    And Click 'Delete Account' button
    Then Verify that 'ACCOUNT DELETED!' is visible
