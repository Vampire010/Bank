package Login;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Login_Ts 
{
	@FindBy(xpath="/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[2]/span/input")
	WebElement Bank_ID;
	
	@FindBy(xpath="/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[4]/span/input")
	WebElement 	User_Name;
	
	
	@FindBy(xpath="/html/body/table/tbody/tr[1]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[6]/span/input")
	WebElement Password;
	
	
	@FindBy(xpath="//*[@id='clicked_when_enter_id']")
	WebElement Login_Btn;
	
	public Login_Ts(WebDriver d)

	{
		PageFactory.initElements(d, this);
	}
	public void test(WebDriver d) throws IOException, InterruptedException
	{
		Login_DataDriven a=new Login_DataDriven();
		Thread.sleep(2000);
		
		String Bankid=a.getdata("Sheet1",2,0);
		String Usr_name=a.getdata("Sheet1",2,1);
		String pssword=a.getdata("Sheet1",2,2);
		
		
		
		Bank_ID.sendKeys(Bankid);
		Thread.sleep(2000);
		
		User_Name.sendKeys(Usr_name);
		Thread.sleep(2000);
		
		Password.sendKeys(pssword);
		Thread.sleep(2000);
		
		
		Login_Btn.click();
		
		
			
			
	}


}
