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
   Then close browser
   Examples:
   |qedge01|manua2|selenium|
   |qedge02|selenium|manual|
   |qedge03|manual|selenium|
   |qedge04|selenium|manual|
   |selenium01|qedge|manual|
      
   

	

