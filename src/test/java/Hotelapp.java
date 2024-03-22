import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Hotelapp {
	@Test
    public void testsetup() throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://adactinhotelapp.com/");
        
        driver.findElement(By.id("username")).sendKeys("vasuvespag");
        driver.findElement(By.id("password")).sendKeys("vasu1234");
        driver.findElement(By.id("login")).click();
        Select location_select = new Select(driver.findElement(By.id("location")));
        location_select.selectByVisibleText("Sydney");
        Select hotels_select = new Select(driver.findElement(By.id("hotels")));
        hotels_select.selectByVisibleText("Hotel Hervey");
        Select room_type_select = new Select(driver.findElement(By.id("room_type")));
        room_type_select.selectByVisibleText("Deluxe");
        Select room_nos_select = new Select(driver.findElement(By.id("room_nos")));
        room_nos_select.selectByVisibleText("2 - Two");
        driver.findElement(By.id("datepick_in")).sendKeys("09/03/2024");
        driver.findElement(By.id("datepick_out")).sendKeys("10/03/2024");
        Select adult_room_select = new Select(driver.findElement(By.id("adult_room")));
        adult_room_select.selectByVisibleText("1 - One");
        Select child_room_select = new Select(driver.findElement(By.id("child_room")));
        child_room_select.selectByVisibleText("0 - None");
        driver.findElement(By.id("Submit")).click();
        driver.findElement(By.id("radiobutton_0")).click();
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("first_name")).sendKeys("Pavithra");
        driver.findElement(By.id("last_name")).sendKeys("Rao");
        driver.findElement(By.id("address")).sendKeys("Koulpoor,Nizamabad");
        driver.findElement(By.id("cc_num")).sendKeys("0123456789777777");
        Select cc_type_select = new Select(driver.findElement(By.id("cc_type")));
        cc_type_select.selectByVisibleText("VISA");
        Select cc_exp_month_select = new Select(driver.findElement(By.id("cc_exp_month")));
        cc_exp_month_select.selectByVisibleText("May");
        Select cc_exp_year_select = new Select(driver.findElement(By.id("cc_exp_year")));
        cc_exp_year_select.selectByVisibleText("2025");
        driver.findElement(By.id("cc_cvv")).sendKeys("12345");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.findElement(By.id("book_now")).click();
        WebElement order=driver.findElement(By.id("order_no"));
        System.out.println(order.getAttribute("value"));

}
}

	