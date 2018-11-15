package Acount_creation.Bank;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Login.Login_DataDriven;

public class New_Deposit_Account_TS 
{
	@FindBy(xpath="/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[1]/td[3]/img[3]")
	WebElement Accounts;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/table/tbody/tr/td[3]/table/tbody/tr[1]/td/span")
	WebElement 	New_Deposit_Account;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table[1]/tbody/tr[1]/td[2]/input")
	WebElement 	Displayed_name;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table[1]/tbody/tr[2]/td[2]/input")
	WebElement Login_username;
	
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table[1]/tbody/tr[3]/td[2]/input")
	WebElement Login_password;
	
	@FindBy(xpath="/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table[2]/tbody/tr/td[1]/span")
	WebElement Submit_Btn;
	
	New_Deposit_Account_TS(WebDriver d)

	{
		PageFactory.initElements(d, this);
	}
	public void test(WebDriver d) throws IOException, InterruptedException
	{
		New_Deposit_Account_data_Driven a=new New_Deposit_Account_data_Driven();
		Thread.sleep(2000);
		
		String Displayed_name1=a.getdata("Sheet1",2,0);
		String Login_username1=a.getdata("Sheet1",2,1);
		String Login_password1=a.getdata("Sheet1",2,2);
		
		
		
		Accounts.click();
		
		New_Deposit_Account.click();
		
		Displayed_name.sendKeys(Displayed_name1);
		Thread.sleep(2000);
		
		Login_username.sendKeys(Login_username1);
		Thread.sleep(2000);
		
		Login_password.sendKeys(Login_password1);
		Thread.sleep(2000);
		
		Submit_Btn.click();
		
		
			
			
	}


}
