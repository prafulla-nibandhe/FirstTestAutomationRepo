package TestCase1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.StringCoercer;

public class TestCaseClass1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
		Thread.sleep(5000);
		//WebElement txtUserNm=driver.findElement(By.name("username"));
		//txtUserNm.sendKeys("Admin");
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		String FrmTitle=driver.getTitle();
		String ExptTitle="OrangeHRM";
		
		if(FrmTitle.equals(ExptTitle))
		{
			System.out.println("Test Passed !!!");
		}
		else
		{
			System.out.println("Test Failed !!!");
		}
		driver.quit();
		
	}

}
