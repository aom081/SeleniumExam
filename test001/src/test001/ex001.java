package test001;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class ex001 {

	@Test
	void test() throws InterruptedException {
		WebDriver driver = null;

		System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/demo-site/");
		
		driver.findElement(By.xpath("//*[@id=\"vfb-5\"]")).sendKeys("Nattavut");
		driver.findElement(By.xpath("//*[@id=\"vfb-7\"]")).sendKeys("Kaewmaha");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-address\"]")).sendKeys("don't have.");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-address-2\"]")).sendKeys("41/4");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-city\"]")).sendKeys("Nakhonchaisri");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-state\"]")).sendKeys("Nakhon Pathom");
		driver.findElement(By.xpath("//*[@id=\"vfb-13-zip\"]")).sendKeys("73120");
		driver.findElement(By.xpath("//*[@id=\"vfb-14\"]")).sendKeys("644259014@webmail.npru.ac.th");
		driver.findElement(By.xpath("//*[@id=\"vfb-18\"]")).sendKeys("20/12/2003");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"vfb-19\"]")).sendKeys("0817423467");
		driver.findElement(By.xpath("//*[@id=\"vfb-20-0\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"vfb-20-1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-3\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-4\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-20-5\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"vfb-23\"]")).sendKeys("Don't have.");
		driver.findElement(By.xpath("//*[@id=\"vfb-3\"]")).sendKeys("99"); 
		driver.findElement(By.xpath("//*[@id=\"vfb-4\"]")).click();
		
		String result = driver.findElement(By.xpath("//*[@id=\"main\"]/div[2]/div[1]/div/div/div/div/div/div/div/text()")).getText();
		
		assertEquals("Successfully",result);
		
		Thread.sleep(5000);
		driver.quit();
	}
}
