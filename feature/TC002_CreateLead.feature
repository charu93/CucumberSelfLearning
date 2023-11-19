Feature: CreateLead Funtionality


Scenario Outline: CreateLead with Mandatory fields


Given Launch the browser
And Load the url
And Enter the username as 'demosalesManager' 
And Enter the password as 'crmsfa'
When click on the Login button
Then WelcomePage is displayed
When click on the 'CRM/SFA' link
When click on the 'Leads' link
When click on the 'Create Lead' link
When Enter the company name as <companyName>
When Enter the first name as <firstName>
When Enter the last name as <lastName>
When click on create button
Then Viewleadpage is displayed

Examples:
|companyName|firstName|lastName|
|'TestLeaf'|'Charmila'|'M'|
|'Wipro'|'Charmila'|'M'|
|'Infosys'|'Charmi'|'M'|
|'CTS'|'Charu'|'C'|