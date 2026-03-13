package page;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class homepage {
	
	WebDriver driver;
	WebDriverWait wait;
	public homepage (WebDriver driver) {
		this.driver=driver;
		wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
	}
	
	By name = By.id("name");
	By email = By.id("email");
	By phone = By.id("phone");
	By address=By.id("textarea");
	By gender = By.id("male");
	By maleRadio=By.id("male");
	By femaleRadio =By.id("female");
	
	
	
	public void enterName (String username) {
		driver.findElement(name).sendKeys(username);
		
	}
	
	public void enterEmail (String useremail) {
		driver.findElement(email).sendKeys(useremail);
		
	}
	public void enterPhone (String userphone) {
		driver.findElement(phone).sendKeys(userphone);
		
	}
	
    public void enteraddress (String useraddress) {
		driver.findElement(address).sendKeys(useraddress);
		}
	
    // Radio button
    
	public void selectMale() {
		driver.findElement(maleRadio).click();
	}
	
	public void selectFemale() {
		driver.findElement(femaleRadio).click();
	}
	




//Days Check box

	By monday=By.id("monday");
	By wednesday =By.id("wednesday");
	
	public void selectMonday() {
		driver.findElement(monday).click();
	}
		
		public void selectWednesday() {
			driver.findElement(wednesday).click();
			
			
 }
		
// select country from dropdown
		
		By countrydd = By.id("country");
		
		public void selectcountry (String country) {
			Select sel =new Select(driver.findElement(countrydd));
			sel.selectByVisibleText(country);
		}
		
			
		
// select color from the list
   By colors=By.id("colors");
   
   public void selectmultiplecolor (String[] colorlist) {
		Select selcolor =new Select(driver.findElement(colors));
		for(String color:colorlist) {
			selcolor.selectByVisibleText(color);
		}
		
	}
   //select multiple animals
   
 By animals=By.id("animals");
   
   public void selectmultipleanimal (String[] animallist) {
		Select selanimal =new Select(driver.findElement(animals));
		for(String animals:animallist) {
			selanimal.selectByVisibleText(animals);
		}
		
	}
   

   		
// select date

By datepicker1=By.id("datepicker");
By datepicker2=By.name("SelectedDate");

public void selectdatepicker1(String date) {
	WebElement dp1=driver.findElement(datepicker1);
	dp1.sendKeys(date);
	dp1.sendKeys(Keys.TAB);
}

public void selectdatepicker2(String date) {
	  driver.findElement(datepicker2).click();
      driver.findElement(datepicker2).sendKeys(Keys.CONTROL + "a");
      driver.findElement(datepicker2).sendKeys(date);
      driver.findElement(datepicker2).sendKeys(Keys.ENTER);
}

// date range selector

By startDate=By.id("start-date");
By endDate=By.id("end-date");
By submitBtn=By.xpath("//button[@class='submit-btn']");

public void selectstartdate(String date) {
	driver.findElement(startDate).sendKeys(date);
}
	

public void selectenddate(String date) {
	driver.findElement(endDate).sendKeys(date);
}

public void clicksubmit() {
	driver.findElement(submitBtn).click();
	
}
// single file upload

By sFileUpload=By.id("singleFileInput");
By mFileUpload=By.id("multipleFilesInput");

public void uploadSingleFile(String filepath) {
	driver.findElement(sFileUpload).sendKeys(filepath);
}

public void uploadMultipleFile(String path1,String path2) {
	driver.findElement(mFileUpload).sendKeys(path1+ "\n" +path2);
}

//Static Web Table

By tableRows=By.xpath("//*[@name='BookTable']//tr");
By tableColumns=By.xpath("//*[@name='BookTable']//tr[1]/th");

public int getRowCount() {
	return driver.findElements(tableRows).size();
	
}

public int getcolumnCount() {
	return driver.findElements(tableColumns).size();
	
}

//Dynamic web table

	
By tRows=By.xpath("//*[@id='taskTable']/tbody/tr");

public int getRowCounts()
{
	return driver.findElements(tRows).size();
	
}

public String getName(int row)
{
	return driver.findElement(By.xpath("//*[@id='taskTable']/tbody/tr["+row+"]/td[1]")).getText();
}

public String getDisk(int row)
{
	return driver.findElement(By.xpath("//*[@id='taskTable']/tbody/tr["+row+"]/td[2]")).getText();
}

public String getMemory(int row)
{
	return driver.findElement(By.xpath("//*[@id='taskTable']/tbody/tr["+row+"]/td[3]")).getText();
}

//get disk using name
 public String getDiskbyName(String name)
 {
	 List<WebElement> rows=driver.findElements(tRows);
	 for(int i=1;i<=rows.size();i++)
	 {
		 String username=rows.get(i).findElement(By.xpath("td[1]")).getText();
		 
		 if(username.equalsIgnoreCase(name)) {
			 return 
		rows.get(i).findElement(By.xpath("td[2]")).getText();
		 }
	 }
	 return null;
 }


 //get memory using name
 
 public String getMemoryByName(String name)
 {
	 List<WebElement> rows=driver.findElements(tRows);
	 for(int i=1;i<=rows.size();i++)
	 {
		 String username=rows.get(i).findElement(By.xpath("td[1]")).getText();
		 
		 if(username.equalsIgnoreCase(name)) {
			 return 
		rows.get(i).findElement(By.xpath("td[2]")).getText();
		 }
	 }
	 return null;
 }
 

 
 // pagination web table
 
 By trow = By.xpath("//table[@id='productTable']/tbody/tr");
 By nxtBtn=By.xpath("//a[contains(@aria-label,'Next')]");
 
 public void selectProductCheckbox(String product) {

	    while (true) {

	        List<WebElement> tableRows = driver.findElements(trow);

	        for (WebElement row : tableRows) {

	            String productName = row.findElement(By.xpath(".//td[2]")).getText();

	            if (productName.equalsIgnoreCase(product)) {

	                WebElement checkbox = row.findElement(By.xpath(".//input[@type='checkbox']"));
	                checkbox.click();

	                System.out.println(product + " checkbox selected");
	                return;
	            }
	        }

	        WebElement next = driver.findElement(nxtBtn);

	        if (next.getAttribute("class").contains("disabled")) {
	            break;
	        }

	        next.click();
	    }
}
public String getProductPrice(String product) {

	 while (true) {

	 List<WebElement> tableRows = driver.findElements(trow);

	 for (WebElement row : tableRows) {

	 String productName = row.findElement(By.xpath(".//td[2]")).getText();

	 if (productName.equalsIgnoreCase(product)) {

	 String price = row.findElement(By.xpath(".//td[3]")).getText();

	 System.out.println(product + " price = " + price);
	 return price;
	 }
	 }

	 WebElement next = driver.findElement(nxtBtn);

	 if (next.getAttribute("class").contains("disabled")) {
	 break;
	 }

	 next.click();
	 }

	 return "Product not found";
	 }




 
// form filling

By section1=By.name("input1");
By submit1=By.id("btn1");
By section2=By.name("input2");
By submit2=By.id("btn2");
By section3=By.name("input3");
By submit3=By.id("btn3");

public void Section1(String text) {
	driver.findElement(section1).sendKeys(text);
}
	public void SubmitSection1() {
		driver.findElement(submit1).click();
	}
	public void Section2(String text) {
		driver.findElement(section2).sendKeys(text);
	}
		public void SubmitSection2() {
			driver.findElement(submit2).click();
		}
	
		public void Section3(String text) {
			driver.findElement(section3).sendKeys(text);
		}
			public void SubmitSection3() {
				driver.findElement(submit3).click();
			}
			
// Wikipedia search
			
By searchBox =By.id("Wikipedia1_wikipedia-search-input");
By searchBtn=By.xpath("//input[@type='submit']");
By firstResult=By.xpath("(//h3)[1]");

public void Search(String text) {
	driver.findElement(searchBox).sendKeys(text);
	
}

public void clickSearch() {
	driver.findElement(searchBtn).click();
}

public void clickFirstResult() {
	driver.findElement(firstResult).click();
}




			
// Alert

By startButton = By.name("start");
By simplealert = By.id("alertBtn");
By Confirmalert = By.id("confirmBtn");
By promptalert = By.id("promptBtn");
By hover = By.xpath("//button[text()='Point Me']");
By hovervalue = By.xpath("//a[text()='Mobiles']");

// Start Button 
public void clickStart() {
	
	WebElement button=driver.findElement(startButton);
	button.click();
	try {
		Thread.sleep(2000);
	}catch(InterruptedException e) {}
	
	WebElement stopButton=driver.findElement(By.name("stop"));
	stopButton.click();

	}

By promptAlertBtn = By.xpath("//button[text()='Prompt Alert']");
//Simple Alert	
		public void simplealert() throws InterruptedException {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,2500)");
			driver.findElement(simplealert).click();
			Thread.sleep(2000);
		}
		
	//Confirm alert	
		public void confirmAlert() {
			
			wait.until(ExpectedConditions.visibilityOfElementLocated(Confirmalert));
			driver.findElement(Confirmalert).click();
			
		}
		
		// prompt alert
		
		 public void promptAlertclick() throws InterruptedException
		    {
		        driver.findElement(promptAlertBtn).click();
		        Thread.sleep(2000);
		    }
		 
		 public void clickNewTab()
		 {
		 driver.findElement(newTabBtn).click();
		 }

		 public void clickPopupWindow()
		 {
		 driver.findElement(popupBtn).click();
		 }

		 
		 // Newtab & popup
		 By newTabBtn = By.xpath("//button[text()='New Tab']");
		 By popupBtn = By.xpath("//button[text()='Popup Windows']");
		 
		 public void NewTab()
		 {
		 driver.findElement(newTabBtn).click();
		 }

		 public void PopupWindow()
		 {
		 driver.findElement(popupBtn).click();
		 }

	
	
