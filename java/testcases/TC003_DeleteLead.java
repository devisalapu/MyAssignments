package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC003_DeleteLead extends BaseClass{
	@BeforeClass
	public void setdata() {
		  filename = "DeleteLead";
	}
	
	@Test(dataProvider = "deletedata")
	public void runEditLead(String pArea, String pNumb) throws InterruptedException {
		new LoginPage(driver)
		.enterUserName()
		.enterPassword() 
		.clickLogin()	// new HomePage()
		.clickCRMSFA() // new MyHomePage()
		.clickLeads()	// new LeadsPage()
		.clickFindLeadsDel()
		.enterPhNumDel(pArea,pNumb)
		.clickFdLeadDelete()
		.clickLdId()
		.clickDelButton()
		.checkLead()
		.enterDelID()
		.verifyDelLd();
	}	
}
