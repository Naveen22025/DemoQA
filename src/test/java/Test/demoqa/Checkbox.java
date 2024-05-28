package Test.demoqa;

import org.testng.annotations.Test;

import com.Demoqa.pom.CheckboxField;
import com.Demoqa.pom.ElementField;
import com.genericfile.demoqa.BsCls;

public class Checkbox extends BsCls{

	
	@Test
	public void Checkbox() {
		
		CheckboxField b = new CheckboxField(driver);
		b.getCheckboxbtn().click();
		b.getPlusbtn().click();
		b.getCheckbtn().click();
		
	}
}