// Mouse Hover
	public void mouseHover() {
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(hover)).perform();
	}

	public void selectMobiles() {
		driver.findElement(hovervalue).click();
	}
	
	//Double click
	
	By doubleClick = By.id("field1");
	By copyText = By.xpath("//button[text()='Copy Text']");
	
	public void doubleClickbtn() {
		WebElement button = driver.findElement(copyText);
		Actions dbclick = new Actions(driver);
		dbclick.doubleClick(button).perform();
	}

	// Drag and Drop
	
	By srcDrag = By.id("draggable");
	By targetDrop = By.id("droppable");
	public void dragDrop() {
		
		WebElement src = driver.findElement(srcDrag);
		WebElement tar = driver.findElement(targetDrop);
		
		Actions dd = new Actions(driver);
		dd.dragAndDrop(src, tar).perform();
		
	}
	
	//Slider
	
	By slider = By.xpath("//div[@class='ui-slider-range ui-corner-all ui-widget-header']");
	
	public void slider() {
		
		WebElement slid = driver.findElement(slider);
		
		Actions sr = new Actions(driver);
		sr.dragAndDropBy(slid, 300, 0).perform();
	}
	
	// SVG Element
	
	 By circle=By.xpath("(//*[name()='svg']//*[name()='path'])[1]");
	 By square=By.xpath("(//*[name()='svg']//*[name()='path'])[2]");
	
	 
	 public void displayCircle() {
		 driver.findElement(circle).isDisplayed();
	 }
		 public void displaySquare() {
			 driver.findElement(square).isDisplayed();
		 }
			 
	
	
	
	// Scrolling 
	
	By ClickBox = By.id("comboBox");
	By ItemBox = By.xpath("//div[text()='Item 1']");
	
	public void clickScrollingDropdown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)");
		
		
        driver.findElement(ClickBox).click();
        driver.findElement(ItemBox).click();
    }
	
	// Mobile Labels
	
	By Samsung = By.xpath("//label[text()='Samsung']");
	By RealMe = By.xpath("//label[text()='Real Me']");
	By Moto = By.xpath("//label[text()='Moto']");
	
	public void SamsungLabels() {
		
		driver.findElement(Samsung).getText();
	}
	public void RealmeLabels() {
		driver.findElement(RealMe).getText();
	}
	public void MotoLabels() {
		driver.findElement(Moto).getText();
	}
	
	// Laptop Links
	
	By apple = By.id("apple");
	
	
	public void apple() {
		driver.findElement(apple).click();
	}
	
	By lenovo = By.id("lenovo");
	
	public void lenovo() {
		driver.findElement(lenovo).click();
	}
	
	By Dell = By.id("dell");
	public void dell() {
		driver.findElement(Dell).click();
		
	}
	
			
	// Visitors
	
	 By visitorCount = By.id("Stats1_totalCount");

	    public void scrollToVisitors()
	    {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,1500)");
	    }

	    public void getVisitorCount()
	    {
	        String count = driver.findElement(visitorCount).getText();
	        System.out.println("Visitor Count : " + count);
	    }
	
	 // ErrorCode
		
		public void Errorcode() {
		
			List<WebElement> links = driver.findElements(By.tagName("a"));

	        for(WebElement link : links)
	        {
	            String url = link.getAttribute("href");

	            if(url == null || url.isEmpty())
	            {
	                continue;
	            }

	            try
	            {
	                @SuppressWarnings("deprecation")
					URL linkURL = new URL(url);

	                HttpURLConnection connection =
	                        (HttpURLConnection) linkURL.openConnection();

	                connection.setConnectTimeout(3000);
	                connection.connect();

	                int responseCode = connection.getResponseCode();

	                System.out.println(url + " -> " + responseCode);

	                if(responseCode >= 400)
	                {
	                    System.out.println("Broken Link Found");
	                }
	                else
	                {
	                    System.out.println("Valid Link");
	                }

	            }
	            catch(Exception e)
	            {
	                System.out.println("Error checking link: " + url);
	            }
	        }
		}
