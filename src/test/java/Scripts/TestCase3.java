package Scripts;

import java.io.IOException;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.SkillaryLoginPage;
import pomPages.SkillraryDemologinPage;
import pomPages.TestingPage;

public class TestCase3 extends BaseClass
{
	@Test
	public void tc3() throws Throwable
	{
		SkillaryLoginPage s=new SkillaryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		util.switchingtabs(driver);
		SkillraryDemologinPage sd=new SkillraryDemologinPage(driver);
		util.dropDown(sd.getCoursedd(), pdata.getPropertyData("coursedd"));
		TestingPage tp=new TestingPage(driver);
		util.dragdrop(driver, tp.getSeleniumtraining(), tp.getCarttab());
		WebElement ele=tp.getFacebook();
		Point coOrdinates = ele.getLocation();
		int x=coOrdinates.getX();
		int y=coOrdinates.getY();
		util.scrollBar(driver, x, y);
		tp.facebookicon();
		
	}

}
