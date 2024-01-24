package stepdefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Base 
{
	public static WebDriver driver;	
	@Given("user enter orange url {string}")
	public void user_enter_orange_url(String string) 
	{
		System.setProperty("webdriver.chrome.driver","E:\\sdet+\\SEED COURSE\\selenium automation testing\\automation programs\\Cucumber_Multiple_user_login_by_parameters\\driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get(string);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		
	}

@When("user enter {string} and {string}")
public void user_enter_and(String username, String password) {
 		driver.findElement(By.xpath("//input[@name='username']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		
//		password
		driver.findElement(By.xpath("//input[@name='password']")).click();
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
//								signin button
		driver.findElement(By.xpath("//button")).click();
		
	
	}

@Then("user should successfully access page")
public void user_should_successfully_access_page() {

		System.out.println("user logged in successfully");

	}
	
	

}
