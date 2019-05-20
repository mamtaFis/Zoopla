package base;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import utilities.commonMethods;

public class base {
	
	public static WebDriver driver=null;
	commonMethods methods;
	Properties prop;
	
	
   @BeforeSuite
	public void init() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		methods = new commonMethods();
		prop = methods.readProperties();
		System.out.println(prop.getProperty("url"));
		driver.get(prop.getProperty("url"));
		Thread.sleep(5000);
		
		
	}

}