//Footer
		
		By home=By.linkText("Home");
		
		public void Home() {
			driver.findElement(home).click();
		}
		
		
		private By hiddenElementsFooterLink = By.linkText("Hidden Elements & AJAX");

	    
		   private By inputBox1 = By.id("input1");
		    private By inputBox2 = By.id("input2");

		    // Checkboxes
		    private By checkbox1 = By.id("checkbox1");
		    private By checkbox2 = By.id("checkbox2");

		    // Toggle Buttons
		    private By toggleInput2 = By.id("toggleInput");
		    private By toggleCheckbox2 = By.id("toggleCheckbox");

		    // AJAX Button and Status
		    private By loadAjaxBtn = By.id("loadContent");
		    private By statusText = By.id("ajaxContent");
		    
		    private WebElement waitForDisplayed(By locator, int timeoutSeconds) {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSeconds));
		        return wait.until(new ExpectedCondition<WebElement>() {
		            public WebElement apply(WebDriver d) {
		                WebElement el = d.findElement(locator);
		                return el.isDisplayed() ? el : null;
		            }
		        });
		    }
		    
		    public void clickHiddenElementsFooter() {
		        driver.findElement(hiddenElementsFooterLink).click();
		    }

		    
		    public void setInputBox1(String text) {
		        driver.findElement(inputBox1).clear();
		        driver.findElement(inputBox1).sendKeys(text);
		    }

		    public void setInputBox2(String text) {
		        
		        driver.findElement(toggleInput2).click();

		        
		        WebElement input2Visible = waitForDisplayed(inputBox2, 5);

		        input2Visible.clear();
		        input2Visible.sendKeys(text);
		        System.out.println("Entered text in Input Box 2: " + text);
		    }
		

		    // Checkbox operations
		    public void checkCheckbox1() {
		        WebElement cb = driver.findElement(checkbox1);
		        if(!cb.isSelected()) cb.click();
		    }

		    public void uncheckCheckbox1() {
		        WebElement cb = driver.findElement(checkbox1);
		        if(cb.isSelected()) cb.click();
		    }
		    public void checkCheckbox2() {
		        
		        clickToggleCheckbox2(); 

		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		        WebElement cb2 = wait.until(ExpectedConditions.elementToBeClickable(checkbox2));

		        if(!cb2.isSelected()) cb2.click();
		    }
		    public void uncheckCheckbox2() {
		        WebElement cb = driver.findElement(checkbox2);
		        if(cb.isSelected()) cb.click();
}
		  

		    // Toggle Buttons
		    public void clickToggleInput2() {
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		        WebElement toggleBtn = wait.until(ExpectedConditions.elementToBeClickable(toggleInput2));
		        toggleBtn.click();
		    }

		    public void clickToggleCheckbox2() {
		        driver.findElement(toggleCheckbox2).click();
		    }

		    // AJAX
		    public void clickLoadAjaxBtn() {
		        driver.findElement(loadAjaxBtn).click();
		    }

		    public boolean isStatusDisplayed() {

		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		        WebElement status = wait.until(
		                ExpectedConditions.visibilityOfElementLocated(statusText));

		        return status.isDisplayed();
		    }
		

		    // download file
		   By DownoadElementsFooterLink =By.xpath("//a[text()='Download Files']");
		    By enterTextBox = By.id("inputText");
		    By generateTextBtn = By.id("generateTxt");
		    By downloadTextLink = By.linkText("Download Text File");

		    By generatePdfBtn = By.id("generatePdf");
		    By downloadPdfLink = By.linkText("Download PDF File");

		    By downloadPdfBrowser = By.xpath("//*[@id=\"post-body-7103635191948372757\"]/button[3]");
		    // Actions
		    
		    public void clickDownloadElementsFooter() {
		        driver.findElement(DownoadElementsFooterLink).click();
		    }

		    public void enterDownloadText(String text) {

		        driver.findElement(enterTextBox).sendKeys(text);
		    }

		    public void clickGenerateTextFile() {
		        driver.findElement(generateTextBtn).click();
		    }

		    public void clickDownloadTextFile() {
		    	driver.findElement(downloadTextLink).click();
		    }

		    public void clickGeneratePdfFile() {
		        driver.findElement(generatePdfBtn).click();
		    }

		    public void clickDownloadPdfFile() {
		        driver.findElement(downloadPdfLink).click();
		    }

		    public void clickDownloadPdfBrowser() {
		        driver.findElement(downloadPdfBrowser).click();
		    }
		    public void navigateBackToHome() {
		        driver.navigate().back();
		    }
		
		    }

		




	

	







	
	
	
	




