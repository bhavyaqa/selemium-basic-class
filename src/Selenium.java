import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Selenium {
	public static void main (String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhavyakhanna\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://10.0.1.86/tatoc/basic/grid/gate");
		WebElement ClickGreen = driver.findElement(By.className("greenbox"));
		ClickGreen.click();
		driver.quit();
	}
}