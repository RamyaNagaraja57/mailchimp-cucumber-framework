package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import util.FileUtil;

public class OurStoryPage {

    /**
     * Object repository for Our Story Page
     */
    protected static final By learnMoreAboutLeaderShip = By
            .linkText("Learn more about our leadership team");

    /**
     * Verifies if Our Story page is displayed
     */
    public void goToOurStoryPage() {
        FileUtil.driver.findElement(HomePage.ourStory).click();
        FileUtil.wait.until(ExpectedConditions.visibilityOfElementLocated(OurStoryPage.learnMoreAboutLeaderShip));
        if (FileUtil.driver.findElement(OurStoryPage.learnMoreAboutLeaderShip).isDisplayed()) {
            FileUtil.LOGGER.info("Our story page is displayed sucessfully");
        } else {
            FileUtil.LOGGER.info("Our Story page is not displayed");
        }
    }
    
    /**
     * Method to click on learn more about leader ship team link
     */
    public void clickLearnMoreAboutOurLeadershipTeam() {
        FileUtil.driver.findElement(learnMoreAboutLeaderShip).click();
        FileUtil.wait.until(ExpectedConditions.visibilityOfElementLocated(LeadershipTeamPage.leaderShipDetails));
    }
}