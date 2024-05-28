package com.Demoqa.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckboxField {

@FindBy(xpath="//span[text()='Check Box']")
private WebElement Checkboxbtn;

@FindBy(xpath="//button[@title='Expand all']//*[name()='svg']")
private WebElement Plusbtn;

@FindBy(xpath="//label[@for='tree-node-home']//span[@class='rct-checkbox']//*[name()='svg']")
private WebElement Checkbtn;

public CheckboxField(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getCheckboxbtn() {
	return Checkboxbtn;
}

public WebElement getPlusbtn() {
	return Plusbtn;
}

public WebElement getCheckbtn() {
	return Checkbtn;
}

	
}
