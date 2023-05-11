package PomWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
	
	public WebDriver driver;
	
	public Registration(WebDriver driver)
	{
		this.driver =driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//input[@class='Input__InputField-sc-q4csvm-4 ubQZa']")
	WebElement first_name;
	
	@FindBy(xpath="//input[@id='reg-lname']")
	WebElement last_name;
	
	@FindBy(xpath="//input[@id='reg-email']")
	WebElement email;
	
	@FindBy(xpath="(//button[@type='button'])[4]")
	WebElement verify_emailBtn;
	
	@FindBy(xpath="//input[@id='reg-mnumber']")
	WebElement mob_no;
	
	@FindBy(xpath="(//button[@type='button'])[4]")
	WebElement proceed_Btn;
	
	@FindBy(xpath="//span[@class='Checkbox__CheckboxCheckmark-sc-1mkjfrp-3 bDNwSd']")
	WebElement check_box;
	
	
	public void firstname()
	{
		first_name.click();
		first_name.sendKeys("Poonam");
	}
	
	public void lastname()
	{
		last_name.click();
		last_name.sendKeys("Patil");
	}
	
	public void email()
	{
		email.click();
		email.sendKeys("poonamshidore93@gmail.com");
	}
	
	public void verifyemail()
	{
		verify_emailBtn.click();	
	}
	
	public void mobileno()
	{
		mob_no.click();
		mob_no.sendKeys("8669253029");
	}
	public void proceed()
	{
		proceed_Btn.click();
	}
	public void checkbox()
	{
		check_box.click();
	}
}
