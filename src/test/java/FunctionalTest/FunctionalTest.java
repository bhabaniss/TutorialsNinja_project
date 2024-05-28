package FunctionalTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FunctionalTest {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("https://tutorialsninja.com/demo")).click();
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("bhabaniss@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		System.out.println(driver.findElement(By.xpath("//a[text()='Account']")).getText());
		driver.findElement(By.name("search")).sendKeys("hp");
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		driver.findElement(By.linkText("HP LP3065")).click();
		WebElement quantity = driver.findElement(By.id("input-quantity"));
		quantity.clear();
		quantity.sendKeys("2");
		driver.findElement(By.id("button-cart")).click();
		WebElement sucStatus = driver.findElement(By.xpath("//div[text()='Success: You have added ']"));
		System.out.println(sucStatus.getText());
		System.out.println(sucStatus.isDisplayed());
		driver.findElement(By.xpath("//span[text()='Shopping Cart']")).click();
		driver.findElement(By.linkText("Checkout")).click();
		Thread.sleep(2000);
		
		//if you are ordering first time then uncomment this
		
//		driver.findElement(By.xpath("//input[@id='input-payment-firstname']")).sendKeys("bhabani");
//		driver.findElement(By.xpath("//input[@id='input-payment-lastname']")).sendKeys("sahoo");
//		driver.findElement(By.xpath("//input[@id='input-payment-company']")).sendKeys("KosNest");
//		driver.findElement(By.xpath("//input[@id='input-payment-address-1']")).sendKeys("my address here");
//		driver.findElement(By.xpath("//input[@id='input-payment-address-2']")).sendKeys("my address 2 here");
//		driver.findElement(By.xpath("//input[@id='input-payment-city']")).sendKeys("Banglore");
//		driver.findElement(By.xpath("//input[@id='input-payment-postcode']")).sendKeys("560036");
//		WebElement country = driver.findElement(By.xpath("//div/select[@id='input-payment-country']"));
//		country.click();
//		country.findElement(By.xpath("//option[@value='99']")).click();
//		WebElement State = driver.findElement(By.xpath("//div/select[@id='input-payment-zone']"));
//		State.click();
//		State.findElement(By.xpath("//option[@value='1489']")).click();
		
		driver.findElement(By.id("button-payment-address")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("button-shipping-address")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='button-shipping-method']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='button-payment-method']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("button-confirm")).click();
		WebElement status1 = driver.findElement(By.xpath("//p[text()='Your order has been successfully processed!']"));
		
		System.out.println(status1.getText());
		driver.findElement(By.linkText("Continue")).click();
		
		driver.findElement(By.xpath("//span[text()='My Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Order History")).click();
	}

}
