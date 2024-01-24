
Feature: amazon login

Scenario Outline: varify login functionality with valid credentials

Given open browser and launch url
When Enter valid username "<username>"
Examples:
      | username | 
	    | Admin    | 
      | Admin    | 

And Enter valid "<password>"
Examples:
      | password | 
	    | Admin    | 
      | Admin    | 

Then click on login Btn