package com.Demoqa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElementField {

	@FindBy(xpath="//span[text()='Text Box']")
	private WebElement Textboxbtn;
	
	@FindBy(id="userName")
	private WebElement FullNamebtn;
	
	@FindBy(id="userEmail")
	private WebElement Emailbtn;
	
	@FindBy(id="currentAddress")
	private WebElement CurrentAddressbtn;
	
	@FindBy(id="permanentAddress")
	private WebElement PermanentAddressbtn;
	
	@FindBy(xpath="//button[text()='Submit']")
	private WebElement Submitbtn;
	
	

	public WebElement getTextboxbtn() {
		return Textboxbtn;
	}

	public WebElement getFullNamebtn() {
		return FullNamebtn;
	}

	public WebElement getEmailbtn() {
		return Emailbtn;
	}

	public WebElement getCurrentAddressbtn() {
		return CurrentAddressbtn;
	}

	public WebElement getPermanentAddressbtn() {
		return PermanentAddressbtn;
	}

	public WebElement getSubmitbtn() {
		return Submitbtn;
	}


	
}
