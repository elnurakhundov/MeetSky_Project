package cydeo.com.step_definitions;

import cydeo.com.pages.LoginPage;
import cydeo.com.utilities.ConfigurationReader;
import cydeo.com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalendarModuleStepDefinition {

    LoginPage loginPage = new LoginPage();


    @Given("User navigates to the login page")
    public void userNavigatesToTheLoginPage() {
        String url = ConfigurationReader.getProperty("MeetSkyUrl");
        Driver.getDriver().get(url);
    }

    @When("User log in with valid credentials")
    public void userLogInWithValidCredentials() {
        String username = ConfigurationReader.getProperty("username");
        String password = ConfigurationReader.getProperty("password");
        loginPage.inputUsername.sendKeys(username);
        loginPage.inputPassword.sendKeys(password);
        loginPage.LogInButton.click();
    }

    @When("User clicks on the Calendar module")
    public void userClicksOnTheCalendarModule() {
    }

    @And("User clicks on the calendar icon")
    public void userClicksOnTheCalendarIcon() {
    }

    // Daily Calendar view
    @And("User clicks on the Day option")
    public void userClicksOnTheDayOption() {
    }

    @Then("Daily calendar view should be displayed")
    public void dailyCalendarViewShouldBeDisplayed() {
    }

    // Weekly calendar view
    @And("User clicks on the Week option")
    public void userClicksOnTheWeekOption() {
    }

    @Then("Weekly calendar view should be displayed")
    public void weeklyCalendarViewShouldBeDisplayed() {
    }

    // Monthly calendar view
    @And("User clicks on the Month option")
    public void userClicksOnTheMonthOption() {
    }

    @Then("Monthly calendar view should be displayed")
    public void monthlyCalendarViewShouldBeDisplayed() {
    }

    // New event
    @And("User clicks on the +New event option")
    public void userClicksOnTheNewEventOption() {
    }

    @And("User enters event title")
    public void userEntersEventTitle() {
    }

    @And("User enters valid starting date and time")
    public void userEntersValidStartingDateAndTime() {
    }

    @And("User enters valid ending date and time")
    public void userEntersValidEndingDateAndTime() {
    }

    @And("User clicks on the Save button")
    public void userClicksOnTheSaveButton() {
    }

    @Then("User is able to create a new event")
    public void userIsAbleToCreateANewEvent() {
    }

    @Then("User can see the new event on the monthly calendar view")
    public void userCanSeeTheNewEventOnTheMonthlyCalendarView() {
    }

    // delete an event
    @And("User clicks on the created new event through the monthly calendar view")
    public void userClicksOnTheCreatedNewEventThroughTheMonthlyCalendarView() {
    }

    @And("User clicks on the More option")
    public void userClicksOnTheMoreOption() {
    }

    @And("User clicks on the ... option")
    public void userClicksOnTheOption() {
    }

    @And("User clicks on the delete option")
    public void userClicksOnTheDeleteOption() {
    }

    @Then("User is able to delete the event")
    public void userIsAbleToDeleteTheEvent() {
    }


}
