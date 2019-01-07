package stepDefn;

import PageObject.HomePage;
import cucumber.api.java.en.Given;

public class HomePageStepDefn {
    
    HomePage homePage = new HomePage();
    
    @Given("^valid mailchimp application URL$")
    public void valid_mailchimp_application_URL() throws Throwable {
        homePage.getApplicationURL();
    }
}