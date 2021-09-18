

Feature: 
Scenario Outline: To Login the Amazon Page using different credentials
Given User is on login page
When To input correct "<name>" and "<password>"
Then click on login
And user confirms "<Result>"

Examples: 

|name    |password|Result  |
|Shake   |12345   |Negative|
|Aalam   |1245    |Negative|




