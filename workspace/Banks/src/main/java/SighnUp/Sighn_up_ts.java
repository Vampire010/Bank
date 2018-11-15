package SighnUp;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Sighn_up_ts
{
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[1]/td[2]/span/input")
	WebElement First_Name;
	
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[2]/td[2]/span/input")
	WebElement Last_Name;
	
	
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[3]/td[2]/span/input")
	WebElement Your_Email;
	
	
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[4]/td[2]/span/input")
	WebElement Re_Enter_Email;
	
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[5]/td[2]/span/input")
	WebElement Password;
	
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[6]/td[2]/input")
	WebElement Educater_CheckBox;
	
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[2]/tbody/tr/td[1]/span")
	WebElement SignUp_Bttn;
	
	public Sighn_up_ts(WebDriver d)

	{
		PageFactory.initElements(d, this);
	}
	public void test(WebDriver d) throws IOException, InterruptedException
	{
		Sighnup_DataDriven a=new Sighnup_DataDriven();
		Thread.sleep(2000);
		
		String FirstName=a.getdata("Sheet1",2,0);
		String LastName=a.getdata("Sheet1",2,1);
		String Email=a.getdata("Sheet1",2,2);
		String Re_Entr_Email=a.getdata("Sheet1",2,3);
		String Psword=a.getdata("Sheet1",2,4);
		
		
		First_Name.sendKeys(FirstName);
		Thread.sleep(2000);
		
		Last_Name.sendKeys(LastName);
		Thread.sleep(2000);
		
		Your_Email.sendKeys(Email);
		Thread.sleep(2000);
		
		Re_Enter_Email.sendKeys(Re_Entr_Email);
		Thread.sleep(2000);
		
		Password.sendKeys(Psword);
		Thread.sleep(2000);
		
		Educater_CheckBox.click();
		Thread.sleep(2000);
		
		SignUp_Bttn.click();
		
		
			
			
	}
}
