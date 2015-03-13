Feature: login with username and password from mysql database
As a user of gmail
I should be able to login
@sql
Scenario: compose gmail with a file
Given google gmail page
Given set up database connection
When login with username and password from database
Then I should see my login page
