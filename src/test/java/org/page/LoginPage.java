package org.page;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBys({ @FindBy(id = "username"), @FindBy(xpath = "//input[@type='text']") })
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindAll({ @FindBy(how = How.ID, using = "passgdword"), @FindBy(how = How.NAME, using = "password") })
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(id = "login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}

	@FindBy(how = How.NAME, using = "location")
	public WebElement location;

	public WebElement getLocaion() {
		return location;

	}

	@FindBy(how = How.NAME, using = "hotels")
	public WebElement Selectlocation;

	public WebElement getSelectlocation() {
		return Selectlocation;

	}

	@FindBy(id = "room_type")
	public WebElement RoomType;

	public WebElement getRoomType() {
		return RoomType;

	}

	@FindBy(id = "room_nos")
	public WebElement NumberOfRooms;

	public WebElement getNumberOfRooms() {
		return NumberOfRooms;
	}

	@FindBy(xpath = "//input[@class='date_pick']")
	public WebElement CheckInDate;

	public WebElement getCheckInDate() {
		return CheckInDate;
	}

	@FindBy(xpath = "//input[@name='datepick_out']")
	public WebElement CheckOutDate;

	public WebElement getCheckOutDate() {
		return CheckInDate;
	}

	@FindBy(id = "adult_room")
	public WebElement AdultRoom;

	public WebElement getAdultRoom() {
		return AdultRoom;
	}

	@FindBy(id = "child_room")
	public WebElement ChildRoom;

	public WebElement getChildRoom() {
		return ChildRoom;
	}

	@FindBy(xpath = "//input[@type='submit']")
	public WebElement Searchbutton;

	public WebElement getSearchbutton() {
		return Searchbutton;
	}

	@FindBy(xpath = "//input[@name=\"radiobutton_0\"]")
	public WebElement ClickRaiobutton;

	public WebElement getClickRaiobutton() {
		return ClickRaiobutton;
	}

	@FindBy(name = "continue")
	public WebElement ClickContinuebutton;

	public WebElement getClickContinuebutton() {
		return ClickContinuebutton;
	}

	@FindBy(xpath="//input[@id='first_name']")
	public WebElement FirstName;

	public WebElement getFirstName() {
		return FirstName;
	}

	@FindBy(how = How.NAME, using = "last_name")
	public WebElement LastName;

	public WebElement getLastName() {
		return LastName;
	}

	@FindBy(xpath = "//textarea[@name=\"address\"]")
	public WebElement BillingAddress;

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	@FindBy(xpath = "//input[@name=\"cc_num\"]")
	public WebElement CreditCardNo;

	public WebElement getCreditCardNo() {
		return CreditCardNo;
	}

	@FindBy(how = How.NAME, using = "cc_type")
	public WebElement CreditCardType;

	public WebElement getCreditCardType() {
		return CreditCardType;
	}

	@FindBy(how = How.NAME, using = "cc_exp_month")
	public WebElement ExpiryMonth;

	public WebElement getExpiryMonth() {
		return ExpiryMonth;
	}

	@FindBy(how = How.NAME, using = "cc_exp_year")
	public WebElement ExpiryYear;

	public WebElement getExpiryYear() {
		return ExpiryYear;
	}

	@FindBy(how = How.NAME, using = "cc_cvv")
	public WebElement CvvNumber;

	public WebElement getCvvNumber() {
		return CvvNumber;
	}

	@FindBy(xpath = "//input[@class='reg_button'][1]")
	public WebElement BookNow;

	public WebElement getBookNow() {
		return BookNow;

	}
	
	@FindBy(id="order_no")
	public WebElement OrderNumber;

	public WebElement getOrderNumber() {
		return OrderNumber;

	}
}