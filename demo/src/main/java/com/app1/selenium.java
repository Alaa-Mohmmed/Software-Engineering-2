package com.app1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.springframework.boot.SpringApplication;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
public class selenium {

	@Test
	public static void registersuccess() {
		// TODO Auto-generated method stub
		//SpringApplication.run(MainController.class, 	args);
		System.setProperty("webdriver.chrome.driver", "C:\\demo\\chromedriver.exe");
		org.openqa.selenium.chrome.ChromeDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("http://localhost:8080/register");

		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("alaaa");
		driver.findElement(By.name("UserID")).click();
		driver.findElement(By.name("UserID")).sendKeys("5");
		driver.findElement(By.name("pass")).click();
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.name("user_type")).click();
		driver.findElement(By.name("user_type")).sendKeys("storeowner");
		driver.findElement(By.xpath("/html/body/form/input[5]")).click();
		driver.findElement(By.xpath("/html/body/a/button")).click();
		String expected = "http://localhost:8080/login";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(expected, actual);
		
		
		
	}
	public static void registerfailuserType() {
		// TODO Auto-generated method stub
		//SpringApplication.run(MainController.class, 	args);
		System.setProperty("webdriver.chrome.driver", "C:\\demo\\chromedriver.exe");
		org.openqa.selenium.chrome.ChromeDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("http://localhost:8080/register");

		driver.findElement(By.name("name")).click();//el mfrod yrun walahi
		driver.findElement(By.name("name")).sendKeys("alaaa");
		driver.findElement(By.name("UserID")).click();
		driver.findElement(By.name("UserID")).sendKeys("5");
		driver.findElement(By.name("pass")).click();
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.name("user_type")).click();
		driver.findElement(By.name("user_type")).sendKeys("STOREowner");
		driver.findElement(By.xpath("/html/body/form/input[5]")).click();
		driver.findElement(By.xpath("/html/body/a/button")).click();
		String expected = "http://localhost:8080/register";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(expected, actual);
		
		
		
	}
	public static void registerfailID() {
		// TODO Auto-generated method stub
		//SpringApplication.run(MainController.class, 	args);
		System.setProperty("webdriver.chrome.driver", "C:\\demo\\chromedriver.exe");
		org.openqa.selenium.chrome.ChromeDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("http://localhost:8080/register");

		driver.findElement(By.name("name")).click();//el mfrod yrun walahi
		driver.findElement(By.name("name")).sendKeys("alaaa");
		driver.findElement(By.name("UserID")).click();
		driver.findElement(By.name("UserID")).sendKeys("alaa");
		driver.findElement(By.name("pass")).click();
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.name("user_type")).click();
		driver.findElement(By.name("user_type")).sendKeys("storeowner");
		driver.findElement(By.xpath("/html/body/form/input[5]")).click();
		driver.findElement(By.xpath("/html/body/a/button")).click();
		String expected = "http://localhost:8080/register";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(expected, actual);
		
		
		
	}
	public static void loginsuccess() {
		// TODO Auto-generated method stub
		//SpringApplication.run(MainController.class, 	args);
		System.setProperty("webdriver.chrome.driver", "C:\\demo\\chromedriver.exe");
		org.openqa.selenium.chrome.ChromeDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("http://localhost:8080/login");

		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("salsabel");
		driver.findElement(By.name("pass")).click();
		driver.findElement(By.name("pass")).sendKeys("123");
		driver.findElement(By.name("user_type")).click();
		driver.findElement(By.name("user_type")).sendKeys("storeowner");
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		String expected = "failed";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
}
	public static void loginfailpass() {
		// TODO Auto-generated method stub
		//SpringApplication.run(MainController.class, 	args);
		System.setProperty("webdriver.chrome.driver", "C:\\demo\\chromedriver.exe");
		org.openqa.selenium.chrome.ChromeDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("http://localhost:8080/login");

		driver.findElement(By.name("name")).click();//el mfrod yrun walahi
		driver.findElement(By.name("name")).sendKeys("salsabel");
		driver.findElement(By.name("pass")).click();
		driver.findElement(By.name("pass")).sendKeys("122");
		driver.findElement(By.name("user_type")).click();
		driver.findElement(By.name("user_type")).sendKeys("storeowner");
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		String expected = "failed";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
}	
	public static void loginfailsqlinjection() {
		// TODO Auto-generated method stub
		//SpringApplication.run(MainController.class, 	args);
		System.setProperty("webdriver.chrome.driver", "C:\\demo\\chromedriver.exe");
		org.openqa.selenium.chrome.ChromeDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("http://localhost:8080/login");

		driver.findElement(By.name("name")).click();//el mfrod yrun walahi
		driver.findElement(By.name("name")).sendKeys("salsabel");
		driver.findElement(By.name("pass")).click();
		driver.findElement(By.name("pass")).sendKeys("'='");
		driver.findElement(By.name("user_type")).click();
		driver.findElement(By.name("user_type")).sendKeys("storeowner");
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();
		String expected = "failed";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
}
	public static void addbrandsucess() {
		// TODO Auto-generated method stub
		//SpringApplication.run(MainController.class, 	args);
		System.setProperty("webdriver.chrome.driver", "C:\\demo\\chromedriver.exe");
		org.openqa.selenium.chrome.ChromeDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("http://localhost:8080/login");
		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("rawan");
		driver.findElement(By.name("pass")).click();
		driver.findElement(By.name("pass")).sendKeys("456");
		driver.findElement(By.name("user_type")).click();
		driver.findElement(By.name("user_type")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/a[1]/button")).click();//submit
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();//gotoaddbrand
		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("brand");
		driver.findElement(By.name("brand_category")).click();
		driver.findElement(By.name("brand_category")).sendKeys("clothes");
		driver.findElement(By.name("user_type")).click();
		driver.findElement(By.name("user_type")).sendKeys("storeowner");
		driver.findElement(By.xpath("/html/body/div/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/div/form/input[3]")).click();
		String expected = "addbrand";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
			
			
		}
	public static void addbrandfailname() {//name can be a number
		// TODO Auto-generated method stub
		//SpringApplication.run(MainController.class, 	args);
		System.setProperty("webdriver.chrome.driver", "C:\\demo\\chromedriver.exe");
		org.openqa.selenium.chrome.ChromeDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("http://localhost:8080/login");
		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("rawan");
		driver.findElement(By.name("pass")).click();
		driver.findElement(By.name("pass")).sendKeys("456");
		driver.findElement(By.name("user_type")).click();
		driver.findElement(By.name("user_type")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/a[1]/button")).click();//submit
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();//gotoaddbrand
		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("12");
		driver.findElement(By.name("brand_category")).click();
		driver.findElement(By.name("brand_category")).sendKeys("clothes");
		driver.findElement(By.name("user_type")).click();
		driver.findElement(By.name("user_type")).sendKeys("storeowner");
		driver.findElement(By.xpath("/html/body/div/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/div/form/input[3]")).click();
		String expected = "addbrand";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
	}
	public static void addbrandfailbrand() {//brand can be number
		// TODO Auto-generated method stub
		//SpringApplication.run(MainController.class, 	args);
		System.setProperty("webdriver.chrome.driver", "C:\\demo\\chromedriver.exe");
		org.openqa.selenium.chrome.ChromeDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("http://localhost:8080/login");
		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("rawan");
		driver.findElement(By.name("pass")).click();
		driver.findElement(By.name("pass")).sendKeys("456");
		driver.findElement(By.name("user_type")).click();
		driver.findElement(By.name("user_type")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/a[1]/button")).click();//submit
		driver.findElement(By.xpath("/html/body/form/input[4]")).click();//gotoaddbrand

		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("brand");
		driver.findElement(By.name("brand_category")).click();
		driver.findElement(By.name("brand_category")).sendKeys("clothes");
		driver.findElement(By.name("user_type")).click();
		driver.findElement(By.name("user_type")).sendKeys("storeowner");
		driver.findElement(By.xpath("/html/body/div/form/input[3]")).click();
		driver.findElement(By.xpath("/html/body/div/form/input[3]")).click();
		String expected = "addbrand";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
	}
	public static void addproductsuccess() {
		// TODO Auto-generated method stub
		//SpringApplication.run(MainController.class, 	args);
		System.setProperty("webdriver.chrome.driver", "C:\\demo\\chromedriver.exe");
		org.openqa.selenium.chrome.ChromeDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("http://localhost:8080/login");

		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("rawan");
		driver.findElement(By.name("pass")).click();
		driver.findElement(By.name("pass")).sendKeys("456");
		driver.findElement(By.name("user_type")).click();
		driver.findElement(By.name("user_type")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/a[1]/button")).click();//submit

		driver.findElement(By.xpath("/html/body/a[2]/button")).click();
		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("scarf");
		driver.findElement(By.name("ProductID")).click();
		driver.findElement(By.name("ProductID")).clear();
		driver.findElement(By.name("ProductID")).sendKeys("2");
		driver.findElement(By.name("Price")).clear();
		driver.findElement(By.name("Price")).click();
		driver.findElement(By.name("Price")).sendKeys("100");
		driver.findElement(By.name("Category")).click();
		driver.findElement(By.name("Category")).sendKeys("clothes");
		driver.findElement(By.name("quantity")).click();
		driver.findElement(By.name("quantity")).clear();
		driver.findElement(By.name("quantity")).sendKeys("300");
		driver.findElement(By.name("store_name")).click();
		driver.findElement(By.name("store_name")).sendKeys("zara");
		driver.findElement(By.xpath("/html/body/div/form/input[7]")).click();

		String expected = "addproduct";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
			
			
		}

	public static void addproductfailcategory() {//category not exist
		// TODO Auto-generated method stub
		//SpringApplication.run(MainController.class, 	args);
		System.setProperty("webdriver.chrome.driver", "C:\\demo\\chromedriver.exe");
		org.openqa.selenium.chrome.ChromeDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("http://localhost:8080/login");

		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("rawan");
		driver.findElement(By.name("pass")).click();
		driver.findElement(By.name("pass")).sendKeys("456");
		driver.findElement(By.name("user_type")).click();
		driver.findElement(By.name("user_type")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/a[1]/button")).click();//submit

		driver.findElement(By.xpath("/html/body/a[2]/button")).click();
		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("scarf");
		driver.findElement(By.name("ProductID")).click();
		driver.findElement(By.name("ProductID")).clear();
		driver.findElement(By.name("ProductID")).sendKeys("2");
		driver.findElement(By.name("Price")).clear();
		driver.findElement(By.name("Price")).click();
		driver.findElement(By.name("Price")).sendKeys("100");
		driver.findElement(By.name("Category")).click();
		driver.findElement(By.name("Category")).sendKeys("clothes");
		driver.findElement(By.name("quantity")).click();
		driver.findElement(By.name("quantity")).clear();
		driver.findElement(By.name("quantity")).sendKeys("300");
		driver.findElement(By.name("store_name")).click();
		driver.findElement(By.name("store_name")).sendKeys("zara");
		driver.findElement(By.xpath("/html/body/div/form/input[7]")).click();

		String expected = "addproduct";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
			
			
		}
	public static void addproductstore() {//storename not exist
		// TODO Auto-generated method stub
		//SpringApplication.run(MainController.class, 	args);
		System.setProperty("webdriver.chrome.driver", "C:\\demo\\chromedriver.exe");
		org.openqa.selenium.chrome.ChromeDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("http://localhost:8080/login");

		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("rawan");
		driver.findElement(By.name("pass")).click();
		driver.findElement(By.name("pass")).sendKeys("456");
		driver.findElement(By.name("user_type")).click();
		driver.findElement(By.name("user_type")).sendKeys("admin");
		driver.findElement(By.xpath("/html/body/a[1]/button")).click();//submit

		driver.findElement(By.xpath("/html/body/a[2]/button")).click();
		driver.findElement(By.name("name")).click();
		driver.findElement(By.name("name")).sendKeys("scarf");
		driver.findElement(By.name("ProductID")).click();
		driver.findElement(By.name("ProductID")).clear();
		driver.findElement(By.name("ProductID")).sendKeys("2");
		driver.findElement(By.name("Price")).clear();
		driver.findElement(By.name("Price")).click();
		driver.findElement(By.name("Price")).sendKeys("100");
		driver.findElement(By.name("Category")).click();
		driver.findElement(By.name("Category")).sendKeys("clothes");
		driver.findElement(By.name("quantity")).click();
		driver.findElement(By.name("quantity")).clear();
		driver.findElement(By.name("quantity")).sendKeys("300");
		driver.findElement(By.name("store_name")).click();
		driver.findElement(By.name("store_name")).sendKeys("zara");
		driver.findElement(By.xpath("/html/body/div/form/input[7]")).click();

		String expected = "addproduct";
		String actual = driver.getTitle();
		Assert.assertEquals(expected, actual);
			
			
		}
	public static void statisticsMaxProduct() {
		// TODO Auto-generated method stub
		//SpringApplication.run(MainController.class, 	args);
		System.setProperty("webdriver.chrome.driver", "C:\\demo\\chromedriver.exe");
		org.openqa.selenium.chrome.ChromeDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("http://localhost:8080/newstatistic");
		driver.findElement(By.xpath("/html/body/div/form/input[7]")).click();
		driver.findElement(By.xpath("/html/body/a[1]/button")).click();


		String expected = "http://localhost:8080/maxproduct";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(expected, actual);
			
			
		}
	public static void statisticsMinProduct() {
		// TODO Auto-generated method stub
		//SpringApplication.run(MainController.class, 	args);
		System.setProperty("webdriver.chrome.driver", "C:\\demo\\chromedriver.exe");
		org.openqa.selenium.chrome.ChromeDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("http://localhost:8080/newstatistic");
		driver.findElement(By.xpath("/html/body/div/form/input[7]")).click();
		driver.findElement(By.xpath("/html/body/a[2]/button")).click();


		String expected = "http://localhost:8080/minproduct";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(expected, actual);
			
			
		}
	public static void statisticssumUsers() {
		// TODO Auto-generated method stub
		//SpringApplication.run(MainController.class, 	args);
		System.setProperty("webdriver.chrome.driver", "C:\\demo\\chromedriver.exe");
		org.openqa.selenium.chrome.ChromeDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("http://localhost:8080/newstatistic");
		driver.findElement(By.xpath("/html/body/div/form/input[7]")).click();
		driver.findElement(By.xpath("/html/body/a[3]/button")).click();


		String expected = "http://localhost:8080/sumofusers";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(expected, actual);
			
			
		}
	public static void statisticssumProduct() {
		// TODO Auto-generated method stub
		//SpringApplication.run(MainController.class, 	args);
		System.setProperty("webdriver.chrome.driver", "C:\\demo\\chromedriver.exe");
		org.openqa.selenium.chrome.ChromeDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("http://localhost:8080/newstatistic");
		driver.findElement(By.xpath("/html/body/div/form/input[7]")).click();
		driver.findElement(By.xpath("/html/body/a[4]/button")).click();


		String expected = "http://localhost:8080/sumofproducts";
		String actual = driver.getCurrentUrl();
		Assert.assertEquals(expected, actual);
			
			
		}
	
		
}

