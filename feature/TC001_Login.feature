Feature: Leaftaps Login functionality 

Scenario: Login with Positive Credentials
#static parametrization
Given Launch the browser
And Load the url
And Enter the username as 'demosalesManager'
And Enter the password as 'crmsfa'
When click on the Login button
Then WelcomePage is displayed

Scenario: Login with invalid Credentials

Given Launch the browser
And Load the url
And Enter the username as 'demo'
And Enter the password as 'crmsfa'
When click on the Login button
But Error message is displayed