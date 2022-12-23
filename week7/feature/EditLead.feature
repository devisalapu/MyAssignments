Feature: Creation of Edit Lead

Scenario Outline: Edit Lead
  When Enter the Username as 'DemoCSR'
  And Enter the Password as 'crmsfa'
  When Click on Login Button
  Then Verify the home page is displayed
  Given Click on CRMSFA
  And Click on Leads
  And Click on Find Lead
  And Enter the First name in Edit as <fName>
  When Click on Find Lead button
  Then Click on Lead ID from result
  Then Verify expected Lead page is displayed
  Then Click on Edit Button
  And Clear the Company Name
  And Enter new Company Name as <cName> and store the company name in a variable
  Then Click on update button
  Then Check Company name is updated or not
  
  Examples:
  |fName|cName|
|'abcxyz'|'TestLeaf'|
  