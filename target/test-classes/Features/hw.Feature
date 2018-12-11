Feature: Create an account


Scenario: Valid informations
Given I open browser1
And  I navigate to FreeCRM
When I  click on Sign up 
And  I click on drop down select 
And  I enter user information
And  I click on check box
And  I click submit 
And  I fill company info
And  I click on check box
And  I click on continue 
Then I successfuly create an account 