package test.selenium.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTest {
	public WebDriver driver;
	public Select dropDownA;
	WebElement dropdownAll;
	public WebDriver getDriver() {
	System.setProperty("webdriver.chrome.driver", "C://selenium//MyWorkSpace//TestSelenium//driver//chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://amazon.com");
	String title=driver.getTitle();
	System.out.println("Page Title="+title);
	return driver;
	}
	
	public void selectElementByIndex(int index) {
	getDriver();
	dropdownAll=driver.findElement(By.id("searchDropdownBox"));
	dropDownA=new Select(dropdownAll);
	//sdropDownA.selectByVisibleText("   Girls");
	dropDownA.selectByIndex(5);

		
	}
	public void selectItemList() {
		List<WebElement> select=dropDownA.getOptions();
		dropDownA=new Select(dropdownAll);

	for(int i=0; i<select.size(); i++) {
		System.out.println(select.get(i).getText());
		
	}
	}
	public void closeDriver() {
		driver.close();
	}

	public static void main(String[] args) {
		//sdropDownA.selectByVisibleText("   Girls");
		SelectTest st=new SelectTest();
		st.selectElementByIndex(5);
		st.selectItemList();
		st.closeDriver();

	}

}
