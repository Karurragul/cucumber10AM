package com.stepdefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Addcustomer {
	static WebDriver driver;

	@Given("The user should be in telecom homepage")
	public void the_user_should_be_in_telecom_homepage() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\user\\\\eclipse-workspace\\\\ragul\\\\Selenium\\\\driver\\\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/telecom/");
		System.out.println("Given - 1");
	}

	@Given("User click the add customer")
	public void user_click_the_add_customer() {
		driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]")).click();
		System.out.println("Given - 2 ");
	}


	/*
	 * @When("User should provide valid details") public void
	 * user_should_provide_valid_details(io.cucumber.datatable.DataTable onedlist) {
	 * System.out.println("When - 1"); List<String> asList =
	 * onedlist.asList(String.class); System.out.println(asList);
	 * driver.findElement(By.xpath("//label[text()='Done']")).click();
	 * driver.findElement(By.id("fname")).sendKeys(asList.get(0));
	 * driver.findElement(By.id("lname")).sendKeys(asList.get(1));
	 * driver.findElement(By.id("email")).sendKeys(asList.get(2));
	 * driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']"))
	 * .sendKeys(asList.get(3));
	 * driver.findElement(By.id("telephoneno")).sendKeys(asList.get(4));
	 * driver.findElement(By.xpath("//input[@name='submit']")).click();
	 * 
	 * }
	 */

	/*@When("User should provide valid details")
	public void user_should_provide_valid_details(io.cucumber.datatable.DataTable cus) {
		Map<String, String> dmap = cus.asMap(String.class, String.class);
		System.out.println("When -1 ");
		System.out.println(dmap);
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(dmap.get("Fname"));
		driver.findElement(By.id("lname")).sendKeys(dmap.get("lname"));
		driver.findElement(By.id("email")).sendKeys(dmap.get("gmail"));
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(dmap.get("address"));
		driver.findElement(By.id("telephoneno")).sendKeys(dmap.get("phone"));
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}
*/
	
	/*@When("User should provide valid details")
	public void user_should_provide_valid_details(io.cucumber.datatable.DataTable data) {
	    List<List<String>> d2list = data.asLists(String.class);
	    System.out.println(d2list);
		System.out.println("When -1 ");
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(d2list.get(2).get(0));
		driver.findElement(By.id("lname")).sendKeys(d2list.get(1).get(1));
		driver.findElement(By.id("email")).sendKeys(d2list.get(0).get(2));
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(d2list.get(2).get(3));
		driver.findElement(By.id("telephoneno")).sendKeys(d2list.get(2).get(4));
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	    
	}
*/
	@When("User should provide valid details")
	public void user_should_provide_valid_details(io.cucumber.datatable.DataTable date) {
	    List<Map<String, String>> twodmap = date.asMaps(String.class, String.class);
	    System.out.println(twodmap);
		System.out.println("When -1 ");
		driver.findElement(By.xpath("//label[text()='Done']")).click();
		driver.findElement(By.id("fname")).sendKeys(twodmap.get(1).get("Fname"));
		driver.findElement(By.id("lname")).sendKeys(twodmap.get(0).get("lname"));
		driver.findElement(By.id("email")).sendKeys(twodmap.get(0).get("gmail"));
		driver.findElement(By.xpath("//textarea[@placeholder='Enter your address']")).sendKeys(twodmap.get(0).get("Address"));
		driver.findElement(By.id("telephoneno")).sendKeys(twodmap.get(0).get("phone"));
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	
	}
	
	@Then("User should validate id")
	public void user_should_validate_id() {
		System.out.println("Then - 1");
		driver.findElement(By.xpath("(//td[@align='center'])[2]"));
	}

}
