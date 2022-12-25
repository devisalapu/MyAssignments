package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LoginPage;
import pages.MyHomePage;

public class TC001_CreateLead extends BaseClass{

	@BeforeClass
	public void setdata() {
		  filename = "CreateLead";
	}
	
   @Test(dataProvider = "createdata")
	public void runCreateLead(String cName,String fName,String lName) {
//		LoginPage lp = new LoginPage();
//		lp.enterUserName();
//		lp.enterPassword();
//		lp.clickLogin();
//		
//		HomePage hp = new HomePage();
//		hp.clickCRMSFA();
//		
//		MyHomePage mhp = new MyHomePage();
//		mhp.clickLeads();
		
		new LoginPage(driver)
		.enterUserName()
		.enterPassword() 
		.clickLogin()	// new HomePage()
		.clickCRMSFA() // new MyHomePage()
		.clickLeads()	// new LeadsPage()
		.clickCreateLead()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.submitCreateLead();
		
	}
}
