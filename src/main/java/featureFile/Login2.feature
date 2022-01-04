Feature: check facebook credentials.
Scenario Outline: facebook login with different username and password
Given User is on Login Page.
Then user enters "<username>" and "<password>".
And User clicks on Login Button.
And verify Assert.

Examples:
|username | password | 
|asdfglkjh|123ad40987|
|qwemnbh|lkouu0|
|upalpatel|asdfghjklpoi8909876789|