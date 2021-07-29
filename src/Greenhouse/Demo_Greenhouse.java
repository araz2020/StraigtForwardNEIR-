package Greenhouse;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_Greenhouse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Users\\\\arazzak\\\\Documents\\\\Abdur R Docs\\\\Abdurs_Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://app2.greenhouse.io/users/sign_in");  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(7000, TimeUnit.SECONDS);
		
		driver.findElement(By.id("user_email")).sendKeys("aurzak15@gmail.com");
		driver.findElement(By.id("submit_email_button")).click();
		driver.findElement(By.id("user_password")).sendKeys("asumonraiyan");
		driver.findElement(By.xpath("//body[1]/div[2]/div[2]/div[1]/form[1]/div[2]/div[6]/button[1]/span[1]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'All Candidates')]")).click();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("AR-OfficeEmp24 Test-0024"+"\n");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//table[@class='person']/tbody/tr/td[2]/p")).click();
		//driver.findElement(By.xpath("//*[@class='name']/a")).click();

		
	}

}
