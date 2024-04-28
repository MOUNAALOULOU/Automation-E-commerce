@registerUser
Feature: User Registration
  ETQ user je souhaite me régistrer

  @registerNewUser
  Scenario: je souhaite creer un nouveau compte
    Given Navigate to the url
    When Verify that home page is visible successfully
    Then Click on Signup Login button
    And Verify message new user signup "New User Signup!" is visibles
    And Enter name "mouna"
    And Enter email address "mounaaloulou@gmail.com"
    And Click Signup button
    And Verify that message enter account information "ENTER ACCOUNT INFORMATION" is visible
    And I click on Mrs Btn
    And Fill the details in the user account  fields
      | name     | Mouna ALOULOU |
      | Password | $mouna$       |
    And Fill the Date of birth "21"
    And Fill the month of birth "April"
    And Fill the year of birth "1981"
    And Select checkbox Sign up for our newsletter
    And Select checkbox Receive special offers from our partners
    And Fill the details in the input fields
      | First name    | Mouna                |
      | Last name     | ALOULOU              |
      | Company       | ALOULOU ET AL        |
      | Address       | 25 Rue des figues    |
      | Address2      | Les berges de Néroli |
      | Country       | France               |
      | State         | Courbevoie           |
      | City          | La Defense           |
      | Zipcode       |                92400 |
      | Mobile Number |           0772187985 |
    And Click Create Account button
    And Verify that acount created message is visible "ACCOUNT CREATED!"
    And click Continue button
    And Verify that logged in as username message is visible 'Logged in as username'
    And Click Delete Account button
    Then Verify that account deleted message is visible "ACCOUNT DELETED!"
    And click Continue button
