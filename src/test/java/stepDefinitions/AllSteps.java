package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import pages.ElementsPage;
import utilities.DriverClass;
import utilities.Parent;

import java.util.ArrayList;
import java.util.List;


public class AllSteps {
    Parent parent = new Parent();
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

    @Given("Click on login button")
    public void clickOnLoginButton() {

        ElementsPage ep = new ElementsPage();
        ep.clickFunction(ep.getLoginButton());

    }
    @And("Enter {string} and {string}")
    public void enterAnd(String email, String password) {
        parent.waitUntilVisible(ep.getLoginEmail());
        ep.sendKeysFunction(ep.getLoginEmail(),email);
        ep.sendKeysFunction(ep.getPassword(),password);
        ep.clickFunction(ep.getLog_inButton());
    }


    @When("Click on LogIn button")
    public void clickOnLogInButton() {
        ep.clickFunction(ep.getLog_inButton());
    }

    @Then("User should see a Error message")
    public void userShouldSeeASuccessfulMessage() {
        if (ep.getLoginEmail().equals("a.smith@gmail.com") && ep.getLoginPassword().equals("Qwerty12")) {
            Assert.assertTrue(ep.getMyAccButton().isEnabled());
            ep.clickFunction(ep.getLogout());
        } else {
            ep.verifyContainsText(ep.getLoginErrorMsg(), "Login was unsuccessful. Please correct the errors and try again.");
        }
    }


    @Given("All menus and submenus")
    public void allMenusAndSubmenus() {
        Assert.assertTrue(ep.getHeaderMenu().isEnabled());
        ep.hoverFunction(ep.getComputers());
        ep.clickFunction(ep.getDesktop());
        Assert.assertTrue(DriverClass.getDriver().getCurrentUrl().contains("/desktops"));
        ep.hoverFunction(ep.getComputers());
        ep.clickFunction(ep.getNotebooks());
        Assert.assertTrue(DriverClass.getDriver().getCurrentUrl().contains("/notebooks"));
        ep.hoverFunction(ep.getComputers());
        ep.clickFunction(ep.getSoftware());
        Assert.assertTrue(DriverClass.getDriver().getCurrentUrl().contains("/software"));
        ep.hoverFunction(ep.getElectronics());
        ep.clickFunction(ep.getCameraAndPhoto());
        Assert.assertTrue(DriverClass.getDriver().getCurrentUrl().contains("/camera-photo"));
        ep.hoverFunction(ep.getElectronics());
        ep.clickFunction(ep.getCellPhone());
        Assert.assertTrue(DriverClass.getDriver().getCurrentUrl().contains("/cell-phones"));
        ep.hoverFunction(ep.getElectronics());
        ep.clickFunction(ep.getOthers());
        Assert.assertTrue(DriverClass.getDriver().getCurrentUrl().contains("/others"));
        ep.hoverFunction(ep.getApparel());
        ep.clickFunction(ep.getShoes());
        Assert.assertTrue(DriverClass.getDriver().getCurrentUrl().contains("/shoes"));
        ep.hoverFunction(ep.getApparel());
        ep.clickFunction(ep.getClothing());
        Assert.assertTrue(DriverClass.getDriver().getCurrentUrl().contains("/clothing"));
        ep.hoverFunction(ep.getApparel());
        ep.clickFunction(ep.getAccessories());
        Assert.assertTrue(DriverClass.getDriver().getCurrentUrl().contains("/accessories"));
        ep.clickFunction(ep.getComputers());
        Assert.assertTrue(DriverClass.getDriver().getCurrentUrl().contains("/computers"));
        ep.clickFunction(ep.getElectronics());
        Assert.assertTrue(DriverClass.getDriver().getCurrentUrl().contains("/electronics"));
        ep.clickFunction(ep.getApparel());
        Assert.assertTrue(DriverClass.getDriver().getCurrentUrl().contains("/apparel"));
        ep.clickFunction(ep.getDigitalDownloads());
        Assert.assertTrue(DriverClass.getDriver().getCurrentUrl().contains("/digital-downloads"));
        ep.clickFunction(ep.getBooks());
        Assert.assertTrue(DriverClass.getDriver().getCurrentUrl().contains("/books"));
        ep.clickFunction(ep.getJewelry());
        Assert.assertTrue(DriverClass.getDriver().getCurrentUrl().contains("/jewelry"));
        ep.clickFunction(ep.getGiftCards());
        Assert.assertTrue(DriverClass.getDriver().getCurrentUrl().contains("/gift-cards"));
    }


    @Given("I am on the homepage of the website")
    public void navigate_to_nopcommerce_web_site() {
        DriverClass.getDriver().get("https://demo.nopcommerce.com/");
    }

    @When("I list the products in the platform's tab menu")
    public void listProductsInTabMenu() {
        for (WebElement tabMenu : ep.getListheader()) {
            System.out.println(tabMenu.getText());
        }
        ep.elementfindersText(ep.getComputers());
        ep.elementfindersText(ep.getElectronics());
        ep.elementfindersText(ep.getApparel());
    }

    @When("I perform a product search for {string}")
    public void performProductSearch(String elements) {
        ep.getSearch().sendKeys(elements, Keys.ENTER);
    }

    @Then("I verify whether the product is included in the listed items")
    public void verifyProductInList() throws InterruptedException {
        int randomSelect = ElementsPage.RandomGenerator(ep.getProductTitle().size());
        wait(10);

        List<String> stringList = new ArrayList<>();
        for (WebElement element : ep.getProductTitle()) {
            stringList.add(element.getText());
        }
        new Actions(DriverClass.getDriver()).scrollByAmount(200, 0);
        ep.getProductTitle().get(randomSelect).click();
        org.junit.Assert.assertTrue("Item not found", stringList.contains(ep.getProductName().getText()));
    }
}