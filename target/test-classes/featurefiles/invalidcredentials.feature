@logininv
Feature: To validate login functionality

Background:
Given user in login functionality

  @smoke
  Scenario: To validate the login functionality with invalid credentials
   
    When user has to enter invalid username and invalid password
    |  username  |  password  |
    |  java123   |  java      |
    |  selen123  |  selen     |
    And user has to click the login button
    Then user is in invalid credentials page
    

  @sanity
  Scenario: To validate the login functionality without passing credentials
    When  user has to click the login button
    Then user is in invalid credentials page