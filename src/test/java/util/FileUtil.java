package util;

import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class FileUtil {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static Properties prop = new Properties();

    /**
     * Logger for the class
     */
    public static final Logger LOGGER = Logger.getLogger(FileUtil.class);

    /**
     * Setting initial properties to run the tests
     */
    @Before
    public void setProperty() throws IOException {
        System.setProperty("webdriver.chrome.driver",
                System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
        FileInputStream propFile = new FileInputStream(
                System.getProperty("user.dir") + "\\Testdata.properties");
        BasicConfigurator.configure();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 5);
        prop.load(propFile);
    }

    /**
     * Method to close the browser
     */
    @After(order = 1)
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    /**
     * Opens .csv file once the test execution is complete
     */
    @After(order = 2)
    public void openCSVFile() {
        try {
            Desktop.getDesktop().open(
                    new File(System.getProperty("user.dir") + "\\output\\leaderShipDetails.csv"));
        } catch (IOException e) {
            LOGGER.info("Error on trying to open .csv file");
        }
    }

    /**
     * Captures screenshot on test failure
     * 
     * @param driver
     *            Active webdriver currently under test
     */
    public static void captureScreenShot(WebDriver driver) {

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(src, new File(System.getProperty("user.dir") + "\\output\\"
                    + System.currentTimeMillis() + ".png"));
        } catch (IOException e) {
            LOGGER.info("Error on capturing screenshot");
        }
    }
}