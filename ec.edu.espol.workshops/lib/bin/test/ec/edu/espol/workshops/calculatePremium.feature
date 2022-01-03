 Feature: The premium can be calculated?
 Scenario: Customer has negative age
 Given the client has negative -23
 When I ask whether can calculate the premium 
 Then I should show "-1"
 
 Scenario Outline: Customer has negative age
 Given the client has negative "<age>" 
 When I ask whether can calculate the premium 
 Then I should show "<answer>"
 
 Examples:
 | age | answer |
 | -23 | -1 |
 