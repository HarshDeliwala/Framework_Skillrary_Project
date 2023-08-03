package Scripts;

import org.testng.annotations.Test;

import genericLibrary.BaseClass;
import pomPages.AddToCartPage;
import pomPages.SkillaryLoginPage;
import pomPages.SkillraryDemologinPage;

public class TestCase1 extends BaseClass
{
	@Test
	public void tc1()
	{
		
		SkillaryLoginPage s=new SkillaryLoginPage(driver);
		s.gearsbutton();
		s.skillrarydemoapplication();
		util.switchingtabs(driver);
		SkillraryDemologinPage sd=new SkillraryDemologinPage(driver);
		util.mouseHover(driver, sd.getCoursetab());
		sd.seleniumtrainingtab();
		AddToCartPage atc=new AddToCartPage(driver);
		util.doubleClick(driver, atc.getAddbtn());
		atc.carttocartbtn();
		util.alertPopup(driver);
		
	}
	

}
