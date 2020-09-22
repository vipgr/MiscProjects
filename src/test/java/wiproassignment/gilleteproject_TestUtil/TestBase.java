package wiproassignment.gilleteproject_TestUtil;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;



public class TestBase {

	Logger log = Logger.getLogger(TestBase.class);
	protected static  WebDriver driver;
	public static Properties prop;
	public  WebElement element;
	String text;
	boolean status;
	public   TestBase(WebDriver driver1) throws IOException {
			driver = driver1;
			prop = new Properties();
			FileInputStream fis = new FileInputStream("D:\\Project\\JavaSelenium\\gilleteproject\\src\\test\\java\\wiproassignment\\gilleteproject_config\\basicConfig.properties");
			prop.load(fis);

	}
	
	
	public WebDriver  driverIntialization(){
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
		return driver;
	}	
	
	public  void launchUrl(String url) {
		try {
		driver.get(url);
		log.info("entered url in the browser");
		}catch (Throwable t) {
			t.printStackTrace();
			log.info("url cannot be launched ");
		}
	}
	
	public   String  getTitle() {
		try {
		return driver.getTitle();
		}catch(Throwable t) {
			t.printStackTrace();
		}
		return text;
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
			waitForElement(element,TestUtil.timeOutInSeconds);
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
	
	public WebDriver getDriver() {
		return driver;
	}
	
	
	public void closeBrowser() {
		driver.quit();
	}
	
	public void selectionValFromDrpDwn(WebElement element,String value) {
		try {
		Select monthYear = new Select(element);
		monthYear.selectByVisibleText(value);
		log.info("able to select the value");
		}catch(Throwable t) {
			t.printStackTrace();
			log.info("unable to select the value ");
		}
		
	}
	
	public void checkBoxSelection(WebElement element) {

		element.click();
	}
	
	public void waitForElement(WebElement element, int timeOutInSeconds) {
		log.info("waiting for :" + element.toString() + " for :" + timeOutInSeconds + " seconds");
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		WebElement ele=wait.until(ExpectedConditions.visibilityOf(element));
		log.info("element is visible now"+ele);
	}
	
	public String getText(WebElement element) {
		driver.navigate().refresh();
		waitForElement(element,TestUtil.timeOutInSeconds);
		String text = element.getText();
		return text;	
	}
	
	public String getTextwithourRefresh(WebElement element) {

		waitForElement(element,TestUtil.timeOutInSeconds);
		String text = element.getText();
		return text;	
	}
	
}
