package runnerclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageelementslocator.webscrapping;

public class function1 {
	public static void main(String[] args) throws IOException,FileNotFoundException{
		WebDriver driver = null;
		//File f=new File("C:\\Users\\dell\\Downloads\\webscrapp.txt");
		 FileInputStream inputdata=new FileInputStream("src//test//java//configuration.properties");
		 Properties propertyfile=new Properties();
		 propertyfile.load(inputdata);
		 String browsername=propertyfile.getProperty("browser");//File f=new File("C:\\Users\\dell\\Downloads\\webscrapp.txt");
		 String txtfilepath=propertyfile.getProperty("path");
		// File f=new File(txtfilepath);
		 FileWriter fw=new FileWriter(txtfilepath,true);
		 if(browsername.equalsIgnoreCase("chrome"))
		 {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
		 }
		 else if(browsername.equalsIgnoreCase("firefox"))
		 {
			 WebDriverManager.firefoxdriver().setup();
			 driver = new FirefoxDriver();
		 }else if(browsername.equalsIgnoreCase("edge"))
		 {
			 WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
		 }
		 
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);  // implicit wait
			driver.get("https://healthcaresuccess.com");
			
		  webscrapping.menuList(driver); // Clicking menu i.e Services 
		  
		  webscrapping.submenu(driver);//calling sub-menu i.e clicking on branding.
		  driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		  webscrapping.scrapping1(driver,fw);
		  driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		  webscrapping.scrapping2(driver,fw);
		  driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		  webscrapping.scrapping3(driver,fw);
		  driver.manage().timeouts().implicitlyWait(1000,TimeUnit.SECONDS);
		  webscrapping.scrapping4(driver,fw);
		  fw.close();
		   
		   
		   
}}