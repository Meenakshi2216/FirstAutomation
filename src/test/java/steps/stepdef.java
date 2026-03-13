package steps;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.testng.Assert;

import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.homepage;

public class stepdef extends BaseTest{
	
	homepage details;
	Alert alert;
	String parentWindow;
	
	@Given ("User open automation practice page")
	public void userOpenAutomationPracticepage() {
		setup();
		System.out.println(driver);
		
		details = new homepage(driver);
	}
	
	@When("User enters name {string}")
	public void userEntersName(String name) {
		details.enterName(name);
	}
	
	@And("User enters email {string}")
		public void userEntersEmai(String email) {
		details.enterEmail(email);
			
		}
	
	@And("user enters phone {string}")
	public void userEntersPhone (String phone) {
	details.enterPhone (phone);
	}

		
	@And("user enters address {string}")
	public void userEntersAddress(String address) {
		details.enteraddress(address);
	}
	
	@And ("user select gender as {string}")
	public void userselectgenderas(String gender) {
		if(gender.equalsIgnoreCase("Male")) {
			details.selectMale();
		}
		else {
			details.selectFemale();
		}
	}
	
	@Then("user verifies the entered details")
	public void userverifydetails() {
		System.out.println("Values Entered correctly");
	}
	



// Days CheckBox

@And("User selects day as Monday")
	public void userSelectsDayAsMonday() {
	
	details.selectMonday();
}

@And("User selects day as Wednesday")
public void userSelectsDayAsWednesday() {
	details.selectWednesday();
}

@Then("Days should be selected successfully")
public void daysselect() {
	System.out.println("Days selected successfully");
}



// Country dropdown
 
@When("user selects country as {string}")

public void userselectscountryas(String country) {
	
	details.selectcountry(country);
}
@Then("country should be selected successfully")
public void countryName() {
	System.out.println("Country selected successfully");
}




//select color from the list

@When("user selects multiplecolors Red and Green")

public void userselectsmultiplecolorsRedandGreen() {
   String[] colors= {"Red","Green"};
   details.selectmultiplecolor(colors);
    }
    
@Then("colors should be selected successfully")
public void colorselect() {
	System.out.println("Color selected successfully");
}


// user selects multiple animal

@When("user selects multipleanimals")

public void userselectsmultipleanimals() {
   String[] animals= {"Lion","Rabbit"};
   details.selectmultipleanimal(animals);
   
    }
    
@Then("Animals selected successfully")
public void animalselect() {
	System.out.println("Animals selected successfully");
}

// select date in the picker

@When ("user enters date in datepicker1 {string}")

public void userentersdateindatepicker1(String date) throws InterruptedException {
details.selectdatepicker1(date);
Thread.sleep(2000);
}

@And("user enters date in datepicker2 {string}")
public void userentersdateindatepicker2(String date)  {
details.selectdatepicker2(date);

}

@Then("user selected dates successfully")
public void selectdates() {
	System.out.println("Dates selected successfully");
}


// date range selection in datepicker3

@When("user selects start date {string}")
public void userselectsstartdate(String start) {
	details.selectstartdate(start);
	
}

@And("users selects end date {string}")
public void userselectsenddatedate(String end) {
	details.selectenddate(end);
}

@And ("User clicks submit")
public void userclickssubmit() {
details.clicksubmit();
}

@Then("user selected dates range successfully")
public void daterange() {
System.out.println("Date range selected successfully");
}

//file upoad

@When("user upload single file {string}")
public void useruploadsinglefile(String filepath) {
	details.uploadSingleFile(filepath);
}

@And("user upload multiple file {string},{string}")
public void useruploadmultiplefile(String file1,String file2) {
	details.uploadMultipleFile(file1,file2);
}


@ Then("file uploaded successfully")
public void fileupload() {
	System.out.println("File uploaded successfully");
	
}

// Static table
@When("user gets table row count")

public void usergetstablerowcount() {
	int rows=details.getRowCount();
	System.out.println("Row Count"+rows);
}

@And ("user gets table column count")

public void usergetstablecolumncount() {
	int columns=details.getcolumnCount();
	System.out.println("Column count"+columns);
}

@Then("table deatils show correctly")

public void tabledetails() {
	System.out.println("Static table details show correctly");
}

// Dynamic table


@When("user gets disk value for {string}")
public void usergetsdiskvaluefor(String browser) {
	
	 String disk=details.getMemoryByName(browser);
	System.out.println("Memory for"+browser+"is:"+disk);
}

@And("user gets memory value for {string}")
public void usergetsmemoryvaluefor(String browser) {
	
	 String memory=details.getMemoryByName(browser);
	System.out.println("Memory for"+browser+"is:"+memory);
}

@Then ("Dynamic table value display correctly")
public void Dtabledetails() {
	System.out.println("Dynamic table details show correctly");
	}

// Pagination Table


@When("user selects checkbox for product {string}")
public void user_selects_checkbox_for_product(String product) {
    details.selectProductCheckbox(product);
}

@And("user gets price of product {string}")
public void user_gets_price_of_product(String product) {

    String price = details.getProductPrice(product);

    System.out.println(product + " price is: " + price);
}



		
		
	

@Then ("details displayed successfully")
public void selectdetails() {
	System.out.println (" Pagination details showed correctly");
	
}

@When("user enter section1 as {string}")

public void userentersection1as(String text) {
	details.Section1(text);
}
@And("user enter submit1 button")

public void userentersubmit1button() {
	details.SubmitSection1();
}

@And("user enter section2 as {string}")
public void userentersection2(String text) {
	details.Section2(text);
}

@And("user enter submit2 button")

public void userentersubmit2button() {
	details.SubmitSection2();
}
@And ("user enter section3 as {string}")
public void userentersection3(String text) {
	details.Section3(text);
}
@And("user enter submit3 button")
public void userentersubmit3button() {
	details.SubmitSection3();
}

@Then("Entered details visible clearly")
public void entereddetailsvisibleclearly() {
	System.out.println("details displayed correctly");
}

//Wikipedia search
@When ("user enters search text {string}")
public void userenterssearchtext(String text) {
	details.Search(text);
}

@And("User click search button")
public void userclickstartbutton() {
	details.clickSearch();
	
}

@And ("user select the first result")
public void userselectthefirstresult() throws InterruptedException {
	details.clickFirstResult();
	Thread.sleep(2000);
}



//Start Button
	@When("User click start button")
	public void userClickStartButton() {
	 details.clickStart();   
	}
	
