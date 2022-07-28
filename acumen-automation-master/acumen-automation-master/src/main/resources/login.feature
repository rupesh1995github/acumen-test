Feature: Login

Scenario: Login to portal using valid login details

Given I launch the URL
#And I am on the login page
When I enter "admin" in the username field
And I enter "adminpass123#" in the password field
And I click on submit button
Then I should be logged in successfully