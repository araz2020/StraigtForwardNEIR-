import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EmailNEIR {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\arazzak\\Documents\\Abdur R Docs\\Abdurs_Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://home.bayada.com/Recruiting/Pages/New%20Hire%20Management%20Portal.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.findElement(By.id("okta-signin-username")).sendKeys("Arazzak");
		Thread.sleep(4000);
		driver.findElement(By.id("okta-signin-password")).sendKeys("Ayan2213Raiyan");
		Thread.sleep(4000);
		driver.findElement(By.id("okta-signin-submit")).click();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Email")));
		//Thread.sleep(8000);
		driver.findElement(By.linkText("Email")).click();
		//Thread.sleep(6000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='login']")));
		driver.findElement(By.xpath("//input[@id='login']")).sendKeys("arazzak");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("b@yada1975ar");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Log_On']")).click();
		//Thread.sleep(10000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@id='divSubject'])[1]")));
		driver.findElement(By.xpath("(//div[@id='divSubject'])[6]")).click();   // Change the Index after Execution If Required:------>>>>>
		//Thread.sleep(4000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//font[text()='click here']")));
		driver.findElement(By.xpath("//font[text()='click here']")).click();
		Thread.sleep(8000);
		
		
		String currentwindow=driver.getWindowHandle();
		System.out.println("This is Home page");
//===========================================================Up to here is done
		Set<String> setwin =driver.getWindowHandles();
		
				Iterator<String> itr= setwin.iterator();
				while(itr.hasNext()){
					String child1=itr.next();
			    if(!currentwindow.equals(child1)) {   
					driver.switchTo().window(child1);
					driver.manage().window().maximize();
					//Thread.sleep(4000);
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='firstname']")));
					driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("AR-OfficeEmp1");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Test-001");
					Thread.sleep(2000);
					
					driver.findElement(By.xpath("//input[@name='birthdatemonth']")).sendKeys("12");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@name='birthdateday']")).sendKeys("21");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@name='birthdateyear']")).sendKeys("1994");
					Thread.sleep(2000);
					
					driver.findElement(By.xpath("//input[@id='ssn']")).sendKeys("469852369");
					Thread.sleep(2000);
					
					driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("4300 Haddonfield Road");
					Thread.sleep(2000);
					driver.findElement(By.xpath("//input[@name='city']")).sendKeys("Pennsauken");
					Thread.sleep(2000);
					
					
					WebElement chooseState = driver.findElement(By.xpath("//span[text()='Choose a State']"));
					chooseState.click();
					Thread.sleep(4000);

					List<WebElement> allstates = driver.findElements(By.xpath("//div[@class='k-list-scroller']/ul/li"));
					System.out.println("Available states: " +allstates.size());

					for (WebElement ele : allstates) {
						String state = ele.getText();
						if (state.equalsIgnoreCase("New Jersey")) {
							ele.click();
							break;
						}
					}
					driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("08109");
					Thread.sleep(2000);
					
					driver.findElement(By.xpath("//body/div[@id='content-container']/div[1]/input[1]")).click();
					//Thread.sleep(6000);
					
					wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='checkbox']")));
					driver.findElement(By.xpath("//input[@type='checkbox']")).click();
					Thread.sleep(4000);
					driver.findElement(By.xpath("//body/div[@id='content-container']/div[2]/div[7]/input[2]")).click();
					
					
					break;
					} }
	}

}
