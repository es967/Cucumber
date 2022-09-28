package stepDefination;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmpCreation {
	
	WebDriver driver;
	String Dashborad = "";
	String expectedid  = "";
	String actualid  = "";
	@Given("^User Launch Chrome browser$")
	public void user_Launch_Chrome_browser() throws Throwable {
	driver = new ChromeDriver();
	    	
	}

	@Then("^User opens Url\"([^\"]*)\"$")
	public void user_opens_Url(String Url) throws Throwable {
     driver.manage().window().maximize();
     driver.get(Url);

	}

	@Then("^User enter user name as \"([^\"]*)\" password \"([^\"]*)\"$")
	public void user_enter_user_name_as_password(String username, String password) throws Throwable {
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys(password);
    }

	@Then("^click on login$")
	public void click_on_login() throws Throwable {

    driver.findElement(By.xpath("//input[@id='btnLogin']")).submit();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Then("^page should be \"([^\"]*)\"$")
	public void page_should_be(String Dashborad) throws Throwable {
       return;

	}

	@Then("^click pim button$")
	public void click_pim_button() throws Throwable {
    driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();

	}

	@Then("^Click Add button$")
	public void click_Add_button() throws Throwable {
   driver.findElement(By.xpath("//input[@id='btnAdd']")).click();

	}
	@When("^Fill Add Employee \"([^\"]*)\"and\"([^\"]*)\"and\"([^\"]*)\"$")
	public void fill_Add_Employee_and_and(String fname, String mname, String lname) throws Throwable {
   driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(fname);
   driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(mname);
   driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(lname);
   
	}

	@Then("^user capture Emid before$")
	public void user_capture_Emid_before() throws Throwable {
       expectedid = driver.findElement(By.xpath("//input[@id='employeeId']")).getAttribute("value");

	}

	@Then("^click save button$")
	public void click_save_button() throws Throwable {
  driver.findElement(By.xpath("//input[@id='btnSave']")).click();
  

	}

	@Then("^user capture Emid after$")
	public void user_capture_Emid_after() throws Throwable {
     
	 actualid = driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']")).getAttribute("value");

	}

	@Then("^user validate emid$")
	public void user_validate_emid() throws Throwable {
      if(expectedid.equals(actualid))
    {
    	  System.out.println("Empcreationsuccess::: "+expectedid+"  "+actualid);
    }
      else
      {
    	  System.out.println("Empcreationsuccess::: "+expectedid+"  "+actualid);
  
      }
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
    driver.quit();

	}


}
