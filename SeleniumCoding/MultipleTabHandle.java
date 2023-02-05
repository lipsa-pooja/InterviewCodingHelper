package practice;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleTabHandle {

	public static void main(String[] args) {

	//https://www.youtube.com/watch?v=pZdMsLKAjs4&t=568s
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.naukri.com/");

		String parent = driver.getWindowHandle();
		System.out.println(parent);
		Set<String> allwindow = driver.getWindowHandles();
		
		
		//to get thw windows using index basis we will convert Set To Arraylist because In set we cant use index concept
		//it will convert Set to ArrayList
		ArrayList<String> tabs=new ArrayList<String>(allwindow);
		/*
		 * tabs.get(0);//it will go to 1st Window i.e,parent window -------or switch to
		 * parent window tabs.get(1);//switch to the 2nd window i.e, 1st child window
		 * tabs.get(2);//switch to the 3rd window ans so on....
		 */
		
		driver.switchTo().window( tabs.get(0));
		String parentpageTitle=driver.getTitle();
		System.out.println(parentpageTitle);
		
		
		driver.switchTo().window( tabs.get(1));
		String child1pageTitle=driver.getTitle();
		System.out.println(child1pageTitle);
		driver.close();
		
		driver.switchTo().window( tabs.get(2));
		String child2pageTitle=driver.getTitle();
		System.out.println(child2pageTitle);
		driver.close();
		
		
		
		//If we want to go back to parent window ,then
		driver.switchTo().window( tabs.get(0));
		driver.close();
		
		

	}

}
