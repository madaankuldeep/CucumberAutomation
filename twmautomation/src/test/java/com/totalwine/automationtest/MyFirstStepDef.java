package com.totalwine.automationtest;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyFirstStepDef {
	
WebDriver driver;
	
	@Given("^User need to be TWM login page$")
	public void User_need_to_be_TWM_login_page(){
		System.setProperty("webdriver.chrome.driver", "D:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	//	System.setProperty("webdriver.ie.driver", "D:\\CucumberSetup\\chromedriver_win32\\chromedriver.exe");
		//driver=new InternetExplorerDriver();

		driver.get("https://qa.totalwine.com/register");
		
	}
	
	@When("^User enters user first name$")
	public void User_enters_user_first_name(){
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Kuldeep");
		
	}
	

	@Then("^User checks first name is present$")
	public void User_checks_first_name_is_present(){
		String userNameActual=driver.findElement(By.xpath("//input[@id='firstName']")).getAttribute("value");
		Assert.assertEquals("Kuldeep", userNameActual);
	}

}
