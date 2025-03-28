package testWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage {
	
	protected WebDriver driver;
	
	@Test
	public void TestWebsite() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://thinking-tester-contact-list.herokuapp.com/");
		driver.findElement(By.id("email")).sendKeys("kushma.nuguri@gmail.com");
		driver.findElement(By.id("password")).sendKeys("praveenm");
		driver.findElement(By.id("submit")).click();
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Thread.sleep(3000);
		driver.findElement(By.id("add-contact")).click();
		Thread.sleep(3000);
		driver.close();
	}

	
	
	

}
