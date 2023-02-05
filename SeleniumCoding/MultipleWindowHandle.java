package practice;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		//https://www.youtube.com/watch?v=pZdMsLKAjs4&t=568s
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.naukri.com/");
		// give the windowid of parent window in string format
		// Every time window-ID will generate a new Unique ID
		String parent = driver.getWindowHandle();
		System.out.println(parent);

		// give all the window id along with parent window also
		Set<String> allwindow = driver.getWindowHandles();

		// Check howmany windows are there along with parentwindow
		int count = allwindow.size();
		System.out.println("Total window IDs  present are: " + allwindow);// it will show (parentwindow + childwindow)
		System.out.println("Total window present are: " + count);

		// Here we are using Enhanced for-loop.
		// we cannot use simple for-loop because from set<string> we cannot get each
		// window by using indexes
		// Every time set<String> returns 1st WindowId =parent Window-Id
		// 2nd WindowID=Child window-ID
		for (String child : allwindow) {
			if (!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				String ChildpageTitle = driver.getTitle();
				System.out.println("ChildpageTitles are:  " + ChildpageTitle);
				
				Thread.sleep(3000);
				driver.close();// it will close the active window-session where the browser control is present
								// now
			}
		}
		driver.switchTo().window(parent);// it will switch back to the parent window---browser driver control will go to
											// the parent window
		String ParentpageTitle = driver.getTitle();
		System.out.println("ParentpageTitle is:  " + ParentpageTitle);
		driver.close();
	}

}
