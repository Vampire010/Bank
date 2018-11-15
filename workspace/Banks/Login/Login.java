package Login;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Login 
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

}

}
