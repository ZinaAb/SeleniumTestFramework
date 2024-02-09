package Page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class EbaySearchCoffeMug {

	//How do we create a page class
	
	//1. we need a class for a page of the application 
	
	
	//2. we need to create a constructor with page factory of selenium
	
	
	
	
	public EbaySearchCoffeMug () {
		PageFactory.initElements(Driver.getDriver(),this);
	}
	
	
	//3. then collect the web elements
	@FindBy(id ="gh-ac")
	public WebElement searchfiled;
	
	
	
	@FindBy(xpath ="//*[@id=\"gh-btn\"]")
	public WebElement searchBtn;
	
	 @FindBy(xpath = "//span[@class=\"s-item__price\"]")
	public List<WebElement> items;
	
	
		
		
	

}