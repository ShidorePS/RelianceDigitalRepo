package TestClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import PomWithPageFactory.*;

public class LoginTest {
	
	WebDriver driver;
	HomePage hp;
	addToCart cart;
	Registration r;
	
	
	@BeforeClass
	void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.reliancedigital.in/");
		driver.manage().window().maximize();	
	}
	
	@Test(priority=1)
	void test1()
	{
		hp=new HomePage(driver);
		cart = new addToCart(driver);
		r= new Registration(driver);
	}
	
	@Test(priority=2)
	void test2()
	{
		hp.popUp();
		hp.inputBox();
		hp.searchbtn();
		hp.iphone14();
	}
	@Test(priority=3)
	
	void test3() throws InterruptedException
	{
		Thread.sleep(2000);
		for (String windowHandle : driver.getWindowHandles()) 
			driver.switchTo().window(windowHandle);
		cart.pinCode();
		
		Thread.sleep(2000);
		cart.addToCart();
		
		Thread.sleep(2000);
		cart.selectqty();
		
		Thread.sleep(2000);
		cart.MoveToWishList();
		
		
		cart.MoblieNumber();
		Thread.sleep(2000);
		cart.ProceedBtn();
	}
	
	@Test(priority=4)
	void test4() throws InterruptedException
	{
		Thread.sleep(2000);
		r.firstname();
		r.lastname();
		r.email();
		r.verifyemail();
		r.mobileno();
		r.proceed();
		r.checkbox();
	}
	

}
