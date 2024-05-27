@registerUser
Feature: User Registration
  ETQ user je souhaite me régistrer

  @registerUserWithExistingEmail
  Scenario: je souhaite creer un compte avec des identifiants existants
    Given Navigate to the url
    Then Click on Signup Login button
    And Verify message new user signup "New User Signup!" is visibles
    And Enter name "mouna"
    And Enter email address "monaaloulou@yahoo.fr"
    And Click Signup button
    And Verify that error message "Email Address already exist!" is visible
