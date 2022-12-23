Feature: Creation of MergeLead

Scenario: Merge Lead
  When Enter the Username as 'DemoCSR'
  And Enter the Password as 'crmsfa'
  When Click on Login Button
  Then Verify the home page is displayed
  Given Click on CRMSFA for Merge Lead
  And Click on contacts
  When Cick on Merge contacts 
  Then Select From contact from the contacts 
  And  Select To contact from the contacts
  Then Click on Merge
  And Verify Merge contact
  