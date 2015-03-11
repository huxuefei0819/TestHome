Feature: add file when compose a email
As a user of gmail
I should be able to add file when composing a email
@compose
Scenario: compose gmail with a file
Given I login gmail by using username "goldenkeytest" and password "goldenkeytest222"
When I click COMPOSE and click Attch files button
And I add a local file
And I click send
Then I am able to see an error message
