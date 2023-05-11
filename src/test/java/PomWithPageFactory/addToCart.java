package PomWithPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class addToCart {
	
public WebDriver driver;
	
	public addToCart(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@class='Input__InputField-sc-q4csvm-4 ubQZa']")
	WebElement pin_code;
	
	@FindBy(xpath="//button[@id='add_to_cart_main_btn']")
	WebElement add_toCart;
	
	@FindBy(xpath ="//select[@id='select-qty-493665804']")
	WebElement select_qty;
	
	@FindBy(xpath="//span[contains(text(),'Move to wishlist')]")
	WebElement moveTo_Wishlist;
	
	@FindBy(xpath ="//input[@id='lMobileNumber']")
	WebElement moblie_Number;
	
	@FindBy(xpath ="(//button[@type='button'])[4]")
	WebElement proceed_btn;
	
	
	
	public void pinCode()
	{
		pin_code.click();
		pin_code.sendKeys("560078");
	}

	public void addToCart()
	{
	add_toCart.click();
	}
	
	public void selectqty()
	{
		Select s = new Select(select_qty);
		s.selectByIndex(1);
	}
	
	public void MoveToWishList()
	{
		moveTo_Wishlist.click();
	}
	
	public void MoblieNumber()
	{
		moblie_Number.click();
		moblie_Number.sendKeys("8669253029");
	}
	
	public void ProceedBtn()
	{
		
		Actions act = new Actions(driver);
		act.moveToElement(proceed_btn).click().build().perform();
		
	}
	
	
	
}
