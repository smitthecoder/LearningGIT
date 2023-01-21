Feature: Application login

Scenario: Verify login with correct username and password
Given User is on the landing page
When user enters username "smita" and password "123"
Then Home page is displayed
And status is "false"

Scenario: Verify login with correct username and password
Given User is on the landing page
When user enters username "shilpa" and password "789"
Then Home page is displayed
And status is "true"