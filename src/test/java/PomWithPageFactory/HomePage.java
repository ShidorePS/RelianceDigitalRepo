package PomWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//button[@id='wzrk-confirm']")
	WebElement popUp_Btn;
	
	
	@FindBy(xpath="//input[@id='suggestionBoxEle']")
	WebElement input_box;
	
	@FindBy(xpath="//i[@class='fa fa-search']")
	WebElement search_Btn;
	
	@FindBy(xpath="//p[contains(text(),'Apple iPhone 14 128')]")
	WebElement iphone_is;
	
	
	public void popUp()
	{
		popUp_Btn.click();
	}
	
	public void inputBox()
	{
		input_box.click();
		input_box.sendKeys("iphone14");
	}
	
	public void searchbtn()
	{
		search_Btn.click();
	}
	
	public void iphone14()
	{
		iphone_is.click();
	}
	
	
	
}
