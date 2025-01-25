package com.it.bd;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DemoQA extends BaseDriver {
	
	String url = "https://demoqa.com/automation-practice-form";
	
	@Test
	public void webElementsTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement location1 = driver.findElement(By.xpath("//label[@id='userName-label']"));
		js.executeScript("arguments[0].scrollIntoView(true);", location1);
		Thread.sleep(3000);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("Elahi");
		Thread.sleep(2000);
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys("Mugdha");
		Thread.sleep(2000);
		
		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		email.sendKeys("monjurmugdha11@gmail.com");
		Thread.sleep(2000);
		
		//Click Command
		WebElement Gender = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
		Gender.click();
		Thread.sleep(2000);
		
		WebElement mobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
		mobile.sendKeys("0123456789");
		Thread.sleep(2000);
		
		WebElement dateofbirth = driver.findElement(By.xpath("//input[@id='dateOfBirthInput']"));
		dateofbirth.click();
		Thread.sleep(2000);
		
		WebElement august = driver.findElement(By.xpath("//option[contains(text(),'August')]"));
		august.click();
		Thread.sleep(2000);
		
		WebElement year = driver.findElement(By.xpath("//option[contains(text(),'2002')]"));
		year.click();
		Thread.sleep(2000);
		
		WebElement number = driver.findElement(By.xpath("//div[contains(text(),'23')]"));
		number.click();
		Thread.sleep(2000);
		
		WebElement subject = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]"));
		//subjects.clear(); Command
		subject.click();
		Thread.sleep(2000);
		
		WebElement hobbies = driver.findElement(By.xpath("//label[contains(text(),'Reading')]"));
		hobbies.click();
		Thread.sleep(3000);
		
		WebElement currentaddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		currentaddress.sendKeys("India");
		Thread.sleep(5000);
		
		WebElement location2 = driver.findElement(By.xpath("//label[@id='stateCity-label']"));
		js.executeScript("arguments[0].scrollIntoView(true);", location2);
		Thread.sleep(5000);
		
		WebElement state = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[10]/div[2]/div[1]/div[1]/div[2]/div[1]/*[1]"));
		state.click();
		Thread.sleep(3000);
		
		WebElement select = driver.findElement(By.xpath("//div[contains(text(),'NCR')]"));
		select.click();
		Thread.sleep(3000);
		
		WebElement city = driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[10]/div[3]/div[1]/div[1]/div[2]/div[1]/*[1]"));
		city.click();
		Thread.sleep(3000);
		
		WebElement agra = driver.findElement(By.xpath("//div[contains(text(),'Delhi')]"));
		agra.click();
		Thread.sleep(3000);
		
		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();
		Thread.sleep(5000);
		
	}

}
