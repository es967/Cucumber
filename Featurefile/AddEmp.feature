Feature: login

Scenario: successful Login with vaild credentials
   Given User Launch Chrome browser
   When User opens Url"http://orangehrm.qedgetech.com/"
   And User enter user name as "Admin" password "Qedge123!@#"
   And click on login
   Then page should be "Dashboard"
   Then click pim button
   And Click Add button
   And fname and mname lname
   |Anki01|Eswar02|Reddy03|
   And getting before emid
   And click Save button
   Then getting After emid
   
   

	

