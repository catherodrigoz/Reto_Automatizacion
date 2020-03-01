Feature: add to new product and verify
  As vivanda future customer
  I want to add new product 
  To buy articles

  Scenario: add product to shopping cart
    Given that Rosie enters the page
    When Rosie add to product
    Then Rosie should verify the '1 Productos' has been add to shopping cart