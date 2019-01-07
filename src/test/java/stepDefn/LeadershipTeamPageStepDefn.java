package stepDefn;

import PageObject.LeadershipTeamPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class LeadershipTeamPageStepDefn {

    LeadershipTeamPage leadershipPage = new LeadershipTeamPage();
    
    @Then("^i should see leadership team page$")
    public void i_should_see_leadership_team_page() throws Throwable {
        leadershipPage.verifyLeadershipTeamPage();
    }

    @And("^i should save leadership team member details to \\.csv file$")
    public void i_should_save_leadership_team_member_details_to_csv_file() throws Throwable {
        leadershipPage.saveTeamMembersDetails();
    }
}