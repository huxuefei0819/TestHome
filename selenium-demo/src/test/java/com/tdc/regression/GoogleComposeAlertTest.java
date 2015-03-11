package com.tdc.regression;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.tdc.groups.RegressionTests;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Category({ RegressionTests.class })
public class GoogleComposeAlertTest {
	WebDriver driver;
	WebDriverWait wait;
	Robot rb ;

	@Given("^I login gmail by using username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_login_gmail_by_using_username_and_password(String username, String password) throws Throwable  {
	
			driver = new ChromeDriver();
			driver.get("https://gmail.com");
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//WebDriverWait wait = new WebDriverWait(driver,30);
			 // wait.until(ExpectedConditions.titleIs("Sign in - Google Accounts"));
			driver.findElement(By.id("Email")).clear();
		    driver.findElement(By.id("Email")).sendKeys(username);
		    driver.findElement(By.id("Passwd")).clear();
		    driver.findElement(By.id("Passwd")).sendKeys(password);
		    driver.findElement(By.id("signIn")).click();
	}

	@When("^I click COMPOSE and click Attch files button$")
	public void i_click_COMPOSE() throws Throwable {
		  driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div[1]/div/div")).click();	 
		  driver.findElement(By.xpath("//div[@id=':hx']")).click();
	}

	@When("^I add a local file$")
	public void i_click_Attach_files_to_add_a_local_file() throws Throwable {
		  rb = new Robot();		 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  rb.keyPress(KeyEvent.VK_C);
		  rb.keyRelease(KeyEvent.VK_C);
		  Thread.sleep(2000);
		  
		  rb.keyPress(KeyEvent.VK_SHIFT);
		  rb.keyPress(KeyEvent.VK_SEMICOLON);
		  rb.keyRelease(KeyEvent.VK_SEMICOLON);
		  rb.keyRelease(KeyEvent.VK_SHIFT);
		  Thread.sleep(2000);
		   
		  rb.keyPress(KeyEvent.VK_BACK_SLASH);
		  rb.keyRelease(KeyEvent.VK_BACK_SLASH);
		  Thread.sleep(2000);
		   
		  rb.keyPress(KeyEvent.VK_P);
		  rb.keyRelease(KeyEvent.VK_P);
		   
		  rb.keyPress(KeyEvent.VK_A);
		  rb.keyRelease(KeyEvent.VK_A);
		   
		  rb.keyPress(KeyEvent.VK_C);
		  rb.keyRelease(KeyEvent.VK_C);

		  rb.keyPress(KeyEvent.VK_K);
		  rb.keyRelease(KeyEvent.VK_K);

		  rb.keyPress(KeyEvent.VK_A);
		  rb.keyRelease(KeyEvent.VK_A);
		   
		  rb.keyPress(KeyEvent.VK_G);
		  rb.keyRelease(KeyEvent.VK_G);
		   
		  rb.keyPress(KeyEvent.VK_E);
		  rb.keyRelease(KeyEvent.VK_E);
		  
		  rb.keyPress(KeyEvent.VK_PERIOD);
		  rb.keyRelease(KeyEvent.VK_PERIOD);
		  
		  rb.keyPress(KeyEvent.VK_J);
		  rb.keyRelease(KeyEvent.VK_J);
		  
		  rb.keyPress(KeyEvent.VK_S);
		  rb.keyRelease(KeyEvent.VK_S);
		  
		  rb.keyPress(KeyEvent.VK_O);
		  rb.keyRelease(KeyEvent.VK_O);
		  
		  rb.keyPress(KeyEvent.VK_N);
		  rb.keyRelease(KeyEvent.VK_N);
		  
		  rb.keyPress(KeyEvent.VK_ENTER);
		  rb.keyRelease(KeyEvent.VK_ENTER);
		  Thread.sleep(2000);
		  
		  wait = new WebDriverWait(driver,30);
	}

	@When("^I click send$")
	public void i_click_send() throws Throwable {
		driver.findElement(By.xpath("//div[@id=':fu']")).click();	
	}

	@Then("^I am able to see an error message$")
	public void i_am_able_to_see_an_error_message() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[@class='Kj-JD']")));
		  System.out.println(driver.findElement(By.xpath("/html/body/div[@class='Kj-JD']/div[2]")).getText());
		  driver.findElement(By.xpath("/html/body/div[@class='Kj-JD']/div[3]/button")).click();
		  driver.close();
	}
	
}
