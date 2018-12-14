Feature: LoginFeature

Scenario: Valid Login
Given I open browser
And I navihate to the FreeCrm
When I enter "Nina__" and "odimeg23" 
And I click login button
Then I successfully logged in 



Scenario: Invalid login
Given I open browser
And I navihate to the FreeCrm
When I enter "Nina" and "odimeg23" 
And I click login button
Then I unsuccessfully logged in 


Scenario: Test login with invalid password
Given I open browser
And I navihate to the FreeCrm 
When I enter "Ni" and "odi" 
And I click login button
Then I should see an error text
And I close browser