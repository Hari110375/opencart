package testCases;




import org.openqa.selenium.By;


import org.testng.annotations.Test;


import testBase.BaseClass;

	
	
public class TC_009_hari extends BaseClass {

		
	
		@Test(groups= {"regression","master"})
	public void login() throws Exception  {


			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[text()='Software']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//a[text()='Desktops (13)']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[text()='iPod Classic']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@id='button-cart']")).click();
			driver.findElement(By.xpath("//span[@id='cart-total']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("(//i[@class='fa fa-share']/..)[2]")).click();
		
	
		
		
	}
}
		

