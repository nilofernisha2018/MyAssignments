package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//Login details and landing to home page
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		//Company name using Id locator
		WebElement element=driver.findElement(By.id("createLeadForm_companyName"));
		element.sendKeys("NewCompany");
		
		//First name using Id locator
		WebElement element1=driver.findElement(By.id("createLeadForm_firstName"));
		element1.sendKeys("Mehdiya");
		
		//Last name using id locator
		WebElement element2=driver.findElement(By.id("createLeadForm_lastName"));
		element2.sendKeys("Omera");
		
		//Local name using id locator
		WebElement element3=driver.findElement(By.id("createLeadForm_firstNameLocal"));
		element3.sendKeys("Arsh");
		
		//depart name ,description,email
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Edit lead script");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sweetynilo20@gmail.com");
		
		//State/Province
		WebElement sel=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sel1=new Select(sel);
		sel1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		
		//Edit Lead
		driver.findElement(By.linkText("Edit")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Edit successfully completed");
		driver.findElement((By.xpath("//input[@value='Update']"))).click();
		
		//title of the page 
		String title = driver.getTitle();
        System.out.println(title);
        
        //closing the browser
       // driver.close();
		
		
	}

}
