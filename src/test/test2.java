package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/ezizkurbanov/Documents/Selenium Dependencies 2019/drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.etsy.com");
	}

}
