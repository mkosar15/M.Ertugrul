Feature: Product Search Feature

  Scenario: Verify product search functionality
    Given I am on the homepage of the website
    When I list the names of the items in the tab menu and its submenus
    And I enter the name of a product taken from an XML file into the search box
    And I click the "Search" button
    Then I should be able to verify whether the product is present in the list