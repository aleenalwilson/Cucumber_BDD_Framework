@SmokeFeature
Feature: Feature to test login functionality

	@smoketest
  Scenario: Check whether login is sucessfull with valid credentials
    Given user is on login page
    When user provides user-name and password
    And clicks on login button
    Then user is navigated to home page

	##When using parameters use Scenario outline. Parameters are given inside <>
  #Scenario Outline: Check whether login is successfull with valid credentials
    #Given user is on login page
    #When user enters <username> and <password>
    #And clicks on login button
    #Then user is navigated to home page

	#To give values to parameters use examples
    #Examples: 
      #| username | password |
      #| user1    | pass1    |
      #| user2    | pass2    |