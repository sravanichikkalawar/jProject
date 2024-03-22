import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Grid {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		//FirefoxOptions opt=new FirefoxOptions();
       opt.setCapability("sc:name","My first grid test");
       WebDriver driver= new RemoteWebDriver(new URL("http://10.211.189.215:4444"),opt);
       driver.get("https://www.hotelapp.nl");
       Thread.sleep(5000);
       driver.close();
	}

}
