Feature: Creation of Duplicate Lead

Scenario Outline: Duplicate Lead

  When Enter the Username as 'DemoCSR'
  And Enter the Password as 'crmsfa'
  When Click on Login Button
  Then Verify the home page is displayed
  Given Click on CRMSFA for Duplicate Lead
  And Click on Leads for Duplicate Lead
  And Click on Find Lead to find specific Lead ID
  And Click on email and enter as <eMail>
  When Click on Find Lead button to get the specific Lead to Duplicate
  Then Click and store the firstname of the Lead ID from the result Lead in a variable
  Then Click on Duplicate Button and verify for Duplicate Lead page 
  When Click on Create Lead to duplicate specific Lead 
  Then Validate Duplicate Lead ID process
  
   Examples:
  |eMail|
  |'Amwell@gmail.com'|