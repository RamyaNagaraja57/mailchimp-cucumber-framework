Feature: Leadership team page test scenarios

Scenario: verify and save leadership team members details
Given valid mailchimp application URL
When i navigate to Our Story page
And i click on Learn more about our leadership team link
Then i should see leadership team page
And i should save leadership team member details to .csv file