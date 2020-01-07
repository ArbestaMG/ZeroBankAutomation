@Login
Feature: Login

  Scenario:Only authorized users should be able to login
    Given user is on the login page
    Then user logs in as valid credentials
    And Account Summary should be displayed


  Scenario:Only authorized users should be able to login
    Given user is on the login page
    Then user logs in as invalid credentials
    And user see error message


  Scenario:Only authorized users should be able to login
    Given user is on the login page
    Then user logs in as valid credentials
    And page elements should be displayed



