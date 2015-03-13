package com.tdc.smoke;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleLoginSQLTest{
	WebDriver driver;
	String usesrname=null;
	String password=null;
    // Connection object
    static Connection con = null;
    // Statement object
    private static Statement stmt;
    // Constant for Database URL
    public static String DB_URL = "jdbc:mysql://localhost:3306/gk";   
    // Constant for Database Username
    public static String DB_USER = "root";
    // Constant for Database Password
    public static String DB_PASSWORD = "root";


    @Given("^google gmail page$")
    public void google_gmail_page() throws Throwable {
    	 
    	driver = new ChromeDriver();
		driver.get("https://gmail.com");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
    }

    @Given("^set up database connection$")
    public void set_up_database_connection() throws Throwable {
    	 try{
             // Make the database connection
             String dbClass = "com.mysql.jdbc.Driver";
             Class.forName(dbClass).newInstance();
             // Get connection to DB
             Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             // Statement object to send the SQL statement to the Database
             stmt = con.createStatement();
             }
             catch (Exception e)
             {
                   e.printStackTrace();
             }
   
    }

    @When("^login with username and password from database$")
    public void login_with_username_and_password_from_database() throws Throwable {
    	
    	 try{
             String query = "select * from userinfo where userId = 1";
             ResultSet res = stmt.executeQuery(query);           
             while (res.next())
             {
             System.out.print(res.getString(1));
             System.out.print("\t" + res.getString(2));
             usesrname=res.getString(2);
             System.out.print("\t" + res.getString(3));
             password=res.getString(3);
             }
             }
             catch(Exception e)
             {
                    e.printStackTrace();
             }   
    	driver.findElement(By.id("Email")).clear();
	    driver.findElement(By.id("Email")).sendKeys(usesrname);
	    driver.findElement(By.id("Passwd")).clear();
	    driver.findElement(By.id("Passwd")).sendKeys(password);
	    driver.findElement(By.id("signIn")).click();
   
    }

    @Then("^I should see my login page$")
    public void i_should_see_my_login_page() throws Throwable {
    	Assert.assertTrue("login page should be displayed", driver.getTitle().contains("goldenkeytest@gmail.com"));		
       
    }

}
