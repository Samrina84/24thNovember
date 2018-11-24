package Mainpackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import object.addCart;
import object.login;
import object.logout;

public class Mainclass {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		
		
		/*login log1= new login(driver);
		log1.log("mytc5@gmail.com", "123456789");

		System.out.println("Logged In Test Passed!");

		logout out1= new logout(driver);
		out1.out();
		
		System.out.println("Logged Out Test Passed!");
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		login log2= new login(driver);
		log2.log("samrina.sarwar@gmail.com", "samrina");
		
		driver.get("https://demo.opencart.com/index.php?route=product/product&product_id=43");
		
		addCart add1= new addCart(driver);
		add1.addCart1();
		
		System.out.println("Item added in cart!"); */
		
		FileInputStream fs = new FileInputStream("C:\\Users\\labit\\Desktop\\Excel\\Test.xls"); 
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet AddressSheet = wb.getSheet("User_Login");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\labit\\Desktop\\Libraries\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.get("https://demo.opencart.com/index.php?route=account/login");	
		
		login log1= new login(driver);
		log1.log(AddressSheet.getCell(0, 1).getContents(), AddressSheet.getCell(1, 1).getContents());

		logout out1= new logout(driver);
		out1.out();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		login log2= new login(driver);
		log1.log(AddressSheet.getCell(0, 2).getContents(), AddressSheet.getCell(1, 2).getContents());

		logout out2= new logout(driver);
		out2.out();
		
		
		
	}

}
