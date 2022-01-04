Feature: check login on website
Scenario: facebook login with wrong username and password
Given User is on Login Page
Then User enters wrong username 'patelupal1234@gmail.com' and password  'asdfgh1234'
And User clicks
And verify



