package com.Baseclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class{
	//1. Browser Lunch
	public static WebDriver driver;
	
	public static WebDriver launchBrowser(String type) {
		if (type.equalsIgnoreCase("Chrome Driver")||type.equalsIgnoreCase("Chrome")||type.equalsIgnoreCase("ChromeDriver")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//driver//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(type.equalsIgnoreCase("firefox")||type.equalsIgnoreCase("fire fox")) {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//driver//geckodriver.exe");
			driver = new FirefoxDriver();	
		}
		else if(type.equalsIgnoreCase("ie")||(type.equalsIgnoreCase("internet explorer"))) {
			System.setProperty("webdriver.ie.driver",System.getProperty("user.dir")+"//driver//IEDriverserver.exe");
			driver = new InternetExplorerDriver();	
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	//2. Close
	public static void close() {
		driver.close();
	}
	
	//3. Quit
	public static void quit() {
		driver.quit();
	}
	
	//4. Navigate to
	public static void navigate_To(String url) {
		driver.navigate().to(url);
	}
	
	//5. Navigate Back
	public static void navigate_Back() {
		driver.navigate().back();
	}
	
	//6. Navigate forward
	public static void navigate_Forward() {
		driver.navigate().forward();
	}
	
	//7. Navigate Refresh
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	//8. Get
	public static void get_ToUrl(String url) {
		driver.get(url);
	}
	
	//9. Get Current URL
	public static void get_CurrentUrl() {
		driver.getCurrentUrl();
	}
	
	//9.1 Get Title
	public static void webpage_Title() {
		driver.getTitle();
	}
	
	//10. IsEnabled
	public static void isEnabled(WebElement name) {
		boolean a = name.isEnabled();
		System.out.println("Is Enabled: "+a);
		
	}
	
	//11. Is Displayed
	public static void isDisplayed(WebElement name) {
		boolean b = name.isDisplayed();
		System.out.println("Is Displayed: "+b);
	}
	
	//12. Get attribute value
	
	public static void attribute_Value(WebElement name) {
		String passed_Value = name.getAttribute("value");
		System.out.println("Value passed: "+passed_Value);
	}
	
	//13. Get attribute type
	
	public static void attribute_type(WebElement name) {
		String attribute_type = name.getAttribute("type");
		System.out.println("Attribute name: "+attribute_type);
	}
	
	//14. Is Selected
	public static void isSelected(WebElement name) {
		boolean c = name.isSelected();
		System.out.println("Is Selected : "+c);
	}
	
	//15. Drop Down
	public static void dropDown(String type, String value, WebElement name) {
		try {
			Select s = new Select(name);
			if (type.equalsIgnoreCase("byindex")) {
				int a = Integer.parseInt(value);
				s.selectByIndex(a);
			}
			else if (type.equalsIgnoreCase("byvalue")){
				s.selectByValue(value);
			}
			else if (type.equalsIgnoreCase("bytext")) {
				s.selectByVisibleText(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// 16. Alert
	public static void switchTo_Alert() {
		driver.switchTo().alert();
	}
	
	// 17. Alert Accept
	public static void alert_Accept() {
		Alert a = driver.switchTo().alert();
		a.accept();
	}
	
	// 18. Alert dismiss
	public static void alert_Dismiss() {
		Alert a = driver.switchTo().alert();
		a.dismiss();
	}
	
	// 19. Alert get text
	public static void alert_getText() {
		Alert a = driver.switchTo().alert();
		String text = a.getText();
		System.out.println("Text from alert: "+text);
	}
	
	// 20. Alert send keys
	public static void alert_InputText(String s) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(s);
	}
	
	//21. Frames
	public static void switchTo_Frame(WebElement name, String type, String value) {
		if (type.equalsIgnoreCase("byindex")) {
			int a = Integer.parseInt(value);
			driver.switchTo().frame(a);
		}
		else if (type.equalsIgnoreCase("byId")) {
			driver.switchTo().frame(value);
		}
		else if (type.equalsIgnoreCase("byWebElement")) {
			driver.switchTo().frame(name);
		}
	}
	//22. Switch to parent frame
		public static void switchTo_Parentcontent() {
			driver.switchTo().parentFrame();
		}
	//23. Switch to default content
		public static void default_Content() {
			driver.switchTo().defaultContent();
		}
	
	//24. Robot UP_key
	public static void robot_UPKey() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}
	
	//25. Robot Down Key
		public static void robot_DownKey() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
	
	//26. Robot Enter Key
			public static void robot_Enter() throws AWTException {
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				}
	
	//27. Wait
			public static void wait(String type, WebElement name, int duration ) {
				if (type.equalsIgnoreCase("implicit")) {
					
					driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
				}
				else if (type.equalsIgnoreCase("explicit")) {
					WebDriverWait wait = new WebDriverWait(driver, duration);
					wait.until(ExpectedConditions.invisibilityOf(name));
				}
				else if (type.equalsIgnoreCase("fluent")) {
					Wait a = new FluentWait(driver).withTimeout(duration,TimeUnit.SECONDS).pollingEvery(duration, TimeUnit.SECONDS).ignoring(Exception.class);
				}
			}
			
	//28. Action Move to element
	public static void actions_MoveToElement(WebElement name) {
		Actions a= new Actions(driver);
		a.moveToElement(name).build().perform();;
	}
	
	//29. Action Click
	public static void actions_Click(WebElement name) {
		Actions a= new Actions(driver);
		a.click(name).build().perform();;
	}
	
	//30. JavaScript Executor Scroll
	public static void javaScript_Scroll(WebElement name) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",name);
	}
	
	//30. JavaScript Executor Click
		public static void javaScript_Click(WebElement name) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click();",name);
		}
	
	//31. Screen Shot
		public static void screenShot(String path) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File Source = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File(path);
			FileUtils.copyFile(Source, dest);
		}
	
	//32. Is Multiple
		public static void is_Multiple(WebElement a) {
			Select s = new Select(a);
			boolean multi = s.isMultiple();
			System.out.println("Is Multiple: "+multi);
		}
	
	//33. Get Options
		public static void getoptions(WebElement b) {
			Select s = new Select(b);
			List<WebElement> options = s.getOptions();
			for (WebElement alloptions : options) {
				String text = alloptions.getText();
				System.out.println("All options are "+text);
			}	
		}
	
	//34. All Selection Selected options
		public static void selectedOptions(WebElement c) {
			Select s = new Select(c);
			List<WebElement> list = s.getAllSelectedOptions();
			for (WebElement selectedoptions: list) {
				String text = selectedoptions.getText();
				System.out.println("All Selected options: "+text);
			}
		}
	
	//35. Delete all Cookies
		public static void delete_AllCookies() {
			driver.manage().deleteAllCookies();
		}
	
	//36. Click
		public static void click(WebElement name) {
			name.click();
		}
	
	//37. Send Keys
		public static void sendKeys(WebElement name, String a) {
			name.sendKeys(a);
		}
	//38. Thread Sleep
		public static void thread_Sleep(int milliseconds) throws InterruptedException {
			Thread.sleep(milliseconds);
		}
		
	//39. Clear
		public static void clear(WebElement name) {
			name.clear();
		}
		
	//40. Select all text CTRL + A & Delete
		public static void ctrlA_Delete(WebElement name) {
			name.sendKeys(Keys.chord(Keys.CONTROL,"a"));
			name.sendKeys(Keys.BACK_SPACE);
			
		}
}	
	

