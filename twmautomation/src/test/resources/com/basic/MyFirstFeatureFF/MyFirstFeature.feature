Feature: Create Account of TWM
As a user you need to open TWM home page and do the validation

Scenario: Validate First Name field
Given User need to be TWM login page
When User enters user first name
Then User checks first name is present


#Scenario: Validate create user multiple fields
#Given User need to be TWM login page
#When User enters user first name 
#And User enters user surname
#Then User checks first name is present
#But User phone field should be blank
