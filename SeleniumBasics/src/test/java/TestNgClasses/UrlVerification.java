package TestNgClasses;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;

public class UrlVerification 
	{
		WebDriver driver;
		String expectedURL="https://www.saucedemo.com/";
	
  @Test(priority=0)
  public void urlCheck()
		  {
	  		  String s=driver.getCurrentUrl();
	  		//hhardassert
//	  		  Assert.assertEquals(expectedURL, "jkljllk");
//	  		  System.out.println("sdkjasgdkjsgadjksgadkjgsakgdsakdjs");
	  		  
	  		  //softassert
	  		  SoftAssert objassert = new SoftAssert();
	  		  objassert.assertEquals(expectedURL, "jkljllk");
	  		  System.out.println("sdkjasgdkjsgadjksgadkjgsakgdsakdjs");
	  		  objassert.assertAll();
	  		  
//	  		    if(expectedURL.equals("hjdkakjdakjdga"))
//	  		    {
//	  		    	Assert.assertTrue(true);
//	  		    }else
//	  		    {
//	  		    	Assert.fail("String comparsion failed for url verification");
//	  		    }
	  	  }
	  	  
	  
  @Test(priority=1)
  public void urlChecks()
		  {
	  		
	  String s=driver.getCurrentUrl();
	  if(expectedURL.equals(s))
			{
				System.out.println("pass");
			}
		else
				
				System.out.println("fail");
		  }
  @BeforeTest
  public void beforeTest()
  	{
	  	
		//String expectedURL="https://www.saucedemo.com/";
		System.setProperty("webdriver.chome.driver",
				"C://Users//Dell//eclipse-workspace//SeleniumBasics//src//test//java//initialjava//TestJava.java");
		ChromeOptions onarg=new ChromeOptions();
		onarg.addArguments("--remote-allow-origins=*");
		driver=new ChromeDriver(onarg);
		driver.manage().window().maximize();
		driver.get(expectedURL);
  	}
	
  @AfterTest
  public void afterTest() 
	  {
	  driver.close();
	  }

}
