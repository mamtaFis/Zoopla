package pages;

import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.base;
import utilities.commonMethods;

public class agentPage extends base{
	
	@FindBy(xpath="//*[@class='dp-sidebar-wrapper']//h2")
	public WebElement agent_name;
	
	
	@FindBy(xpath="//*[@class='dp-sidebar-wrapper__contact']//a[@class='ui-link']")
	public WebElement agent_no;
	
	
	public List<String> getAgentDetails()
	{
		String agentName=agent_name.getAttribute("innerText");
		String agentNo=agent_no.getAttribute("innerText");
		List<String> AgentDetail = new LinkedList();
		
		commonMethods methods = new commonMethods();
		String mobile= methods.changeToDigit(agentNo);
		AgentDetail.add(agentName);
		AgentDetail.add(mobile);
		
		return AgentDetail;
		
	}
	
	
	public agentPage()
	{
		PageFactory.initElements(driver, this);
	}
	

}
