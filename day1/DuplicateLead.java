package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

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
		element.sendKeys("Samsung");
		
		//First name using Id locator
		WebElement element1=driver.findElement(By.id("createLeadForm_firstName"));
		element1.sendKeys("Mohamed");
		
		//Last name using id locator
		WebElement element2=driver.findElement(By.id("createLeadForm_lastName"));
		element2.sendKeys("Arsh");
		
		//Local name using id locator
		WebElement element3=driver.findElement(By.id("createLeadForm_firstNameLocal"));
		element3.sendKeys("Tharik");
		
		//dept name,desc,email
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Development");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Leaftaps");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sweetynilo20@gmail.com");
		
		//selecting the state
		WebElement sel=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select sel1=new Select(sel);
		sel1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		
		//Getting the title of the page
		System.out.println(driver.getTitle());
        	if (driver.getTitle().contains("View")){
        		System.out.println("Title is confirmed");
        	}
        	else {
        		System.out.println("Title is not confirmed");
        	}
        
        //Duplicate Lead
        driver.findElement(By.linkText("Duplicate Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).clear();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Apple");
        driver.findElement(By.id("createLeadForm_firstName")).clear();
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vaji");
        
        //Getting title of the page
    	
    	System.out.println(driver.getTitle());
    	if (driver.getTitle().contains("Duplicate")){
    		System.out.println("Title is confirmed");
    	}
    	else {
    		System.out.println("Title is not confirmed");
    	}
        
    	driver.findElement(By.className("smallSubmit")).click();
    	
    	
    	
        
        

	}

}
