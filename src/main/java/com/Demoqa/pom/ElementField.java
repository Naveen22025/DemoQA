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
	
	public ElementField(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTextboxbtn() {
		return Textboxbtn;
	}

	public WebElement getFullNamebtn() {
		return FullNamebtn;
	}
	
}
