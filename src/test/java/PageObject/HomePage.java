package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import util.FileUtil;

public class HomePage {
    
    /**
     * Object repository for Home Page
     */
    private static final By gotIt = By.linkText("GOT IT");
    protected static final By ourStory = By.linkText("Our Story");
    
    /**
     * Method to access application home page 
     */
    public void getApplicationURL() {
        String url = FileUtil.prop.getProperty("homePageUrl");
        FileUtil.driver.get(url);
        FileUtil.wait.until(ExpectedConditions.visibilityOfElementLocated(ourStory));
        FileUtil.driver.manage().window().maximize();
        FileUtil.driver.findElement(gotIt).sendKeys(Keys.ENTER);
        if (FileUtil.driver.findElement(ourStory).isDisplayed()) {
            FileUtil.LOGGER.info("Mailchimp homepage launched sucessfully");
        } else {
            FileUtil.LOGGER.info("Error on launching Mailchimp homepage");
        }
    }
}