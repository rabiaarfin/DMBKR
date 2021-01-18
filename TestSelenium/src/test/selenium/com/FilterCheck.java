package test.selenium.com;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FilterCheck {
	SelectTest dr=new SelectTest();
	WebDriver driver=dr.getDriver();
	public  void callDriver() throws InterruptedException {
		driver.findElement(By.cssSelector("input[id$='searchtextbox']")).sendKeys("cars");
		driver.findElement(By.cssSelector("input#nav-search-submit-button")).click();
		WebElement sel=driver.findElement(By.id("s-result-sort-select"));
		Select sel1=new Select(sel);
		sel1.selectByVisibleText("Price: Low to High");	
	}
	public void selectBlueRay() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		List<WebElement> pics=driver.findElements(By.xpath("//ul[@aria-labelledby='p_n_format_browse-bin-title']//li//a"));
		for(int i=0; i<pics.size();i++) {
			System.out.println(pics.get(i).getText());
			if(pics.get(i).getText().contains("3D")) {
			System.out.println(pics.get(i).isDisplayed());
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			pics.get(i).click();
			System.out.println("I am clicked");
			break;
			
			}
			
		}	
		
	}
	
public void selectPrice(String pr) {
		
		List <WebElement> price=driver.findElements(By.xpath("//a[@class='a-size-base a-link-normal a-text-normal']"));
		for(WebElement i:price) {
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			if(i.getText().contains(pr)){
			
				System.out.println("yes I am here"+i.getText());
				i.click();

				break;
			}
		}}			
	
	public void shut() {
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		
		FilterCheck FC=new FilterCheck();
		//PriceCheck pc=new PriceCheck();
		FC.callDriver();
		FC.selectBlueRay();
		
		FC.selectPrice("15");
	//FC.shut();
		
		
	}

}
