package Make_a_deposit_into_one_or_more_accounts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Login.Login_Ts;

public class Deposit_Into_One_Account 
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
		
		d.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/table/tbody/tr/td[3]/table/tbody/tr[3]/td/span")).click();
		d.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table/tbody/tr[3]/td/input")).clear();
		d.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table/tbody/tr[3]/td/input")).sendKeys("11/15/2018");
		d.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table/tbody/tr[5]/td/input")).sendKeys("DepsitSelf");
		d.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table/tbody/tr[7]/td/input")).sendKeys("50000");
		d.findElement(By.xpath("//*[@id='a3']")).click();
		d.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/form/table/tbody/tr/td/table/tbody/tr[10]/td/table/tbody/tr/td[1]/span")).click();
		d.findElement(By.xpath("/html/body/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr[3]/td[3]/table/tbody/tr/td/table/tbody/tr[6]/td/div[2]/span[1]")).click();
		
}

}
