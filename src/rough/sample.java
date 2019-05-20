package rough;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.base.CharMatcher;

import utilities.commonMethods;

public class sample {
	public static WebDriver driver;
public static void main(String[] args) {
	/*System.setProperty("webdriver.chrome.driver","chromeDriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.zoopla.co.uk/");
	driver.findElement(By.name("q")).sendKeys("london");
	driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	List<WebElement> prices = driver.findElements(By.xpath("//*[@class='srp clearfix   ']//a[@class='listing-results-price text-price']"));
	for(int i=0; i<prices.size();i++)
	{
		String price = prices.get(i).getAttribute("innerText");
		commonMethods methods = new commonMethods();
		String correct_price = methods.changeToDigit(price);
		System.out.println(correct_price);		
	}*/
	iterateReverse();
	
	}

public static void iterateReverse()
{
	String s1="442034630652";
	String s2="02034630652";
	if(s1.contains(s1))
	{
		System.out.println("correct");
	}
	else
		System.out.println("no");
	
}
}
