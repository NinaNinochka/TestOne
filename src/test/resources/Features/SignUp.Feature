Feature: SignUp

Scenario Outline: SignUp without keyword example

Given I open browser
And I navigate to FreeCrm
And I click on signUp
And I choose freeCRM
When I enter "<fName>" and "<lName>" and "<email>" and "<confEmail>" and "<userName>" and "<pwd>" and "<confPwd>"
And I check conditions and click submit
Then i enter company info "<companyName>" and "<companyNumber>"
And I click on continuee
Then I cklick on Complite Registration
Then I close browser 


Examples:
    |fName|lName|email                 |      confEmail      |userName  |pwd      |confPwd  |companyName  |companyNumber|
    |John |Dom  |mishchenko.1994@bk.ru |mishchenko.1994@bk.ru|Dom123456 |1234567  |1234567  | Syntax      | 12345678    |