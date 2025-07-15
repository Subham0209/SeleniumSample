package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class Selenium_Test {

     WebDriver driver;

     @BeforeClass
     public void setup() {
     WebDriverManager.chromedriver().setup();
     driver = new ChromeDriver();
 }

     @Test
     public void googleSearchTest() {
     driver.get("https://www.westerndigital.com");

     /*WebElement searchBox = driver.findElement(By.name("q"));
     searchBox.sendKeys("TestNG with Selenium");
     searchBox.submit();

     // Add basic wait (for demo only)
     try {
         Thread.sleep(2000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }*/

     /*String title = driver.getTitle();
     System.out.println("Page Title: " + title);
     assert title.toLowerCase().contains("testng with selenium");*/
 }

     @AfterClass
     public void tearDown() {
     if (driver != null) {
         driver.quit();
     }
 }
}

