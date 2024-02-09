package utils;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Page.EbaySearchCoffeMug;
import utils.BrowserUtils;
import utils.DataReader;
import utils.Driver;


public class EbaySearchObjectDemo {
	
	public static void main(String[] args) throws InterruptedException {
		ebaysearchDemo();
	}
	public static void ebaysearchDemo() throws InterruptedException {
		EbaySearchCoffeMug searchPage = new  EbaySearchCoffeMug  ();
		BrowserUtils utils = new BrowserUtils();
		
		//go to website
		Driver.getDriver().get(DataReader.getProperty("ebay_url"));
		
		Thread.sleep(2000);
		
		
		searchPage.searchfiled.sendKeys(DataReader.getProperty("searchfield"));
			
		//click search
		searchPage.searchBtn.click();
		
		//Print list of items and their price
		for (WebElement items: searchPage.items)
		{
			System.out.println("The list of item price is -  " + items.getText());
			}
	
		
		//Driver.quitDriver();
		
		
		
		
		
		
		
		
		
	}
}