Feature: Feature to test login functionality of TestProject

  Scenario Outline: Check whether login is successful for TestProject
    Given chrome browser is open
    And user is on TestProject login page
    When user enters <username> and <password>
    And clicks on login
    Then user is navigated to complete the test form page

    Examples: 
      | username | password |
      | Tony     |    12345 |
      | Buck     |    12345 |
