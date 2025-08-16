package BaseLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	public static void initialize() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();                                                                           
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
}
