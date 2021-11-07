Feature: Validate the age policy and have a license to obtain insurance 

 Scenario: The client is over 80 years old And does not has a driver's license
  Given The client is over "80" years old And "does not has" a driver's license 
  When Valid if the client is over 80 years old and if he/she has a driver's license 
  Then Show “not sell" 
  
 Scenario Outline: The client is or is not over 80 years old And has or not has a driver's license
  Given The client is over "<age>" years old And "<own>" a driver's license 
  When Valid if the client is over 80 years old and if he/she has a driver's license 
  Then Show “<answer>" 
  
 Examples:
 | age | own | answer |
 | 80 | does not has | not sell |
 | 79 | has | sell | 


Feature: Calculate the insurance prime for a customer  

 Scenario: The client is a male, not married, under 25 years  
  Given: Is "M", "not married" And "23" 
  When: Calculating the premium.
  Then:  Show "2000"
  
 Scenario Outline: The client is or is not a male, married or not married, over or under 25 years  
  Given Is "<sex>", "<maritalStatus>" And "<age>" 
  When Calculating the premium.
  Then Show "<answer>" 
  
 Examples:
 | sex | maritalStatus | age | answer |
 | M | not married | 23 | 2000 |
 | F | married | 25 | 300 |
 

Feature:Calculate the insurance prime for a male customer 

 Scenario:The client is a male, married, over 25 years.
  Given: Is "M", "married" And "26" .
  When: Calculating the premium.
  Then:Show $300
  
 Scenario Outline:The client is or is not a male, married or not married, over or under 25 years.
  Given: Is "<sex>", "<maritalStatus>" And "<age>" 
  When: Calculating the premium.
  Then:Show "<answer>"
  
 Examples:
 | sex | maritalStatus | age | answer |
 | M | married | 26 | 300 |
 | F | married | 25 | 300 |
  