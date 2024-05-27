@VerifyTestCasePage
Feature: User Registration
  ETQ user je souhaite verifier la page des cas de test
  
@VerifyTestCasePage
  Scenario: Je souhaite voir la liste des cas de test
    Given Navigate to the url
    When Verify that home page is visible successfully
    And Click on the Test Cases button
    Then Verify user is navigated to test cases page successfully
