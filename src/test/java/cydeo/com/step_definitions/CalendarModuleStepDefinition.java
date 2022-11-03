package cydeo.com.step_definitions;

import cydeo.com.pages.CalendarPage;
import cydeo.com.pages.LoginPage;
import cydeo.com.utilities.ConfigurationReader;
import cydeo.com.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalendarModuleStepDefinition {

    LoginPage loginPage = new LoginPage();
    CalendarPage calendarPage = new CalendarPage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);


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

    @And("User clicks on the Calendar module")
    public void userClicksOnTheCalendarModule() {
        calendarPage.calendarModule.click();
    }

    @And("User clicks on the calendar icon")
    public void userClicksOnTheCalendarIcon() {
        calendarPage.calendarIcon.click();
    }

    // Daily Calendar view
    @And("User clicks on the Day option")
    public void userClicksOnTheDayOption() {
        calendarPage.dayOption.click();
    }

    @Then("Daily calendar view should be displayed")
    public void dailyCalendarViewShouldBeDisplayed() {
        Assert.assertTrue(calendarPage.dailyCalendarView.isDisplayed());
    }

    // Weekly calendar view
    @And("User clicks on the Week option")
    public void userClicksOnTheWeekOption() {
        calendarPage.weekOption.click();
    }

    @Then("Weekly calendar view should be displayed")
    public void weeklyCalendarViewShouldBeDisplayed() {
        Assert.assertTrue(calendarPage.weeklyCalendarView.isDisplayed());
    }

    // Monthly calendar view
    @And("User clicks on the Month option")
    public void userClicksOnTheMonthOption() {
        calendarPage.monthOption.click();
    }

    @Then("Monthly calendar view should be displayed")
    public void monthlyCalendarViewShouldBeDisplayed() {
        Assert.assertTrue(calendarPage.monthlyCalendarView.isDisplayed());
    }

    // New event
    @And("User clicks on the +New event option")
    public void userClicksOnTheNewEventOption() {
        calendarPage.newEventButton.click();
    }

    @And("User enters event title")
    public void userEntersEventTitle() {
        calendarPage.inputEventTitle.sendKeys("My event");
    }

    @And("User enters valid starting date and time")
    public void userEntersValidStartingDateAndTime() {
        calendarPage.inputStartingDate.click();
        wait.until(ExpectedConditions.elementToBeClickable(calendarPage.selectNewEventStartingTimeHour));
        calendarPage.selectNewEventStartingTimeHour.click();
       // wait.until(ExpectedConditions.elementToBeClickable(calendarPage.selectNewEventStartingTimeMinutes));
        calendarPage.selectNewEventStartingTimeMinutes.click();
        calendarPage.pickDateButton.click();
        calendarPage.selectNewEventStartingDate.click();
        calendarPage.okButtonNewEvent.click();

    }

    @And("User enters valid ending date and time")
    public void userEntersValidEndingDateAndTime() throws InterruptedException {
        calendarPage.inputEndingDate.click();
       // wait.until(ExpectedConditions.elementToBeClickable(calendarPage.selectNewEventEndingTimeHour));
        Thread.sleep(2000);
        calendarPage.selectNewEventEndingTimeHour.click();
        calendarPage.selectNewEventEndingTimeMinutes.click();
        calendarPage.pickDateButton.click();
        calendarPage.selectNewEventEndingDate.click();
        calendarPage.okButtonNewEvent.click();
    }

    @And("User clicks on the Save button")
    public void userClicksOnTheSaveButton() {
        calendarPage.saveButtonNewEvent.click();
    }


    @Then("User can see the new event on the monthly calendar view")
    public void userCanSeeTheNewEventOnTheMonthlyCalendarView() {
        calendarPage.newEventLink.isDisplayed();
        calendarPage.newEventLink.click();
        calendarPage.newEventPopUpWindow.isDisplayed();
    }

    // delete an event
    @And("User clicks on the created new event through the monthly calendar view")
    public void userClicksOnTheCreatedNewEventThroughTheMonthlyCalendarView() {
        calendarPage.newEventLink.click();
    }

    @And("User clicks on the More option")
    public void userClicksOnTheMoreOption() {
        calendarPage.moreOptionNewEvent.click();
    }

    @And("User clicks on the ... option")
    public void userClicksOnTheOption() {
        calendarPage.threeDotsOptionNewEvent.click();
    }


    @Then("User clicks on the delete option and deletes the event")
    public void userClicksOnTheDeleteOptionAndDeletesTheEvent() {
        calendarPage.deleteOptionNewEvent.click();
    }

    @And("User clicks on the File icon")
    public void userClicksOnTheFileIcon() {

        calendarPage.filesIcon.click();
    }

    @And("User clicks on the ... on the file")
    public void userClicksOnTheOnTheFile() throws InterruptedException {
        calendarPage.threeDotsFile.click();
        Thread.sleep(2000);
    }

    @And("User clicks on Rename")
    public void userClicksOnRename() throws InterruptedException {
        calendarPage.renameButton.click();
        Thread.sleep(2000);
    }

    @Then("User pass a new name")
    public void userPassANewName() {
        calendarPage.inputRenameFile.sendKeys("ElnurFile");
    }
}
