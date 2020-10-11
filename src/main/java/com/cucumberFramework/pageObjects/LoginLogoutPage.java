package com.cucumberFramework.pageObjects;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cucumberFramework.helper.WaitHelper;

public class LoginLogoutPage {
	
	private WebDriver driver;
	
//locators---------------------------------------------------------------// 	
	@FindBy(xpath="//h1[contains(text(),'Welcome to the Simple Travel Agency!')]")
	public WebElement homePageText;
	
	@FindBy(xpath="//h2[contains(text(),'Choose your departure city:')]")
	public WebElement departureCityText;
	
	@FindBy(xpath="//h2[contains(text(),'Choose your destination city:')]")
	public WebElement destinationCityText;
	
	@FindBy(name="fromPort")
	public WebElement departureDropDown;
	
	@FindBy(name="toPort")
	public WebElement destinationDropDown;
	
	@FindBy(css="input[type=submit]")
	public WebElement findFlights;
	
	@FindBy(xpath="//table/tbody/tr")
	public List<WebElement> flightTableRows;
	
	@FindBy(id="inputName")
	public WebElement nameOfPassenger;
	
	@FindBy(name="address")
	public WebElement addressOfPassenger;
	
	@FindBy(name="city")
	public WebElement cityOfPassenger;
	
	@FindBy(name="state")
	public WebElement stateOfpassenger;
	
	@FindBy(name="zipCode")
	public WebElement zipCode;
	
	@FindBy(id="creditCardNumber")
	public WebElement creditCardNumber;
	
	@FindBy(id="nameOnCard")
	public WebElement nameOnCard;
	

	@FindBy(xpath="//table/tbody/tr[1]/td[2]")
	public WebElement confirmationIdCell;
	
		
	//===================locators========================//

	WaitHelper waitHelper;
	
	public LoginLogoutPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		waitHelper = new WaitHelper(driver);
		//waitHelper.WaitForElement(userName, 60);
	}
	

	public void SelectOption(String dropdownType ,String option) {
		
		if(dropdownType.equals("departure"))
		{
		Select stat=new Select (departureDropDown);
	     stat.selectByVisibleText(option);
		}
		else
		{
			Select stat=new Select (destinationDropDown);
		     stat.selectByVisibleText(option);
			}
		
	}
	
    public boolean urlContainsText(String urltext){
    	
    	boolean isFound =driver.getCurrentUrl().indexOf(urltext)!=-1;
		
		return isFound;
		
	}
	
    
	
	
	
	
	
}
	
	
	
	//============================================================================pages=======================
	
