Feature: Creation of Delete Lead

Scenario Outline: Delete Lead

  When Enter the Username as 'DemoCSR'
  And Enter the Password as 'crmsfa'
  When Click on Login Button
  Then Verify the home page is displayed
  Given Click on CRMSFA for Delete Lead
  And Click on Leads for Delete Lead
  And Click on Find Lead to find specific Lead
  And Click on Phone and enter the Phone number  as <pArea> and as <pNumb>
  When Click on Find Lead button to get specific Lead
  Then Click and store the Lead ID from the result Lead in a variable
  Then Click on Delete Button
  When Click on Find Lead to check specific Lead got deleted or not
  Then enter the deleted Lead ID that stored in a variable
  Then Check for the existance of deleted Lead ID
  
   Examples:
  |pArea|pNumb|
  |123|4567|