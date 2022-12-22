package pageelementslocator;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class webscrapping{
	
	
   public static void menuList(WebDriver driver) {
	WebElement menuServices=driver.findElement(By.xpath("//*[@id='menu-item-45949']"));
	menuServices.click();
	
}

public static void submenu(WebDriver driver) {
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement branding=driver.findElement(By.xpath("//*[@id='menu-item-45963']/a"));
	branding.click();
	
}	

	public static void scrapping1(WebDriver driver,FileWriter file) throws IOException 
		{List<WebElement> Section1=driver.findElements(By.xpath("//*[@id='section-365-45900']"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		for(WebElement Eachtext:Section1)
		{String s= Eachtext.getText();
			System.out.println(s);
			//FileUtils.writeStringToFile(file,s,Charset.defaultCharset());
			file.write(s);
			
	}		
	}

	public static void scrapping2(WebDriver driver,FileWriter file) throws IOException {
		
		List<WebElement> Section2=driver.findElements(By.xpath("//*[@id='section-465-45900']"));
		for(WebElement Eachtext:Section2)
		{
			String s= Eachtext.getText();
			System.out.println(s);
			//FileUtils.writeStringToFile(file,s,Charset.defaultCharset());
			file.write(s);
			
	}		
		
	}

	public static void scrapping3(WebDriver driver,FileWriter file) throws IOException {
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		List<WebElement> Section3=driver.findElements(By.xpath("//*[@id='section-622-45900']"));
		for(WebElement Eachtext:Section3)
		{
			String s= Eachtext.getText();
			System.out.println(s);
			//FileUtils.writeStringToFile(file,s,Charset.defaultCharset());
			file.write(s);
			
	}	
	}

	public static void scrapping4(WebDriver driver,FileWriter file) throws IOException {
		driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		List<WebElement> Section3=driver.findElements(By.xpath("//*[@id='section-9-45811']"));
		for(WebElement Eachtext:Section3)
		{
			String s= Eachtext.getText();
			System.out.println(s);
			//FileUtils.writeStringToFile(file,s,Charset.defaultCharset());
			file.write(s);
			
	}	
		
	}
	
	}

