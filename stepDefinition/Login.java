package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	public ChromeDriver driver;
	@Given("Launch the browser")
	public void launchBrowser() {
		driver =new ChromeDriver();
		driver.manage().window().maximize();
	}
	@And("Load the url")
	public void loadUrl() {
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@And("Enter the username as {string}")
	public void enterUsername(String username) {
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@And("Enter the password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@When("click on the Login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
		
	}
	@Then("WelcomePage is displayed")
	public void verifyWelcomePage() {
		System.out.println(driver.getTitle());
	}
	@But("Error message is displayed")
	public void verifyErrorMessage() {
		String followingErrorOccurred = driver.findElement(By.xpath("//p[text()='following error occurred during login: User not found.']")).getText();
	    System.out.println(followingErrorOccurred);
	
	}
	@When("click on the {string} link")
	public void click_on_the_crmsfa_link(String linktext) {
		driver.findElement(By.linkText(linktext)).click();
	}

	/*
	 * @When("click on the Leads link") public void click_on_the_leads_link() {
	 * driver.findElement(By.linkText("Leads")).click(); }
	 * 
	 * @When("click on the Create Lead link") public void
	 * click_on_the_create_lead_link() {
	 * driver.findElement(By.linkText("Create Lead")).click();
	 * 
	 * }
	 */

	@When("Enter the company name as {string}")
	public void enter_the_company_name_as(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);

	}

	@When("Enter the first name as {string}")
	public void enter_the_first_name_as(String fname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);

	}

	@When("Enter the last name as {string}")
	public void enter_the_last_name_as(String lname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);

	}

	@When("click on create button")
	public void click_on_create_button() {
		driver.findElement(By.name("submitButton")).click();

	}

	@Then("Viewleadpage is displayed")
	public void viewleadpage_is_displayed() {
		System.out.println(driver.getTitle());

	}

}
