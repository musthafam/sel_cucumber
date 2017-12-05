#Sample Feature Definition Template

Feature: Sample Project
 @tagTest1
 Scenario: First Test case
    Given User has launched Test URL
    When Enters valid username and password and clicks on Login
    Then User should get the home screen
 @tagTest2   
  Scenario: Second Test case - Parameter without Example
    Given User has launched Test URL in Chrome
    When Enters valid "zmmm" and "Ambattur123" and clicks on Login
    Then User should get the home screen successfully 
    

  #@tag2
  #Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
  #  When I check for the <value> in step
  #  Then I verify the <status> in step

#    Examples: 
 #     | name  | value | status  |
 #     | name1 |     5 | success |
 #     | name2 |     7 | Fail    |
#