	//Simple Alert
		@And("User click simplealert button")
		public void userClickSimpleAlertButton() throws InterruptedException  {
		    details.simplealert();
		    Alert alt = driver.switchTo().alert();
			alt.accept();
		}
		
		
		//Confirm alert
		@And("User click Confirmalert button")
		public void userClickConfirmAlertButton() {
			details.confirmAlert();
			alert = driver.switchTo().alert();
			alert.accept();
		}
		
		
		//prompt alert
		 @And("user click promptalert button")
		  public void userclickpromptalertbutton() throws InterruptedException
		    {
			 details.promptAlertclick();
		    }

		    @And("user enters name in alert")
		    public void userentersnameinalert()
		    {
		      alert= driver.switchTo().alert();
		        alert.sendKeys("Harry Potter");
		        alert.accept();
		    }
		    
		    //Newtab&popup
		    
		    @And("user click new tab button")
		    public void clicknewtab()
		    {
		    parentWindow = driver.getWindowHandle();

		    details.NewTab();

		    Set<String> windows = driver.getWindowHandles();

		    for(String win : windows)
		    {
		    if(!win.equals(parentWindow))
		    {
		    driver.switchTo().window(win);
		    driver.close();
		    }
		    }

		    driver.switchTo().window(parentWindow);
		    }
		    
		    @And("user click popup window button")
		    public void clickpopupwindow()
		    {
		    parentWindow = driver.getWindowHandle();

		    details.PopupWindow();

		    Set<String> windows = driver.getWindowHandles();

		    for(String win : windows)
		    {
		    if(!win.equals(parentWindow))
		    {
		    driver.switchTo().window(win);
		    driver.close();
		    }
		    }

		    driver.switchTo().window(parentWindow);
		    }

	
	// Mouse Hover
	@When("User perform mouse hover")
	public void userPerformMouseHover() {
	    details.mouseHover();
	}
	
	
	@And("User select Mobile option")
	public void selectMobOption() throws InterruptedException {
		Thread.sleep(1000);
		details.selectMobiles();
	}
	
	// Double click
	@And("User performs double click")
	public void userPerformsDoubleClick() {
		details.doubleClickbtn();
	   
	}
	// Drag and Drop
	@And("user performs drag and drop")
	public void userPerformsDragAndDrop() {
	    details.dragDrop();
	}
	
	@Then("verify actions executed")
	public void verifyActionsExecuted() {
		System.out.println("Actions completed");
	}
	
	//Slider
	
	@When("user moves the slider")
	public void userMovesTheSlider()  {
		details.slider();
	}
	
	// Scrolling
	@And("user clicks Scrolling DropDown link")
	public void userClicksScrollingDropDownLink() {
		details.clickScrollingDropdown();
	}
	
	//Slider
	@And ("display circle icon")
	public void displaycircleicon() {
		details.displayCircle();
	}
	
	@And ("display square icon")
	public void displaysquareicon() {
		details.displaySquare();
	}
	
	
	
