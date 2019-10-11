package stepdef;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import net.thucydides.core.annotations.findby.By;

public class Definationclass {
	 WebDriver driver;
	
	
	
	@Given(value="start methods")
	public void precondition()
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	driver=new ChromeDriver();
	
		driver.get("https://github.com/login");
	}
	@When("action starts here")
	public void action()
	{
	
		driver.findElement(By.id("login_field")).sendKeys("shivanandchachadi");
		driver.findElement(By.id("password")).sendKeys("mygithub1331");
		driver.findElement(By.name("commit")).click();
	
	}
	@Then("results here")
	public void method()
	{
		String title=driver.getTitle();
		String actual_title="GitHub";
		if(title.equals(actual_title))
		{
			System.out.println("correct title");
		}
	}
//	@And("Messages here")
//	public void and()
//	{
//		System.out.println("messages");
//	}
	
}
