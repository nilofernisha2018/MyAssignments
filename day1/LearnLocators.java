package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		WebElement pswd=driver.findElement(By.id("password"));
		pswd.sendKeys("Leaf@1234");
		driver.findElement(By.id("Login")).click();
		//driver.close();
		
		
	}

}
