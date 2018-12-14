Feature: Create an account


Scenario: Valid informations
Given I open browser1
And  I navigate to FreeCRM
When I  click on Sign up 

And  I click on drop down select 
And  I enter user information "Alina" and "Mishchenko" and "mishchenko.1994@bk.ru" and "mishchenko.1994@bk.ru"  and "Alina__" and "1234567" and "1234567"
And  I click on check box
And  I click submit 
And  I fill company info "Syntax" and "4109197133"
And  I click on continue 
Then I complite registration