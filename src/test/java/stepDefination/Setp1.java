 package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
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

	@Then("^fname and mname lname$")
	public void fname_and_mname_lname(DataTable enter ) throws Throwable {
		driver.findElement(By.id("firstName")).sendKeys("fname");
		driver.findElement(By.name("middleName")).sendKeys("mname");
		driver.findElement(By.id("lastName")).sendKeys("lname");
	    	}


	@Then("^getting before emid$")
	public void getting_before_emid() throws Throwable {
	  driver.findElement(By.name("employeeId")).getAttribute("value");
	 }

	@Then("^click Save button$")
	public void click_Save_button() throws Throwable {
	   driver.findElement(By.id("btnSave")).click();
	   
	}

	@Then("^getting After emid$")
	public void getting_After_emid() throws Throwable {
	    driver.findElement(By.id("personal_txtEmployeeId")).getAttribute("value");
	  
	}



	}