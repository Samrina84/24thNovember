import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {

	public static void main(String[] args) {
		
		for (int x=0; x<10; x++) {
			//System.out.println(x + "test");
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\labit\\Desktop\\Libraries\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
					
			driver.get("https://demo.opencart.com/index.php?route=account/login");	
			driver.manage().window().maximize();


			 WebElement username;
			 username = driver.findElement(By.id("input-email"));
			 username.sendKeys("mytc5@gmail.com");

			 WebElement Password;
			 Password = driver.findElement(By.id("input-password"));
			 Password.sendKeys("123456789");

			 WebElement loginButton;  
			 loginButton = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input"));
			 loginButton.click(); 

			
		}
		

	}

}
