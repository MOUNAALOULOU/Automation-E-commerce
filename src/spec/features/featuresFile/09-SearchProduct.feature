
@SearchProduct
Feature: Product Search
  ETQ user je souhaite visualiser la liste des produits

  @SearchProduct
  Scenario: Je souhaite rechercher un produit
    Given Navigate to the url
    When Verify that home page is visible successfully
    Then Click on Products button
    And Verify user is navigated to ALL PRODUCTS page successfully
    And Enter product name "Dress" in search input
    And Click on search button
    And Verify that the searched products message is visible "SEARCHED PRODUCTS"
    And Verify all the products related to search are visible

