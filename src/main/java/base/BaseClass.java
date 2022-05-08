package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import commons.CommonActions;
import io.github.bonigarcia.wdm.WebDriverManager;
import objects.MainPage;
import objects.StartPage;
import objects.ZipCodePage;

public class BaseClass {

	public static WebDriver driver;
	protected MainPage mainPage;
	protected CommonActions commonActions;
	protected ZipCodePage zipCodePage;
	protected StartPage startPage;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.geico.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		initClasses();
	}
	
	@AfterMethod
	public void cleaningUp() {
		driver.quit();
	}
	
	private void initClasses() {
		commonActions = new CommonActions();
		mainPage = new MainPage(driver);
		zipCodePage = new ZipCodePage(driver);
		startPage = new StartPage(driver);
	}
	
}
