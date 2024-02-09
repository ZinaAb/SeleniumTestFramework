package utils;

import org.openqa.selenium.By;

import utils.Driver;


public class DriverUtilsDemo {

	public static void main (String[] args) {
		ebaySearchTest();
	}
	public static void ebaySearchTest() {
		
		//go to sauceDemo website
		Driver.getDriver().get("https://ebay.com");
		Driver.getDriver().findElement(By.id("gh-ac")).sendKeys(DataReader.getProperty("searchfield"));
		
		Driver.getDriver().findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();
		
		
		
		
	}
}
