$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("leadershipTeamPage.feature");
formatter.feature({
  "line": 1,
  "name": "Leadership team page test scenarios",
  "description": "",
  "id": "leadership-team-page-test-scenarios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5991889000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "verify and save leadership team members details",
  "description": "",
  "id": "leadership-team-page-test-scenarios;verify-and-save-leadership-team-members-details",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "valid mailchimp application URL",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "i navigate to Our Story page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "i click on Learn more about our leadership team link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "i should see leadership team page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "i should save leadership team member details to .csv file",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageStepDefn.valid_mailchimp_application_URL()"
});
formatter.result({
  "duration": 5917476500,
  "status": "passed"
});
formatter.match({
  "location": "OurStoryPageStepDefn.i_navigate_to_Our_Story_page()"
});
formatter.result({
  "duration": 2283527800,
  "status": "passed"
});
formatter.match({
  "location": "OurStoryPageStepDefn.i_click_on_Learn_more_about_our_leadership_team_link()"
});
formatter.result({
  "duration": 2392950000,
  "status": "passed"
});
formatter.match({
  "location": "LeadershipTeamPageStepDefn.i_should_see_leadership_team_page()"
});
formatter.result({
  "duration": 41983200,
  "status": "passed"
});
formatter.match({
  "location": "LeadershipTeamPageStepDefn.i_should_save_leadership_team_member_details_to_csv_file()"
});
formatter.result({
  "duration": 1930267100,
  "status": "passed"
});
formatter.after({
  "duration": 7184827600,
  "status": "passed"
});
formatter.after({
  "duration": 3598487700,
  "status": "passed"
});
});