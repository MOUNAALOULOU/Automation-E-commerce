@VerifyAllProductsAndProductDetailPage
Feature: Product Verification
  ETQ user je souhaite visualiser la liste des produits 
@VerifyProductsAndDetails
  Scenario: Je souhaite visualiser la liste des Produits et le détail d'un produit
    Given Navigate to the url
    When Verify that home page is visible successfully
    Then Click on Products button
    And Verify user is navigated to ALL PRODUCTS page successfully
    And verify The products list is visible
    And Click on View Product of the first product
    And User is landed to product detail page
    And Verify that product name detail "product name" is visible
    And Verify that product category detail "product category" is visible
    And Verify that product price detail "product price" is visible
    And Verify that product availability detail "product availability" is visible
    And  Verify that product condition detail "product condition" is visible
    Then Verify that product brand detail "product brand" is visible