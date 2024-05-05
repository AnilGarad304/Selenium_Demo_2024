package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		//co.setHeadless("--headless");
		co.setBinary("C:\\Users\\Dell\\Downloads\\chrome-win64 (1)\\chrome-win64\\chrome.exe");
		//WebDriver driver=WebDriverManager.chromedriver().create();
		WebDriver driver =new ChromeDriver(co);
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Anil");
		//driver.findElement(By.id("search")).sendKeys("Anil");
		//driver.findElement(By.id("search-icon-legacy")).click();
		System.out.println("Anil");
		//driver.close();

	}

}
