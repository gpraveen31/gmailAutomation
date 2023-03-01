package gmailAutomation;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class gmailAssignment 
{
	@Test
	public void gmailTest () 
	{
		try 
		{
			
			System.setProperty("webdriver.chrome.driver", "D://jimmy/chromedriver1.exe");
			ChromeDriver driver = new ChromeDriver();
			
			driver.get("http://www.gmail.com");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vohh12344@gmail.com");
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_ENTER);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("C@monone3107");
			robot.keyPress(KeyEvent.VK_ENTER);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//div[@class='T-I T-I-KE L3']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("//input[@class='agP aFw']")).sendKeys("vohh12344@gmail.com");
			robot.keyPress(KeyEvent.VK_ENTER);
			driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("Test Mail");
			driver.findElement(By.xpath("//div[@class='Am Al editable LW-avf tS-tW']")).sendKeys("Test Body Mail");
			
			driver.findElement(By.xpath("/html/body/div[22]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[5]/div[2]/div[2]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div[22]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[3]/div/div/div[7]/div/div[3]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@title='Social']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("/html/body/div[22]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[5]/div[2]/div[2]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("/html/body/div[22]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[3]/div/div/div[7]/div/div[3]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[@class='J-JK-Jz']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("/html/body/div[22]/div/div/div/div[1]/div[2]/div[1]/div[1]/div/div/div/div[3]/div/div/div[4]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/div/div/div[4]/table/tbody/tr/td[1]/div/div[2]/div[1]")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//*[@class='zA zE']")).click();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			String actValue = driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div/table/tr/td/div[2]/div[1]/div[2]/div[1]/h2")).getText();
			String exptValue = "Test Mail";
			Assert.assertEquals(actValue, exptValue);
			
			String actValue1 = driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div/table/tr/td/div[2]/div[2]/div/div[3]/div/div/div/div/div/div[1]/div[2]/div[3]/div[3]/div[1]/div[1]")).getText();
			String exptValue1 = "Test Body Mail";
			Assert.assertEquals(actValue1, exptValue1);
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
