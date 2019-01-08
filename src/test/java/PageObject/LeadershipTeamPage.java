package PageObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.csvreader.CsvWriter;

import util.FileUtil;

public class LeadershipTeamPage {

    /**
     * Object repository for Leadership Team Page
     */
    private static final By leaderShipName = By.xpath("//div[@class='bioList__content']/h5");
    private static final By leaderShipPosition = By.xpath("//div[@class='bioList__content']/p[1]");
    private static final By leaderShipDescription = By
            .xpath("//div[@class='bioList__content']/p[2]");
    protected static final By leaderShipDetails = By.xpath("//div[@class='bioList__content']");

    /**
     * Saves leadership team members name, position and description
     */
    public void saveTeamMembersDetails() {
        List<WebElement> leaderShipNames = FileUtil.driver.findElements(leaderShipName);
        List<WebElement> leaderShipPositions = FileUtil.driver.findElements(leaderShipPosition);
        List<WebElement> leaderShipDescriptions = FileUtil.driver
                .findElements(leaderShipDescription);
        int count = leaderShipNames.size();
        try {
            String outputFilePath = System.getProperty("user.dir")
                    + "\\output\\leaderShipDetails.csv";
            File outputFile = new File(outputFilePath);
            if (outputFile.exists()) {
                outputFile.delete();
            }
            CsvWriter csvWriter = new CsvWriter(new FileWriter(outputFilePath, true), ',');
            csvWriter.write("\u001BLeadership Name");
            csvWriter.write("\u001BPosition");
            csvWriter.write("\u001BDescription");
            csvWriter.endRecord();
            for (int i = 0; i < count; i++) {
                csvWriter.write(leaderShipNames.get(i).getText());
                csvWriter.write(leaderShipPositions.get(i).getText());
                csvWriter.write(leaderShipDescriptions.get(i).getText());
                csvWriter.endRecord();
            }
            csvWriter.close();
            FileUtil.LOGGER
                    .info("Successfully saved leadership details to .csv file in output folder");
        } catch (IOException e) {
            FileUtil.LOGGER.info("leaderShipDetails.csv file not found");
        }
    }

    /**
     * Verifies if leadership team page is displayed
     */
    public void verifyLeadershipTeamPage() {
        if (FileUtil.driver.findElement(leaderShipDetails).isDisplayed()) {
            FileUtil.LOGGER.info("Leadership team page is displayed successfully");
        } else {
            FileUtil.LOGGER.info("Leadership team page is not displayed");
        }
    }
}
