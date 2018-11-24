package object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class login {
	
	WebDriver driver;
	public login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email")	
	public WebElement Emailid;
	
	@FindBy(name="password")	
	public WebElement pass;

	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/form/input")	
	public WebElement submit;

	public void log() {
		Emailid.sendKeys("mytc5@gmail.com");
		pass.sendKeys("123456789");
		submit.click(); 
		
		
	}

}
