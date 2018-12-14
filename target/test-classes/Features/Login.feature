#Author# ninamishchenko31@gmail.com
Feature: LoginFeature    

Scenario Outline: Valid Login
Given I open browser
And I navihate to the FreeCrm
When I enter "<uNmae>" and "<pwd>" 
And I click login button
Then I successfully logged in
And I quit browser 

 Examples:
    |uNmae   |    pwd  |
    |Nina__  | odimeg23|
    | Kilany | Asmaa456|
    |JorgeSPalomo| 4101989Jp|




Scenario: Invalid login
Given I open browser
And I navihate to the FreeCrm
When I enter "Nina" and "odimeg23" 
And I click login button
Then I unsuccessfully logged in 
And I quit browser 
