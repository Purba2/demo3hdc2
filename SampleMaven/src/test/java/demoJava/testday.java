package demoJava;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class testday {
  @Test
  public void f() throws InterruptedException {
	  WebDriver driver;
	  driver = mainfile.getDriver("CRM");
	  driver.get(("http://demowebshop.tricentis.com/"));
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  WebElement a = driver.findElement(By.className("q"));
	  Actions act = new Actions (driver);
	  act.keyDown(a,Keys.SHIFT).sendKeys("Computer").keyUp(Keys.SHIFT).build().perform();
	  Thread.sleep(3000);
	  act.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build().perform();
	  act.sendKeys(Keys.ENTER).build().perform();
	  
  }
}