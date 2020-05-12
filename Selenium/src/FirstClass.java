import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 
        Actions a = new Actions();
        a.startapp(driver, "Chrome", "https://dev.commusoft.net:6984/_utils/database.html?commusoft_13157/_temp_view");
	}

}
