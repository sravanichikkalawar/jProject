import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class First {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			        WebDriver driver=new HtmlUnitDriver();
			        driver.get("https://demoqa.com/buttons");
			        System.out.println(driver.getTitle());
	}

}
