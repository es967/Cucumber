Feature: login

Scenario: successful Login with vaild credentials
   Given User Launch Chrome browser
   When User opens Url"http://orangehrm.qedgetech.com/"
   When User enter user name as "Admin" password "Qedge123!@#"
   When click on login
   When page should be "Dashboard"
   When click pim button
   When Click Add button
   When Fill Add fname and mname and lname
   |qedge01|manua2|selenium|
   When  Capture  before emid
   When  click Save button
   When getting After emid
   When  click Leave button
   When click from
   When Select date and Month and Select Year
   When Select To Date and month and select year
   When Select Employee Name
   When click All
   When click Secrch button
   When click click reset button
   Then close browser
   

	

