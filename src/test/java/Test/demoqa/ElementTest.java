package Test.demoqa;

import org.testng.annotations.Test;


import com.Demoqa.pom.ElementField;
import com.genericfile.demoqa.BsCls;

public class ElementTest extends BsCls {

	
	@Test
	public void TestElem() {
		
		ElementField e = new ElementField(driver);
		e.getTextboxbtn().click();
		e.getFullNamebtn().sendKeys("QA Tester");
	}
}
