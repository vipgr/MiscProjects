package wiproassignment.gilleteproject_TestUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import io.github.bonigarcia.wdm.WebDriverManager;



public class TestBase {

	
	protected  WebDriver driver;
	public static Properties prop;
	public  WebElement element;
	String text;
	boolean status;
	public  TestBase(WebDriver driver) throws IOException {
			driver = this.driver;
			prop = new Properties();
			FileInputStream fis = new FileInputStream("D:\\Project\\JavaSelenium\\gilleteproject\\src\\test\\java\\wiproassignment\\gilleteproject_config\\basicConfig.properties");
			prop.load(fis);
	

	}
	
	
	public void  driverIntialization(){
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome")){
				//System.getProperty("webdriver.chrome.driver",".//Resources/Drivers/chromedriver.exe");
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}else if(browserName.equalsIgnoreCase("firefox")){
				//System.getProperty("webdriver.firefox.driver", ".//Resources/Drivers/geckodriver.exe");
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}else{
				//System.getProperty("webdriver.ie.driver",".//Resources/Drivers/IEDriverServer.exe");
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
			}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.pageLoadTimeout,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.implicitWait, TimeUnit.SECONDS);
		System.out.println("Browser launched ..");

	}	
	
	public  void launchUrl() {
		driver.get(prop.getProperty("url"));
		System.out.println("entered url in the browser");
	}
	
	public   String  getTitle() {
		return driver.getTitle();
	}


	public boolean isDisplay(WebElement element) {
		try {
			element.isDisplayed();
			return true;
		} catch (Throwable t) {
			t.getStackTrace();
			System.out.println("element is not displayed");
			return false;
		}

	}
	
	public  boolean clickWebelement(WebElement element) {
		try {
			// boolean elementIsClickable = element.isEnabled();
			if (element.isEnabled() || element.isDisplayed()) {

				element.click();

				return true;
			}

		} catch (Throwable t) {
			t.printStackTrace();
			System.out.print("Element not present");
			return false;
		}
		return false;
	}

	

	public  boolean findElementAndFillText(WebElement element, String textNeedToPass) {
		try {
		
			if (textNeedToPass != null) {
				status = this.clickWebelement(element);
				if (status) {

					element.clear();
					element.sendKeys(textNeedToPass);
					return true;
				}
			}

		} catch (Throwable t) {
			t.printStackTrace();
			System.out.print("text to fill need not be empty");
		}
		return false;

	}

	public  void clearTextField(WebElement element) {
		element.clear();
	}

}
