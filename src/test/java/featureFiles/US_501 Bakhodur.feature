Feature: User Registration
  As a user, I want to register on the website [https://demo.nopcommerce.com/ ]
  so that I can access personalized content, view special offers, and enjoy other advantages.

  @UserRegistration @Smoke
  Scenario: User Registration with valid data
    Given Navigate to Nopcommerce Web Site
    And Click on Register Link
    And Fill the form
    When Click on REGISTER Button
    Then The user should see a message confirming the successful registration