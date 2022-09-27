 package stepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Setp1 {
	WebDriver driver;

	
	@Given("^User Launch Chrome browser$")
	public void user_Launch_Chrome_browser() throws Throwable {
	     driver = new ChromeDriver(); 
	     
	}

	@When("^User opens Url\"([^\"]*)\"$")
	public void user_opens_Url(String Url) throws Throwable {
	   driver.get(Url);
	   
	}

	@When("^User enter user name as \"([^\"]*)\" password \"([^\"]*)\"$")
	public void user_enter_user_name_as_password(String username, String password) throws Throwable {
		driver.findElement(By.name("txtUsername")).sendKeys(username);
		driver.findElement(By.name("txtPassword")).sendKeys(password);
	   }

	@When("^click on login$")
	public void click_on_login() throws Throwable {
	    driver.findElement(By.id("btnLogin")).click();
	    
	}

	@Then("^page should be \"([^\"]*)\"$")
	public void page_should_be(String dashboard) throws Throwable {
	    }

	@And("^click pim button$")
	public void click_pim_button() throws Throwable {
	    driver.findElement(By.xpath("(//b[normalize-space()='PIM'])[1]")).click();
	    
	}

	@Then("^Click Add button$")
	public void click_Add_button() throws Throwable {
	  driver.findElement(By.name("btnAdd")).click();
	 
	}

	@Then("^Fill Add fname and mname and lname$")
	public void fill_Add_fname_and_mname_and_lname(DataTable enter) throws Throwable {
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Anki01");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("Eswar02");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Reddy03");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Then("^Capture  before emid$")
	public void capture_before_emid() throws Throwable {
		driver.findElement(By.xpath("//input[@id='employeeId']")).getAttribute("value");
		
	}
	
	@Then("^click Save button$")
	public void click_Save_button() throws Throwable {
	   driver.findElement(By.id("btnSave")).click();
	   
	}

	@Then("^getting After emid$")
	public void getting_After_emid() throws Throwable {
	    driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
	  
	}
	@Then("^click Leave button$")
	public void click_Leave_button() throws Throwable {
		driver.findElement(By.xpath("//b[normalize-space()='Leave']")).click();
	   
	}

	@Then("^click from$")
	public void click_from() throws Throwable {
		driver.findElement(By.id("calToDate")).click();

	    }

	@Then("^Select date and Month and Select Year$")
	public void select_date_and_Month_and_Select_Year() throws Throwable {
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//li[1]//img[1]"))).click().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ac.moveToElement(driver.findElement(By.xpath("//a[normalize-space()='23']"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ac.moveToElement(driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ac.moveToElement(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ac.moveToElement(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}
	@Then("^Select To Date and month and select year$")
	public void select_To_Date_and_month_and_select_year() throws Throwable {
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//li[1]//img[1]"))).click().perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ac.moveToElement(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ac.moveToElement(driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ac.moveToElement(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ac.moveToElement(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"))).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        
	}
	@Then("^Select Employee Name$")
	public void select_Employee_Name() throws Throwable {
		driver.findElement(By.xpath("//input[@id='leaveList_txtEmployee_empName']")).sendKeys("Eswar Reddy Manual");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	   
	}

	@Then("^click All$")
	public void click_All() throws Throwable {
		driver.findElement(By.id("leaveList_chkSearchFilter_checkboxgroup_allcheck")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@Then("^click Secrch button$")
	public void click_Secrch_button() throws Throwable {
		driver.findElement(By.xpath("//input[@id='btnSearch']")).click();
	   
	}

	@Then("^click click reset button$")
	public void click_click_reset_button() throws Throwable {
		driver.findElement(By.id("btnReset")).click();
	    
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
	    driver.close();
	}



	}