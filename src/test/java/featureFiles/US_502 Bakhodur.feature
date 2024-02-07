Feature: User Login
  As a user, I want to be able to log in to the website so that I can
  access the features on the platform using the profile I created before.

  @LoginTest @Smoke
  Scenario: User Login with valid data
    Given Navigate to Nopcommerce Web Site
    And Click on Login Link
    And Enter email and password
    When Click on LOG IN Button
    Then The user should successfully log in