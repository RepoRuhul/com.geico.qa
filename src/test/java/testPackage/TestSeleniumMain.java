package testPackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSeleniumMain {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\mdnas\\eclipse-workspace\\com.progressive.2022\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.geico.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement element = driver.findElement(By.xpath("(//div[@class='zip-code-form'])[1]"));
		element.click();
		element = driver.findElement(By.id("(//div[@class='product-checkbox'])[1]"));
		element.click();
		element = driver.findElement(By.tagName("h1"));
		System.out.println("The title of the page is : " + element.getText());
		String url = driver.getCurrentUrl();
		System.out.println("Current URL : " + url);
		String modifiedUrl = url.substring(0, url.indexOf("?"));
		System.out.println(modifiedUrl);
		Assert.assertEquals(modifiedUrl, "https://www.amazon.com/ap/signin");
	}
}