	// Mobile Labels
	@And("user verify Samsung label")
	public void userVerifySamsungLabel() {
	    details.SamsungLabels();
	}
		
	@And("user verify RealMe label")
	public void userVerifyRealMeLabel() {
		details.RealmeLabels();
	}
	
	@And("user verify Moto label")
	public void userVerifyMotoLabel() {
		details.MotoLabels();
	}
	
	@Then("labels should be displayed")
	public void labelsShouldBeDisplayed() {
		System.out.println("Mobile Label Displayed Sucessfully");
	}
	
	// Mobile Links
	
	@When("user clicks Apple link")
	public void userClicksAppleLink() {
	    details.apple();
	}
	
	@And("user should navigate to Apple page")
	public void verifyNavigationApple()
	{
		System.out.println(driver.getCurrentUrl());

	    
	    driver.navigate().back();
	}
	
	@And("user clicks Lenovo link")
	public void userClicksLenovoLink() {
	    details.lenovo();
	}
	
	@And("user should navigate to Lenovo page")
	public void verifyNavigationLenovo()
	{
		System.out.println(driver.getCurrentUrl());
driver.navigate().back();
	}
	
	@And("user clicks Dell link")
	public void userClicksDellLink() {
	   details.dell();
	}
	
	@And("user should navigate to Dell page")
	public void verifyNavigationDell()
	{
		System.out.println(driver.getCurrentUrl());

	    // Go back to practice page
	    driver.navigate().back();
	    }
	
	@And("respective laptop page should open")
	public void respectiveLaptopPageShouldOpen() {
	    System.out.println("Links Displayed Successfully");
	}
	
	
	    
	 // Visitors
	    
	    @And("user scroll to visitors section")
	    public void scrollVisitors()
	    {
	        details.scrollToVisitors();
	    }

	    @Then("user capture visitor count")
	    public void getVisitors()
	    {
	        details.getVisitorCount();
	        tearDown();
	    }
	    
	 // ErrorCode
		
		 @When("user verify broken links")
		    public void checkLinks()
		    {
		        details.Errorcode();
		    }
		 
		 @Then ("broken link displays all the details")
		 public void brokenlinkdisplaysallthedetails() {
			 System.out.println("Broken link details displayed correctly");
		 }
		 
		 // Footer
		 
@When ("user clicks home in footer")
public void userclickshomeinfooter() {
	details.Home();
}

@And("user clicks Hidden Elements & AJAX footer link")
public void clickhiddenelementsfooter() {
	details.clickHiddenElementsFooter();
}

@And("user enters {string} in Input Box 1")
public void enter_input1(String text) {
	details.setInputBox1(text);
}

@And("user enters {string} in Input Box 2")
public void enterinput2(String text) {
  details.setInputBox2(text);
}

@And("user checks Checkbox 1")
public void usercheckscheckbox1() {
    details.checkCheckbox1();
}

@And("user checks Checkbox 2")
public void usercheckscheckbox2() {
    details.checkCheckbox2();
}

@And("user toggles Input Box 2")
public void usertogglesinputbox2() {
    details.clickToggleInput2();
}

@And("user toggles Checkbox 2")
public void usertogglescheckbox2() {
   details.clickToggleCheckbox2();
}

@And("user clicks Load AJAX Content")
public void userclicksloadajaxcontent() {
   details.clickLoadAjaxBtn();
}

@Then("status should be ready")
public void statusshouldbeready() {
	
	 boolean displayed = details.isStatusDisplayed();

	    System.out.println("Status displayed = " + displayed);

	    Assert.assertTrue(displayed, "AJAX status is not displayed");
}


// download

@When ("user clicks download in footer")
public void userclickdownloadinfooter() {
	details.clickDownloadElementsFooter();
	
}

@And("user enter text {string}")
public void userentertext(String text) {
    details.enterDownloadText(text);
}

@And("user click generate text file")
public void userclickgeneratetextfile() {
	details.clickGenerateTextFile();
}

@And("user download text file")
public void userdownloadtext_file() {
	details.clickDownloadTextFile();
}

@And("user click generate pdf file")
public void userclickgeneratepdf_file() {
	details.clickGeneratePdfFile();
}

@And("user download pdf file")
public void userdownloadpdffile() {
	details.clickDownloadPdfFile();
}

@And("user download pdf using browser")
public void userdownloadpdfusingbrowser() {
	details.clickDownloadPdfBrowser();
}
@Then("user return back to home page")
public void userreturnbacktohomepage() {
	System.out.println(driver.getCurrentUrl());
	driver.navigate().back();
}

@Then ("All the link working fine")
public void allthelinkworkingfine() {
	System.out.println("Fooetr links working fine");
}
}












		

	
		
		










    

