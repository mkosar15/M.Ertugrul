Feature: Gift Selection Feature

  Scenario: Selecting a gift and adding it to the cart
    Given I am on the homepage
    When I click on the "Gifts" option in the TAB menu
    And I select a random physical gift option
    And I do not fill in the mandatory fields
    Then I should receive a warning message
    When I fill in the "Recipient Name," "Sender Name," and "Message" fields
    And I click the "Add to Cart" button
    Then I should see the product successfully added to my shopping cart