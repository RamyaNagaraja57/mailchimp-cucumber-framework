package stepDefn;

import PageObject.OurStoryPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;

public class OurStoryPageStepDefn {
    
    OurStoryPage storyPage = new OurStoryPage();
    
    @When("^i navigate to Our Story page$")
    public void i_navigate_to_Our_Story_page() throws Throwable {
        storyPage.goToOurStoryPage();
    }
    
    @And("^i click on Learn more about our leadership team link$")
    public void i_click_on_Learn_more_about_our_leadership_team_link() throws Throwable {
        storyPage.clickLearnMoreAboutOurLeadershipTeam();
    }
}