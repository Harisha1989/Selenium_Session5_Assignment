package seleniumpackage;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class jcpenny {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();*/
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		//loading the "https://jcpenny.com" to the driver
		driver.navigate().to("https://jcpenny.com");
		
		//passing the element for continuing to the main page
		WebElement continueEle=driver.findElement(By.xpath("//button[text()='Continue Shopping']"));
		continueEle.click();

		//passing the Search textbox as an element
		WebElement searchTxtEle=driver.findElement(By.xpath("//input[@id='searchTerm']"));
		js.executeScript("arguments[0].click()", searchTxtEle);

		//passing the input to the search textbox
		searchTxtEle.sendKeys("shirts");

		//clicking on search
		WebElement searchButEle=driver.findElement(By.xpath("//button[@title='search']"));
		js.executeScript("arguments[0].click()", searchButEle);

		//selecting the first shirt
		WebElement shirtSelEle=driver.findElement(By.xpath("(//img[contains(@class,'pro')])[1]"));
		shirtSelEle.click();

		//scrolling down
		js.executeScript("window.scrollBy(0,500)");

		//adding selected item to the bag
		WebElement addEle=driver.findElement(By.xpath("//button[@name='add to bag']"));
		addEle.click();

		//When click on Add to bag, this will ask to select size and color of the shirt
		//selecting the size

		WebElement sizeSelEle=driver.findElement(By.xpath("//select[@id='SIZE']"));
		Select sizeSel=new Select(sizeSelEle);
		sizeSel.selectByIndex(1);

		//selecting color of the shirt
		WebElement colorSelEle=driver.findElement(By.xpath("//*[@id='COLOR']/li[1]/img"));
		colorSelEle.click();

		//After selecting now click on Add to bag
		WebElement addEleFinal=driver.findElement(By.xpath("//button[@name='add to bag']"));
		addEleFinal.click();

		//this will go to frame. We need to switch to frame from the driver in order to proceed to checkout.
		driver.switchTo().frame("modalIframe");
		
		//clicking on checkout
		WebElement checkEle=driver.findElement(By.xpath("//input[@id='btncheckout']"));
		checkEle.click();
		
		//Switching back to the window from frame
		driver.switchTo().defaultContent();
		
		//clicking on final checkout
		WebElement checkoutEle=driver.findElement(By.xpath("(//input[@id='Checkout'])[1]"));
		checkoutEle.click();
		
		//after clicking on the final checkout, this will ask for login ID and Password.
		
	}

}
