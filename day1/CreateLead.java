package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//Login details , homepage 
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Company name using Id locator
		WebElement element=driver.findElement(By.id("createLeadForm_companyName"));
		element.sendKeys("MyCompany");
		
		//First name using Id locator
		WebElement element1=driver.findElement(By.id("createLeadForm_firstName"));
		element1.sendKeys("Nilofer");
		
		//Last name using id locator
		WebElement element2=driver.findElement(By.id("createLeadForm_lastName"));
		element2.sendKeys("Nisha");
		
		//Local name using id locator
		WebElement element3=driver.findElement(By.id("createLeadForm_firstNameLocal"));
		element3.sendKeys("Nisha");
		
		//dept name,desc,email
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("My first automation script");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sweetynilo20@gmail.com");
		
		//selecting the state
		WebElement sel=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sel1=new Select(sel);
		sel1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		
		//title of the page 
		String title = driver.getTitle();
        System.out.println(title);
        driver.close();
		
		
		
	}

}
