#Author: ninamishchenko31@gmail.com
Feature: Scenario output

Scenario: Sign up to the FreeCRM
Given I open my browser
And Navigate to FreeCRM and click sign in 
When I provide following details
   |Edition     | FirstName| LastName |Email          |ConfirmEmail   |UserName|Password|ConfirmPassword|
   |Free Edition|Damir     | Kuanbayev|damir@gmail.com|damir@gmail.com|Damir777|1234567 |1234567 |
   |Free Edition| Arina    | Cherry   |Chey@gmail.com |Chey@gmail.com |Cherry23|12345678|12345678|
 Then I click  agree conditions and submit
 When I on company page I provide folloving details
    |Company|Syntax |  
    |Phone  |hhhhhhhh|
    
 Then i click continue and complete registration
 Then I close my browser
    



