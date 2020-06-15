package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Config {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","//Users//mustafizurrahman//Documents//Work//chromedriver");
				System.setProperty("webdriver.gecko.driver","//Users//mustafizurrahman//Documents//Work//geckodriver");
			    //WebDriver driver = new ChromeDriver(); 
			    WebDriver driver = new FirefoxDriver();
				driver.get("https://fod.infobase.com/p_Login.aspx");
				System.out.println(driver.getTitle());
				System.out.println(driver.getCurrentUrl());
				
	}

}
