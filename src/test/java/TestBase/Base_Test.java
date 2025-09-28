package TestBase;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.Properties;



import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Base_Test {
	public static WebDriver driver;
	public static Properties p;
	
	@Parameters({"os","browser"})
	@BeforeTest
	public void browserLaunch(String os,String brow) throws IOException, InterruptedException   {
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
		//loading config.propeties
		p = new Properties();
		FileReader file = new FileReader("./src//test//resources//config.properties");
		p.load(file);
		}
		catch(Exception e) {}
		//grid setup
		
		
          try {
		if(p.getProperty("execution_env").equalsIgnoreCase("remote")) {
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			//os import
			
			if(os.equalsIgnoreCase("window")) {
				capabilities.setPlatform(Platform.WINDOWS);
			}
			
			else if (os.equalsIgnoreCase("mac")){
				capabilities.setPlatform(Platform.MAC);
			}
			
			else {
				System.out.println("does not matching os");
				return;
			}
			
			//browsers
			
			switch(brow) {
			case "chrome" : capabilities.setBrowserName("chrome"); break;
			case "edge"   : capabilities.setBrowserName("MicrosoftEdge");break;
			case "firefox": capabilities.setBrowserName("firefox");break;			
			default : System.out.println("no matching browsers");return;
			}
		
		    driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),capabilities);
  }
		
		//local setup
		if(p.getProperty("execution_env").equalsIgnoreCase("local")) {
	  switch(brow.toLowerCase()) {
		
		case "chrome" : driver=new ChromeDriver(); break;
		case "edge" : driver=new EdgeDriver(); break;
		case "firefox" : driver=new FirefoxDriver(); break;
		default: System.out.println("invalid browser!!");return;
		}
	
		}
		
		
		Thread.sleep(2000);
		driver.get(p.getProperty("appURL"));
          }
          catch(Exception e) {
        	  System.out.println(e.getMessage());
          }
		  
		
	  }
	
	
	
		
		
		}
	
//./src//test//resources//config.properties

