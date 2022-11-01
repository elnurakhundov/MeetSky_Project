package cydeo.com.pages;

import cydeo.com.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalendarPage {
    public CalendarPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@aria-label='Calendar'][1]")
    public WebElement calendarModule;

    @FindBy(xpath = "(//div[contains(@class,'v-popover')])[2]")
    public WebElement calendarIcon;

    @FindBy(xpath = "//span[.='Day']")
    public WebElement dayOption;

    @FindBy(css = "div.fc-timegrid.fc-timeGridDay-view.fc-view")
    public WebElement dailyCalendarView;

    @FindBy(xpath = "//span[.='Week']")
    public WebElement weekOption;

    @FindBy(css = "div.fc-timegrid.fc-timeGridWeek-view.fc-view")
    public WebElement weeklyCalendarView;

    @FindBy(xpath = "//span[.='Month']")
    public WebElement monthOption;

    @FindBy(css = "div.fc-daygrid.fc-dayGridMonth-view.fc-view")
    public WebElement monthlyCalendarView;

    @FindBy(css = "button.button.primary.new-event")
    public WebElement newEventButton;

    @FindBy(xpath = "//input[@placeholder='Event title']")
    public WebElement inputEventTitle;

    @FindBy(xpath = ("(//input[@name='date'])[2])"))
    public WebElement inputStartingDate;


    @FindBy(xpath = "//li[@data-index='12']")
    public WebElement selectNewEventStartingTimeHour;

    @FindBy(xpath = "(//li[@data-index='0'])[2]")
    public WebElement selectNewEventStartingTimeMinutes;

    @FindBy(xpath = "//button[@class='mx-btn mx-btn-text']")
    public WebElement pickDateButton;

    @FindBy (xpath = "//td[@title='2022-11-02']")
    public WebElement selectNewEventStartingDate;


    @FindBy(xpath = "//button[@class='mx-btn mx-datepicker-btn-confirm']")
    public WebElement OkButtonAfterSelectingStartingDate;

    @FindBy(xpath = ("(//input[@name='date'])[3])"))
    public WebElement inputEndingDate;



}
