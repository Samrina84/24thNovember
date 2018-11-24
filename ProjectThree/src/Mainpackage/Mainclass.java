package Mainpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import object.login;
import object.logout;

public class Mainclass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\labit\\Desktop\\Libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://demo.opencart.com/index.php?route=account/login");	
		
		login log1= new login(driver);
		log1.log();

		System.out.println("Logged In Test Passed!");

		logout out1= new logout(driver);
		out1.out();
		
		System.out.println("Logged Out Test Passed!");
		
	}

}
