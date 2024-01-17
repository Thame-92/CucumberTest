package org.step;

import java.io.IOException;

import org.global.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.page.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepClass extends BaseClass {
	public static BaseClass b = new BaseClass();
	public static LoginPage l = new LoginPage();

	@Given("User should be in Login page")
	public void login_page() throws IOException {
		try {
			b.getDriver(b.excelRead(1, 5));

			System.out.println("Chrome Browser Launched Successfully");
		} catch (Exception e) {
			System.out.println("Browser Not launched" + e.getMessage());
		}
		try {
			b.getUrl(b.excelRead(1, 3));

			System.out.println("Url Launched successfully");
			b.excel_write(1, 2, "Pass");
		} catch (Exception e) {
			System.out.println("Url Not launched" + e.getMessage());
			b.excel_write(1, 2, "Fail");
		}
		driver.manage().window().maximize();

	}

	@When("User should enter the login credentials")
	public void login_credentials() throws IOException, InterruptedException {
		try {
			l = new LoginPage();
			WebElement username = l.getUsername();
			username.sendKeys(b.excelRead(4, 0));
			WebElement password = l.getPassword();
			password.sendKeys(b.excelRead(4, 1));
			b.excel_write(2, 2, "Pass");
			System.out.println("Credentials are Entered Successfully");
		} catch (Exception e) {
			System.out.println("Credentials are Not Entered" + e.getMessage());
			b.excel_write(2, 2, "Fail");
		}
		Thread.sleep(2000);
	}

	@When("User should click the login button")
	public void click_login_button() throws IOException, InterruptedException {
		try {
			l = new LoginPage();
			WebElement login = l.getLogin();
			login.click();
			b.excel_write(3, 2, "Pass");
			System.out.println("Login Button Clicked Successfully");
		} catch (Exception e) {
			System.out.println("Login Button Not Clicked" + e.getMessage());
			b.excel_write(3, 2, "Fail");
		}
		Thread.sleep(2000);
	}

	@Then("User should validate the login success message")
	public void Navigate_to_Hotel_booking_page_success_message() throws IOException {
		System.out.println("login success and Navigated to Hotel booking page");
		b.excel_write(4, 2, "Pass");
	}

	// SearchHotelPage

	@When("Selecting the Location")
	public void selecting_the_location() throws InterruptedException {

		try {
			l = new LoginPage();
			WebElement location = l.getLocaion();
			b.selectByIndex(location, 6);
			System.out.println("Location selected Successfully");

		} catch (Exception e) {

			System.out.println("Location Not selected" + e.getMessage());
		}
		
		Thread.sleep(2000);
	}

	@When("Selecting the HotelName")
	public void selecting_the_hotel_name() throws InterruptedException {

		try {
			l = new LoginPage();
			WebElement selectlocation = l.Selectlocation;
			b.selectByvalue(selectlocation, "Hotel Sunshine");
			System.out.println("Hotel Name selected Successfully");
		} catch (Exception e) {

			System.out.println("Hotel Name Not selected " + e.getMessage());
		}
		Thread.sleep(2000);
	}

	@When("Selecting the RoomType")
	public void selecting_the_room_type() throws InterruptedException {

		try {
			l = new LoginPage();
			WebElement roomType = l.RoomType;
			b.selectByvalue(roomType, "Super Deluxe");
			System.out.println("RoomType selected Successfully");
		} catch (Exception e) {

			System.out.println("RoomType Not selected" + e.getMessage());
		}
		Thread.sleep(2000);
	}

	@When("Selecting the NumberOfRooms")
	public void selecting_the_number_of_rooms() {

		try {
			l = new LoginPage();
			WebElement numberOfRooms = l.NumberOfRooms;
			b.selectByIndex(numberOfRooms, 3);
			System.out.println("Number Of Room selected Successfully");
		} catch (Exception e) {

			System.out.println("Number Of Room Not selected" + e.getMessage());
		}
	}

	@Then("Provide the CheckInDate")
	public void provide_the_check_in_date() throws InterruptedException {

		try {
			l = new LoginPage();
			WebElement checkInDate = l.CheckInDate;
			checkInDate.sendKeys("08/01/2024");
			System.out.println("Check In Date entered Successfully");
		} catch (Exception e) {
			System.out.println("Check In Date Not entered Successfully" + e.getMessage());

		}
		Thread.sleep(2000);
	}

	@Then("Provide the CheckOutDate")
	public void provide_the_check_out_date() throws InterruptedException {
		try {
			l = new LoginPage();
			WebElement checkOutDate = l.CheckOutDate;
			checkOutDate.sendKeys("12/01/2024");
			System.out.println("Check Out Date entered Successfully");
		} catch (Exception e) {
			System.out.println("Check Out Date Not entered " + e.getMessage());

		}
		Thread.sleep(2000);
	}

	@Then("Adding the AdultsPerRoom")
	public void adding_the_adults_per_room() {

		try {
			l = new LoginPage();
			WebElement adultRoom = l.AdultRoom;
			b.selectByvalue(adultRoom, "2");
			System.out.println("Adult Room selected Successfully");
		} catch (Exception e) {

			System.out.println("Adult Room Not selected " + e.getMessage());
		}
	}

	@Then("Adding the ChildPerRoom")
	public void adding_the_child_per_room() {
		WebElement ChildPerRoom = driver.findElement(By.id("child_room"));
		Select S5 = new Select(ChildPerRoom);
		S5.selectByValue("0");

		try {
			l = new LoginPage();
			WebElement childRoom = l.ChildRoom;
			b.selectByvalue(childRoom, "0");
			System.out.println("Child Room selected Successfully");
		} catch (Exception e) {

			System.out.println("Child Room Not Selected" + e.getMessage());
		}
	}

	@Then("Click the SearchButton")
	public void click_the_search_button() throws InterruptedException {

		try {
			l = new LoginPage();
			WebElement searchbutton = l.Searchbutton;
			searchbutton.click();
			System.out.println("Search Button Clicked Successfully");
		} catch (Exception e) {
			System.out.println("Search Button Not Clicked" + e.getMessage());
		}
		Thread.sleep(2000);
	}

	@Then("Customer shoud Navigate in success to the NextPage")
	public void customer_shoud_navigate_in_success_to_the_next_page() throws IOException {
		System.out.println("Search Hotel Page was in successfully Navigated to Confirm Hotel Selection page");

	}

	// SelectHotelPage
	@When("Selecting the Radio Button")
	public void selecting_the_radio_button() throws InterruptedException {

		try {
			l = new LoginPage();
			WebElement clickRaiobutton = l.ClickRaiobutton;
			clickRaiobutton.click();

			System.out.println("Confirm Radio Button Clicked Successfully");
		} catch (Exception e) {
			System.out.println("Confirm Radio Button Not Clicked" + e.getMessage());
		}
		Thread.sleep(2000);
	}

	@Then("Click the continue button")
	public void click_the_continue_button() throws InterruptedException {
		try {
			l = new LoginPage();
			WebElement clickContinuebutton = l.ClickContinuebutton;
			clickContinuebutton.click();
			System.out.println("Continue Button Clicked Successfully");
		} catch (Exception e) {
			System.out.println("Continue Button Not Clicked Successfully" + e.getMessage());
		}
		Thread.sleep(2000);

	}

	@Then("User should navigated to Book a hotel page")
	public void user_should_navigated_to_book_a_hotel_page() throws InterruptedException {

		System.out.println("Select Hotel Page was in successfully Navigated to Book a Hotel page");

	}

	// Booking Page

	@Given("USer to enter firstname")
	public void u_ser_to_enter_firstname() throws InterruptedException {
		try {
			l = new LoginPage();
			WebElement firstName = l.FirstName;
			firstName.sendKeys(b.excelRead(4, 7));
			System.out.println("First Name Entered Successfully");
		} catch (Exception e) {
			System.out.println("First Name Not Entered" + e.getMessage());
		}
		Thread.sleep(1000);
	}

	@Given("USer to enter lastname")
	public void u_ser_to_enter_lastname() throws InterruptedException {
		try {
			l = new LoginPage();
			WebElement lastName = l.LastName;
			lastName.sendKeys(b.excelRead(4, 8));
			System.out.println("Last Name Entered Successfully");
		} catch (Exception e) {
			System.out.println("Last Name Not Entered" + e.getMessage());
		}
		Thread.sleep(1000);
	}

	@When("User to enter billing address")
	public void user_to_enter_billing_address() throws InterruptedException {
		try {
			l = new LoginPage();
			WebElement billingAddress = l.BillingAddress;
			billingAddress.sendKeys(b.excelRead(4, 9));
			System.out.println("Billing Address Entered Successfully");
		} catch (Exception e) {
			System.out.println("Billing address NotEntered" + e.getMessage());
		}
		Thread.sleep(2000);
	}

	@When("user to enter credit card {int} digit number")
	public void user_to_enter_credit_card_digit_number(Integer int1) throws InterruptedException {
		try {
			l = new LoginPage();
			WebElement creditCardNo = l.CreditCardNo;
			creditCardNo.sendKeys(b.excelRead(4, 10));
			System.out.println("Credit_Card_No Entered Successfully");
		} catch (Exception e) {
			System.out.println("Credit_Card_No Not Entered" + e.getMessage());
		}
		Thread.sleep(2000);
	}

	@When("user to enter type of credit card")
	public void user_to_enter_type_of_credit_card() {
		try {
			l = new LoginPage();
			WebElement creditCardType = l.CreditCardType;
			b.selectByIndex(creditCardType, 1);
			System.out.println("Credit_Card_Type Selected Successfully");
		} catch (Exception e) {
			System.out.println("Credit_Card_Type Not Selected" + e.getMessage());
		}
	}

	@Then("user to selecte card expiry month and expiry year")
	public void user_to_selecte_card_expiry_month_and_expiry_year() throws InterruptedException {
		try {
			l = new LoginPage();
			WebElement expiryMonth = l.ExpiryMonth;
			b.selectByIndex(expiryMonth, 4);
			WebElement expiryYear = l.ExpiryYear;
			b.selectByvalue(expiryYear, "2029");
			System.out.println("Expiry Month and Year Selected successfully");
		} catch (Exception e) {
			System.out.println("Expiry Month and Year Not Selected" + e.getMessage());
		}
		Thread.sleep(2000);
	}

	@Then("user to enter cvv number")
	public void user_to_enter_cvv_number() throws InterruptedException {
		try {
			l = new LoginPage();
			WebElement cvvNumber = l.CvvNumber;
			cvvNumber.sendKeys(b.excelRead(4, 11));
			System.out.println("CVV Number Entered successfully");
		} catch (Exception e) {
			System.out.println("CVV Number Not Entered" + e.getMessage());
		}
		Thread.sleep(1000);
	}

	@Then("User to click the booknow button")
	public void user_to_click_the_booknow_button() throws InterruptedException {
		try {
			l = new LoginPage();
			WebElement bookNow = l.BookNow;
			bookNow.click();
			System.out.println("BookNow Button clicked successfully");
		} catch (Exception e) {
			System.out.println("BookNow Button Not clicked" + e.getMessage());
		}
		Thread.sleep(3000);
	}

	@And("User should Navigated to Booking ticket confiramtion page")
	
	public void Booking_ticket_confiramtion_page() throws IOException, InterruptedException {
		{
			System.out.println("successfully navigated to confirmation page");
		}
		
		//		
//		try {
//			l = new LoginPage();
//			WebElement orderNumber = l.getOrderNumber();
//			String Booking_Confirmation_Number = orderNumber.getAttribute("Value");
//			b.excel_write(5, 2, "Pass");
//			System.out.println(
//					"Customer Booking Confirmation No:" + orderNumber.getAttribute(Booking_Confirmation_Number));
//		} catch (Exception e) {
//
//			b.excel_write(5, 2, "Fail");
//			System.out.println("Booking confirmation ticket Not Generated " + e.getMessage());
//		}
//		Thread.sleep(3000);
//
//	}
	driver.close();
	}
}