package initialjava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJava {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chome.driver",
				"C://Users//Dell//eclipse-workspace//SeleniumBasics//src//test//java//initialjava//TestJava.java");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		driver.close();
	}

}
