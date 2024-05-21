package com.genericfile.demoqa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileLib {

	public String PropertyFile(String key) throws IOException {

		FileInputStream fis = new FileInputStream("./src/test/resources/details");
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}

	public String Exceldata(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/main/resources/details");
		Workbook wb = WorkbookFactory.create(fis);
		String value = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}

	public void SetExceldata(String sheet, int row, int cell) throws EncryptedDocumentException, IOException {

		FileInputStream fis = new FileInputStream("./src/main/resources/details");
		Workbook wb = WorkbookFactory.create(fis);
		wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue("Pass");

		FileOutputStream fos= new FileOutputStream("./src/main/resources/details");
		wb.write(fos);
		wb.close();
	}

	public void SelectText(WebElement element, String text) {

		Select s = new Select(element);
		s.selectByVisibleText(text);
	}

	public void SelectIndex(WebElement element, int index) {

		Select s = new Select(element);
		s.selectByIndex(index);
	}

	public void Actiondouble(WebDriver driver, WebElement click) {

		Actions a = new Actions(driver);
		a.doubleClick(click).perform();
    }
	
	public void Actionmove(WebDriver driver, WebElement move) {

		Actions a = new Actions(driver);
		a.doubleClick(move).perform();
    }
	
	public void Explicit(WebDriver driver, WebElement element, Duration i) {
		
		WebDriverWait wait = new WebDriverWait(driver, i);
		wait.until(ExpectedConditions.visibilityOf(element));	
	}
	
	public void WindowsHandle(WebDriver driver) {
		
		Set<String> Allwh = driver.getWindowHandles();
		Iterator<String> it = Allwh.iterator();
		String Parentwh = it.next();
		String Childwh = it.next();
		driver.switchTo().window(Parentwh);
		driver.close();
		driver.switchTo().window(Childwh);
	}
}
