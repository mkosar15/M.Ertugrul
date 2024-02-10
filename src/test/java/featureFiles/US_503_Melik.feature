Feature: Checking the all menus

  Scenario Outline: User login
    Given Navigate to Nopcommerce Web Site
    And Click on login button
    And Enter "<email>" and "<password>"
    When Click on LogIn button
    Then User should see a Error message

    Examples:
      | email             | password  |
      | asmith@gmail.com  | Qwerty12  |
      | a.smith@gmail.com | Qwertyu12 |
      | asmith@gmail.com  | Qwertyu12 |
      | asmith1@gmail.com | Qwerty12  |
      | a.smith@gmail.com | Qwertyu19 |
      | b.smith@gmail.com | Qwertyu19 |
