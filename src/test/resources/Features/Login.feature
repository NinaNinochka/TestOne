Feature: LoginFeature

Scenario: Valid Login
Given I open browser
And I navihate to the FreeCrm
When I enter username and password
And I click login button
Then I successfully logged in 



Scenario: Invalid login
Given I open browser
And I navihate to the FreeCrm
When I enter  invalid username and password
And I click login button
Then I unsuccessfully logged in 