package com.cucumberFramework.stepdefinitions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import com.cucumberFramework.helper.WaitHelper;
import com.cucumberFramework.pageObjects.LoginLogoutPage;
import com.cucumberFramework.testBase.TestBase;
import com.sun.tools.sjavac.Log;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class loginLogoutPageStepDefinitions extends TestBase {

	LoginLogoutPage loginPage = new LoginLogoutPage(driver);
	WaitHelper waitHelper = new WaitHelper(driver);
	
	@Given("^I am on the home page \"([^\"]*)\"$")
	public void i_am_on_the_homePage(String arg1) throws Throwable {
		driver.get(arg1);
		
	}
	
	@Then("^I see Welcome to the Simple Travel Ageny! on homePage$")
	
	public void i_see_something_onHomePage() throws Throwable
	{
		loginPage.homePageText.isDisplayed();
		
	}
	
	@Then("^I see Choose your departure city and Choose your destination city on page$")
	public void i_see_choose_departureand_destinationCity() throws Throwable
	{
		
		loginPage.departureCityText.isDisplayed();
		loginPage.destinationCityText.isDisplayed();
		
	}
	
	
	@And("^I select \"([^\"]*)\" city as \"([^\"]*)\"$")
	public void i_select_departure_and_destinationCity(String dropdownType,String option) throws Throwable
	{
		
		
		loginPage.SelectOption(dropdownType, option);
	}
	
	
	
	@And("^I Click on find flights$")
	public void i_clickon_find_flights() throws Throwable
	{
		
		
		loginPage.findFlights.click();
	}
	
	@And("^I am navigated to the \"([^\"]*)\" page$")
	public boolean i_am_navigated_to_correct_url(String urltext)	
	{
		
		Assert.assertTrue(loginPage.urlContainsText(urltext));
		System.out.println(urltext+" page is displayed");
		return true;
		
	}
	
	
	@And("^I choose a flight$")
	public void i_choose_aflight() throws Throwable
	{
		
		if(loginPage.flightTableRows !=null && loginPage.flightTableRows.size()>0)
		{
			loginPage.findFlights.click();
			
		}
	}
	
	@And("^I enter the details and click on purchase flight$") 
	public void i_enterdetails_and_click_onPurchaseflight(DataTable details) throws Throwable 
	{
		List<List<String>> data = details.raw();
		
		loginPage.nameOfPassenger.sendKeys(data.get(0).get(0));
		loginPage.addressOfPassenger.sendKeys(data.get(0).get(1));
		loginPage.cityOfPassenger.sendKeys(data.get(0).get(2));
		loginPage.stateOfpassenger.sendKeys(data.get(0).get(3));
		loginPage.zipCode.sendKeys(data.get(0).get(4));
		loginPage.creditCardNumber.sendKeys(data.get(0).get(5));
		loginPage.nameOnCard.sendKeys(data.get(0).get(6));		
		loginPage.findFlights.click();
		
		
	}
	
	@And("^I should be seeing confirmation id field as not null$")
	public boolean i_check_ifconfirmationID_is_generated() throws Throwable
	{
		
		
		Assert.assertNotNull(loginPage.confirmationIdCell.getText()!=null);
		
		
		System.out.println("confirmation id is displayed as "+loginPage.confirmationIdCell.getText());
		
		return true;
	}
	

}