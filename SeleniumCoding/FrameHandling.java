package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/frames");
		
		//driver.findElements(By.xpath("//iframe"));
		List<WebElement> wb=driver.findElements(By.tagName("iframe"));
		int count=wb.size();
		System.out.println("Total no of frames in this page is:  "+count);
		
		
		/*
		 * driver.findElements(By.tagName("a")); driver.findElement(By.xpath("//a"));
		 */
		
		
		//To work on switch we first need to switch the browser contol to that frame window
		//to check frame in page: Rightclick--->view pagesource we will get some iframe attribute there,means frame is present in that page
		
		WebElement Myframe=driver.findElement(By.xpath("//iframe[@id='google_ads_iframe_/21849154601,22343295815/Ad.Plus-Anchor_0']"));
		driver.switchTo().frame(Myframe);
		Thread.sleep(3000);
		WebElement wb1=driver.findElement(By.xpath("//span[text()='Ads by '][1]"));
		String Textname=wb1.getText();
		
	}

}
