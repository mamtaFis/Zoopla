package pages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.base;
import utilities.commonMethods;

public class searchResultPage extends base {

	@FindBy(xpath = "//*[@class='srp clearfix   ']//a[@class='listing-results-price text-price']")
	public List<WebElement> priceList;

	@FindBy(xpath = "//*[@alt='Marketed by Cubitt & West - Wallington']")
	public WebElement fifth_logo;

	@FindBy(xpath = "//*[@data-role='listview']//li[@class='srp clearfix   '][5]//span//*[@class='listing-results-address']")
	public WebElement fifth_agentName;

	@FindBy(xpath = "//*[@data-role='listview']//li[@class='srp clearfix   '][5]//span[@class='agent_phone']")
	public WebElement fifth_agentPhoneNumer;

	@FindBy(xpath="//*[contains(@id,'listing_')][5]//a[@class='listing-results-price text-price']")
	               
	public WebElement priceLink;
	
	public void printProperties() {
		commonMethods methods = new commonMethods();
		String[] prices = new String[priceList.size()];

		Set<String> set = new TreeSet();

		for (int i = 0; i < priceList.size(); i++) {

			String unSortedValue = priceList.get(i).getAttribute("innerText");
			String result = methods.changeToDigit(unSortedValue);
			set.add(result);
		}
	//	System.out.println("before sorting values are:  " + set);
		ArrayList list = new ArrayList(set);
		System.out.println("---after sorting---");
		for(int i=list.size()-1; i>=0; i--)
		{
			System.out.println(list.get(i));
		}
		

	}
	
	public List<String> ge5thAgentData()
	{
		System.out.println("going to get 5th agent's name and mobile no");
	
		//System.out.println("Agent's logo is:   "+fifth_logo.getAttribute("innerText"));
		String Agent_name=fifth_agentName.getAttribute("innerText");
		String Agent_no=fifth_agentPhoneNumer.getAttribute("innerText");
		commonMethods methods = new commonMethods();
		String mobile=	methods.changeToDigit(Agent_no);
		
        List<String> list = new LinkedList();
        list.add(Agent_name);
        list.add(mobile);
       
       
      //  priceLink.click();
        return list;
	}
	
	public void click5threcord()
	{
		 Actions action = new Actions(driver); 
		 driver.navigate().refresh();
		action.moveToElement(priceLink).click().build().perform();
	}

	public searchResultPage() {
		PageFactory.initElements(driver, this);
	}
}
