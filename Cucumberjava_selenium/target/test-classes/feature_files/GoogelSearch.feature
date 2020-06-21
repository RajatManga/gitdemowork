Feature: feature to test google search functionality

  Scenario: validate google search is working
    Given Broeser is open
    And User is on google search page
    When user enters a text in search box
    And hits enter
    Then user is navigate to search result
