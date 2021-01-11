package test.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest1 {
	

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C://selenium//MyWorkSpace//TestSelenium//driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://amazon.com");
		String title=driver.getTitle();
		String ExpectedResult="Amazon";
		//System.out.println(title);
		if(title.contains(ExpectedResult)) {
			System.out.println("Test Pass");
		}
		else
		{
			System.out.println("Test Fail");
		}
		System.out.println("**************Locators Test*******************");
		WebElement logo=driver.findElement(By.id("nav-logo-sprites")); // id   
		System.out.println(logo.isDisplayed());
		driver.findElement(By.linkText("Best Sellers")).click(); // link text
		driver.navigate().back();
		driver.findElement(By.partialLinkText("Today's")).click();
		driver.navigate().back();
		driver.findElement(By.cssSelector("input[id$='searchtextbox']")).sendKeys("watch");
		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		
		driver.navigate().back();
		driver.findElement(By.className("icp-nav-flag")).click();
		driver.navigate().back();
		System.out.println(driver.findElement(By.cssSelector(" div.a-cardui-header > h2")).getText());
		driver.findElement(By.cssSelector("a[aria-label$='deals']")).click();
		System.out.println(driver.getTitle());
		//driver.close();

	}

}
