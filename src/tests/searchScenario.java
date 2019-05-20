//Author: Mamta GUpta
package tests;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.base;
import pages.agentPage;
import pages.homePage;
import pages.searchResultPage;

public class searchScenario extends homePage {
	// public homePage home=null;

	@Test
	public void serachLondon() throws InterruptedException {
		System.out.println("goping to start execution");

		homePage home = new homePage();
		System.out.println("object has been created");

		Thread.sleep(5000);
		System.out.println("waait has been implemented");

		home.searchProperty();
		System.out.println("click operation has been done");

		searchResultPage search = new searchResultPage();
		System.out.println("object of serach class has ben created");

		Thread.sleep(2000);

		search.printProperties();
		List<String> AgentDataOnListing = search.ge5thAgentData();
		search.click5threcord();
		Thread.sleep(2000);
	System.out.println("agent page has been opened up");
		agentPage agent = new agentPage();
		List<String> AgentPage = agent.getAgentDetails();
		for(int i=0; i<AgentPage.size();i++)
		{
			
		// Assert.assertEquals( AgentPage.get(i), AgentDataOnListing.get(i).contains(AgentPage.get(i)));	
	 Assert.assertTrue(AgentDataOnListing.get(i).contains(AgentPage.get(i)));
			System.out.println("correct "+i+"st time");
	System.out.println(AgentDataOnListing.get(i)+"        "+AgentPage.get(i));
			
			
		}
	}

	

}
