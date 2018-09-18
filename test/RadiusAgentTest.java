package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiusAgentTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\PranamPatro\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.radiusagent.com/");
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[2]/a[3]")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div/div[3]/div/form/div[1]/div/input")).sendKeys("pranampatro93@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div/div[3]/div/form/div[2]/div/input")).sendKeys("Lipu@1993");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[1]/div/div/div[3]/div/form/div[4]/button")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/div[3]/acme-navbar/section/div/div[1]/div/ul/li[1]/a")).click();
		
	}

}
