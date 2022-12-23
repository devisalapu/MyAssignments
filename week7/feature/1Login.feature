Feature: Login to the leaptaos application.

Scenario Outline:Positive login
  When Enter the Username as <uName>
  And Enter the Password as <pWord>
  When Click on Login Button
  Then Verify the home page is displayed
  
  Examples:
  |uName|pWord|
#|'demosalesmanager'|'crms'|
|'DemoCSR'|'crmsfa'|
  
  #@Sanity @Regression
Scenario: Negative login
#Given Launch the Chrome Browser
#And Load the URL and Maximise
And Enter the Username as 'demosalesmanager'
And Enter the Password as 'crmsfa'
When Click on Login Button
But  Verify the error message is displayed