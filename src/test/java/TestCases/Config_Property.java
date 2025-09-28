package TestCases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.testng.annotations.Test;

import TestBase.Base_Test;

public class Config_Property extends Base_Test {
	
	@Test
	public void launch() throws IOException, InterruptedException {
		
	//browserLaunch("Chrome");
		
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Thread.sleep(2000);
	
	
	driver.get(p.getProperty("appURL"));//reading data
	
}
	
	

}
