import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationRegdProject {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("https://tutorialsninja.com/demo")).click();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("your first name here");
		driver.findElement(By.id("input-lastname")).sendKeys("your lastr name here");
		driver.findElement(By.id("input-email")).sendKeys("bhabanniiii@gmail.com");
		driver.findElement(By.id("input-telephone")).sendKeys("123456789");
		driver.findElement(By.id("input-password")).sendKeys("1234");
		driver.findElement(By.id("input-confirm")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@value='0']")).click();
		driver.findElement(By.xpath("//b[text()='Privacy Policy']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='close']")).click();
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		System.out.println(driver.findElement(By.id("content")).getText());
		driver.close();
	}
}
