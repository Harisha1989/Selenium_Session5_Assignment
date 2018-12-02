package seleniumpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class facebookSignUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("-disable-notifications");
		driver.navigate().to("https://facebook.com");
		
		//xpath for FIRSTNAME
		WebElement firstNameEle = driver.findElement(By.xpath("//*[@id='u_0_j']"));
		firstNameEle.sendKeys("Gowtham");
		
		//xpath for SURNAME
		WebElement surNameEle=driver.findElement(By.xpath("//*[@id='u_0_l']"));
		surNameEle.sendKeys("Reddy");
		
		//xpath for Mobile Number
		WebElement mobileEle=driver.findElement(By.xpath("//*[@id='u_0_o']"));
		mobileEle.sendKeys("9966234500");
		
		//xpath for New Password
		WebElement passwordEle=driver.findElement(By.xpath("//*[@id='u_0_v']"));
		passwordEle.sendKeys("Welcome123");
		
		//xpath for selecting Day
		WebElement selDayEle=driver.findElement(By.xpath("//*[@id='day']"));
		selDayEle.click();
		Select day=new Select(selDayEle);
		day.selectByVisibleText("24");
		
		//xpath for selecting Month
		WebElement selMonthEle=driver.findElement(By.xpath("//*[@id='month']"));
		selMonthEle.click();
		Select month=new Select(selMonthEle);
		month.selectByVisibleText("Oct");

		//xpath for selecting Year
		WebElement selYearEle=driver.findElement(By.xpath("//*[@id='year']"));
		selYearEle.click();
		Select year=new Select(selYearEle);
		year.selectByVisibleText("1995");
		selYearEle.click();
		
		//xpath for selecting Gender
		WebElement selMaleEle=driver.findElement(By.xpath("//*[@id='u_0_a']"));
		selMaleEle.click();
		
		//xpath for SignUp
		WebElement signUpEle=driver.findElement(By.xpath("//*[@id='u_0_11']"));
		//signUpEle.click();
		
		
	}

}
