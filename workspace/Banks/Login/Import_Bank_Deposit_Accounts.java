package Login;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Import_Bank_Deposit_Accounts
{
	WebDriver d;
	@Test
	public void test2() throws IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./Exe_Files/chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://www.mykidsbank.org");
		Thread.sleep(2000);
		Login_Ts k=new Login_Ts(d);
		
		k.test(d);
		d.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/table/tbody/tr/td[3]/table/tbody/tr[2]/td/span")).click();
		d.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/div/input")).sendKeys("C:\\Users\\Vampire\\workspace\\Bank\\Excel_Data\\Import_Bank_Deposit_Account_data123.csv");
		d.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/span[1]")).click();
		d.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table[2]/tbody/tr/td/span[1]")).click();
}


}
