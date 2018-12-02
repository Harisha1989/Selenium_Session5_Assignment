package seleniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class facebookLoginPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("-disable-notifications");
		driver.navigate().to("https://facebook.com");
		
		//xpath for email
		WebElement emailEle=driver.findElement(By.xpath("//*[@id='email']"));
		emailEle.sendKeys("abc@gmail.com");
		
		//xpath for password
		WebElement pwdEle = driver.findElement(By.xpath("//*[@id='pass']"));
		pwdEle.sendKeys("Welcome123");
		
		//xpath for Login
		WebElement loginEle = driver.findElement(By.xpath("//*[@value='Log In']"));
		//loginEle.click();
		
	}

}
