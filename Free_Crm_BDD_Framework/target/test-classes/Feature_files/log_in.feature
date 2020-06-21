Feature: check log-in functionality

# Scenario: user with valid credential able tp log-in
#    Given Browser is open
#    And User is on home page
#    When User click on log-in button
#    Then User navigate to log-in page
#    And User gives username and password
#    And Hits login button
#    Then User is on free account page
    
Scenario Outline:  user with valid credential able tp log-in
    Given Browser is open
    And User is on home page
    When User click on log-in button
    Then User navigate to log-in page
    And User gives <username> and <password>
    And Hits login button
    Then User is on free account page
    
    Examples:
    | username | password |
    | Rajat@gmail.com | 12345 |
    | rr@gmail.com | 1234 |