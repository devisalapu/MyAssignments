Feature: Create Lead creation
#@Smoke
Scenario Outline: Create Lead
 # Given Launch the Chrome Browser
 # And Load the URL and Maximise
  When Enter the Username as 'DemoCSR'
  And Enter the Password as 'crmsfa'
  When Click on Login Button
  Then Verify the home page is displayed
  Given Click on CRM/SFA
  And Click on Leads tab
  And Click on Create Lead
  And Enter the company name as <cName>
  And Enter the First name as <fName>
  And Enter the Last name as <lName>
  When Click on Create Lead button
  Then Verify Lead is created
  
  

 Examples:
|cName|fName|lName|
##|'demosalesmanager'|'crms'|
|'TestLeaf'|Sree|S|


