Feature: Add new Employee

Scenario Outline:
 successful Login with vaild credentials
Given User Launch Chrome browser
Then User opens Url"http://orangehrm.qedgetech.com/"
When User enter user name as "Admin" password "Qedge123!@#"
When click on login
When page should be "Dashboard"
When click pim button
When Click Add button
When Fill Add Employee "<fname>"and"<mname>"and"<lname>"
When user capture Emid before
When click save button
When user capture Emid after
Then user validate emid
Then close browser
Examples:
|qedge01|Manual02|Selenium|
|qedge02|Manual03|mnaual03|
|Manual0|Qedge003|Eswar001|
|Eswar01|Selenium|manual00|
|manual0|Qedge00 3|Testing0|
|Qedge03|Selenium|Manual03|
|eswar01|manual02|Selenium|
   

	

