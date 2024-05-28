package Test.demoqa;

import org.testng.annotations.Test;


import com.Demoqa.pom.ElementField;
import com.genericfile.demoqa.BsCls;

public class ElementTest extends BsCls {

	
	@Test
	public void TestElem() {
		
		ElementField e = new ElementField();
		e.getTextboxbtn().click();
		e.getFullNamebtn().sendKeys("QA Tester");
		e.getEmailbtn().sendKeys("Qatester11@gmail.com");
		e.getCurrentAddressbtn().sendKeys("SSV Mandir");
		e.getPermanentAddressbtn().sendKeys("SSV Mandir Dhurwa");
		e.getSubmitbtn().click();
	
	}
	
	
}
