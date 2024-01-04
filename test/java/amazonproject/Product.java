package amazonproject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Product {
	public static WebDriver driver;

	@Test
	public void Browseropen() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Amazon", Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[text()='Amazon.in']")).click();
		Thread.sleep(3000);
		WebElement box = driver.findElement(By.id("twotabsearchtextbox"));
		box.sendKeys("lcd  pad");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath(
				"//span[text()='Toysbuddy Re-Writable LCD Writing Tablet Pad with Screen 21.5cm (8.5Inch) for Drawing, Playing, Handwriting Best Birthday Gifts for Adults & Kids Girls Boys, Multicolor']"))
				.click();
		Set<String> s = driver.getWindowHandles();
		ArrayList array = new ArrayList(s);
		System.out.println(array.get(0));
		System.out.println(array.get(1));
		driver.switchTo().window((String) array.get(1));
		Select value = new Select(driver.findElement(By.xpath("//select[@class='a-native-dropdown a-declarative']")));
		value.selectByValue("1");
		Thread.sleep(7000);
		driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'a-input-text a-span12')]")).sendKeys("");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		driver.findElement(By.name("code")).click();
		Thread.sleep(7000);
		Set<String> s1 = driver.getWindowHandles();
		ArrayList array1 = new ArrayList(s1);
		System.out.println(array1.get(1));
		System.out.println(array1.get(1));
		driver.switchTo().window((String) array1.get(1));
		Thread.sleep(20000);
    	driver.findElement(By.xpath("(//input[@class='a-button-input'])[2]")).click();
    	driver.findElement(By.xpath("(//input[@class='a-button-input a-button-text'])[3]")).click();

	}

}
