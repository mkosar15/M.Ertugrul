package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.ElementsPage;
import utilities.DriverClass;

public class AllSteps {
    ElementsPage ep = new ElementsPage();
    
    @Given("Navigate to Nopcommerce Web Site")
    public void navigate_to_nopcommerce_web_site() {
        DriverClass.getDriver().get("https://demo.nopcommerce.com/");
    }
    
    @Given("Click on Register Link")
    public void click_on_register_link() {
        ep.clickFunction(ep.getRegister());
    }
    
    @Given("Fill the form")
    public void fill_the_form() {
        ep.clickFunction(ep.getGender());
        ep.sendKeysFunction(ep.getFirstname(), "Adam");
        ep.sendKeysFunction(ep.getLastname(), "Smith");
        ep.selectElement(ep.getDay(), "24");
        ep.selectElement(ep.getMonth(), "3");
        ep.selectElement(ep.getYear(), "1933");
        ep.sendKeysFunction(ep.getEmail(), "a.smith@gmail.com");
        ep.sendKeysFunction(ep.getCompany(), "Techno Market");
        ep.sendKeysFunction(ep.getPassword(), "Qwerty12");
        ep.sendKeysFunction(ep.getConfirmPassword(), "Qwerty12");
    }
    
    @When("Click on REGISTER Button")
    public void click_on_register_button() {
        ep.clickFunction(ep.getButton());
    }
    
    @Then("The user should see a message confirming the successful registration")
    public void the_user_should_see_a_message_confirming_the_successful_registration() {
        try {
            Assert.assertTrue(ep.getRegMessage().getText().contains("registration completed"));
            ep.clickFunction(ep.getContine());
        } catch (Exception e) {
            Assert.assertTrue(ep.getRegErrorMessage().getText().contains("The specified email already exists"));
        }
    }
    
    @And("Click on Login Link")
    public void clickOnLoginLink() {
        ep.clickFunction(ep.getLoginButton());
    }
    
    @And("Enter email and password")
    public void enterEmailAndPassword() {
        ep.sendKeysFunction(ep.getLoginEmail(), "a.smith@gmail.com");
        ep.sendKeysFunction(ep.getLoginPassword(), "Qwerty12");
    }
    
    @When("Click on LOG IN Button")
    public void clickOnLOGINButton() {
        ep.clickFunction(ep.getLog_inButton());
    }
    
    @Then("The user should successfully log in")
    public void theUserShouldSuccessfullyLogIn() {
        Assert.assertTrue(ep.getMyAccButton().isEnabled());
        ep.clickFunction(ep.getLogout());
    }
}

