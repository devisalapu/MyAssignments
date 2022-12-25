package testcases;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.LoginPage;

public class TC002_EditLead extends BaseClass{

	@BeforeClass
	public void setdata() {
		  filename = "EditLead";
	}
	
	@Test(dataProvider = "editdata")
	public void runEditLead(String fstName, String cmpName) throws InterruptedException {
		new LoginPage(driver)
		.enterUserName()
		.enterPassword() 
		.clickLogin()	// new HomePage()
		.clickCRMSFA() // new MyHomePage()
		.clickLeads()	// new LeadsPage()
		.clickFindLeads()
		.enterfNameEdit(fstName)
		.clickFdLead()
		.clickLeadid()
		.verifyLead()
		.clickEdit()
		.clearcmpname()
		.entercmpname(cmpName)
		.clickUpdate()
		.checkcmpname();
	}
}
