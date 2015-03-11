Feature: MYUPMC mailbox
As a user of MYUPMC
I should be able to login mailbox and get medical advice
@mailbox
Scenario: medical advice
Given I login MyUPMC using username as "gk_kevin" and password as "Reg999111"
When I click Mailbox
And I click Get Medical Advice button
Then I change subject to "Test results question"

