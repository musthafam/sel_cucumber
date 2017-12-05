#Author: mmmgce@gmail.com
#Keywords Summary :Sample Cucumber Data Driven Project
@tag
Feature: Data Driven Testing

  Scenario Outline: Data Driven Scenario Test Case
    Given Test user has launched URL successfully
    When Enters the valid "<username>" & "<password>" and then clicks on the Login button
    Then User should get the home screen of the Portal successfully

    Examples: 
      | username | password    |
      | zmmm     | Ambattur123 |
      | zmmm     | qwerty123   |
