import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestEmail {

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
		
		List<WebElement> AR_allemail = driver.findElements(By.xpath("//div[@id='divSubject']"));
		Thread.sleep(8000);
		//wait.until(ExpectedConditions.visibilityOfAllElements(allemail));
		System.out.println("Total email in inbox: "+AR_allemail.size());
		
		for(WebElement ele: AR_allemail){
			String armail=ele.getText();
			if(armail.equalsIgnoreCase("Congratulations on your new position at BAYADA! Information needed before you begin.")){
			ele.click();
			break;}}
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//font[text()='click here']")));
		driver.findElement(By.xpath("//font[text()='click here']")).click();

	}

}
