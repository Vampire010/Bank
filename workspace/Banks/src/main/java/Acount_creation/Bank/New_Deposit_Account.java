package Acount_creation.Bank;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Login.Login_Ts;



public class New_Deposit_Account
{
	WebDriver d;
	@Test
	public void test2() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Exe_Files/chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://www.mykidsbank.org");
		Thread.sleep(2000);
		
		Login_Ts l=new Login_Ts(d);
		l.test(d);
		
		Thread.sleep(2000);
		
		New_Deposit_Account_TS k=new New_Deposit_Account_TS(d);
		k.test(d);
		
	}
}
