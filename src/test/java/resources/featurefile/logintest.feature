Feature: Login Test

  @Smoke
  Scenario: As user when click on login button i should navigate to login page successfully

    Given I am on homepage
    When  I click on log in link
    Then  I should navigate to login page successfully

  @Regression
  Scenario Outline: User should get error message when enter invalid credentials
    Given I am on homepage
    When  I click on log in link
    And    enter username "<username>"
    And   enter password "<password>"
    And   click on login button
    Then I should see  error message "<errorMessage>"

    Examples:
      | username             | password  | errorMessage                                                              |
      | InvalidTest@test.com | Test123   | The username or password you entered is incorrect. Please try again. |
      | Invalis121@gmail     | Test1234  | The username or password you entered is incorrect. Please try again. |
      | 123*456              | asasdf()_ | The username or password you entered is incorrect. Please try again. |
      | 123"""1334££         | 234*&^&   | The username or password you entered is incorrect. Please try again.|
