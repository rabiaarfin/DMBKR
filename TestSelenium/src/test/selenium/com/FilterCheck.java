package test.selenium.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FilterCheck {
	SelectTest dr=new SelectTest();
	WebDriver driver=dr.getDriver();
	public  void callDriver() {
		driver.findElement(By.cssSelector("input[id$='searchtextbox']")).sendKeys("cars");
		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		WebElement sel=driver.findElement(By.id("s-result-sort-select"));
		Select sel1=new Select(sel);
		sel1.selectByVisibleText("Price: Low to High");
		
	}
	public void selectBlueRay() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='filters']//li[2]//a")).click();;
		
	}
	public void shut() {
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		
		FilterCheck FC=new FilterCheck();
		FC.callDriver();
		FC.selectBlueRay();
	//	FC.shut();
		
		
	}

}
